package Task5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.restassured.response.Response;
import lombok.Data;
import org.testng.Assert;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;
@Data
public class Test {
    public int userId;
    public int id;
    public String title;
    public String body;

    @org.testng.annotations.Test
    public void getData() {
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("https://jsonplaceholder.typicode.com/posts");

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().get("[0].userId").toString(),"1");
    }


    @org.testng.annotations.Test
    public void putData() {
        Test data = new Test();
        data.setUserId(45);
        data.setId(4);
        data.setTitle("Test Title");
        data.setBody("Test Body");

        Response putRes = given()
                .header("Content-Type", "application/json")
                .body(data)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1");
        String s = putRes.body().prettyPrint();
        System.out.println(s);
        Assert.assertEquals(putRes.getStatusCode(), 200);
        Assert.assertEquals(putRes.jsonPath().get("userId").toString(),String.valueOf(data.getUserId()));
        Assert.assertEquals(putRes.jsonPath().get("title").toString(),data.getTitle());
    }

    @org.testng.annotations.Test
    public void deleteData() {
        Response delete = given()
                .contentType("application/json")
                .when()
                .delete("https://jsonplaceholder.typicode.com/posts/1");

        String s = delete.body().prettyPrint();
        Assert.assertEquals(delete.statusCode(), 200);
    }



    @org.testng.annotations.Test
    public void postData() {
        Test data = new Test();
        data.setUserId(123);
        data.setId(345);
        data.setTitle("Test sai");
        data.setBody("Test kiran");

        Response putRes = given()
                .header("Content-Type", "application/json")
                .body(data)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts");
        String s = putRes.body().prettyPrint();
        System.out.println(s);
        Assert.assertEquals(putRes.getStatusCode(), 201);
        Assert.assertEquals(putRes.jsonPath().get("userId").toString(),String.valueOf(data.getUserId()));
        Assert.assertEquals(putRes.jsonPath().get("title").toString(),data.getTitle());
    }



    @org.testng.annotations.Test
    public void verifyAllEndPoints(){

        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"posts", "comments", "albums", "photos", "todos", "users"}));
        for (String s:list){
            Response response = given()
                    .contentType("application/json")
                    .when()
                    .get("https://jsonplaceholder.typicode.com/" + s);
            int validatableResponse = response.statusCode();
            System.out.println(validatableResponse);

            JSONObject jo = new JSONObject(response.body().asString());
            while(jo.keys().hasNext()){
                System.out.println(jo.get(jo.keys().next()));
            }

        }
    }

    @org.testng.annotations.Test
    public void serilization_PojoToJson() throws JsonProcessingException {
        Test data = new Test();
        data.setUserId(45);
        data.setId(4);
        data.setTitle("Test Title");
        data.setBody("Test Body");

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(data);
        System.out.println(s);

    }

    @org.testng.annotations.Test
    public void deserilization_JsonToPojo() throws JsonProcessingException {

        Test data = new Test();
        data.setUserId(123);
        data.setId(345);
        data.setTitle("Test sai");
        data.setBody("Test kiran");

        Response putRes = given()
//                .contentType("multipart/form-data")
//                .multiPart("file", new File(""))
                .header("Content-Type", "application/json")
                .body(data)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts");

        String s = putRes.body().prettyPrint();

        ObjectMapper mapper = new ObjectMapper();
        Test test = mapper.readValue(s, Test.class);
        String title1 = test.getTitle();
        String body1 = test.getBody();
        System.out.println(title1);


    }














}
