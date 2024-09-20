package M5_REST_API.Task6;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import lombok.Data;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.logging.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


@Data
public class Testesting {

    Logger logger = Logger.getLogger("M5_api");
    @org.testng.annotations.Test
    public void getCall() {

        logger.info("test starts");
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .pathParam("mypath","findByStatus")
                .queryParam("status", "available")
                .when()
                .get("https://petstore.swagger.io/v2/pet/{path}");

        int i = response.statusCode();
        String s = response.body().prettyPrint();
        System.out.println("Response body : " + s);
        Assert.assertEquals(i, 200);
//        Assert.assertEquals(response.jsonPath().get("[0].category.name").toString(), "dogz");
//        Assert.assertEquals(response.jsonPath().get("[0].category.description").toString(), "string");
        Assert.assertEquals(response.header("Content-Type"), "application/json");
        Headers headers = response.getHeaders();
        for (Header header : headers) {
            System.out.println(header.getName()+" : "+header.getValue());
        }
        System.out.println(i);

    }

    @Test
    public void postCall() throws JsonProcessingException {
        ArrayList<Tag> list = new ArrayList();
        list.add(new Tag(1, "test"));
        list.add(new Tag(2, "test"));
        Category c = new Category(6,"sai");

        Root root = new Root();
        root.setId(4);
        root.setTags(list);
        root.setCategory(c);
        root.setStatus("available");
        root.setName("jrv");
        root.setPhotoUrls();
        System.out.println("======="+root);

        ObjectMapper o = new ObjectMapper();
        String s1 = o.writerWithDefaultPrettyPrinter().writeValueAsString(root);
//        System.out.println(s1);


        logger.info("postCall test starts");
        Response res = given()
                .header("Content-Type", "application/json")
                .header("accept", "application/json")
                .body(root)
                .when()
                .post("https://petstore.swagger.io/v2/pet");
        int i = res.statusCode();
        String s = res.getBody().prettyPrint();
        System.out.println(s);
        System.out.println(i);

    }

    @org.testng.annotations.Test
    public void deleteCall() {

        given()
                .header("Content-Type", "application/json")
                .when()
                .delete("https://petstore.swagger.io/v2/pet/9223372036854658450")
                .then()
                .statusCode(200);

    }




}
