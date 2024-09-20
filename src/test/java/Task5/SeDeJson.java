package Task5;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.Data;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


@Data
public class SeDeJson {
    public int userId;
    public int id;
    public String title;
    public String body;

    public SeDeJson(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }


    @Test
    public static void test(){
        SeDeJson son = new SeDeJson(2,34,"sai","kiran");

        //serila
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(son);
        System.out.println("Serilization process :---\n"+json);


        //deserilization
        SeDeJson gson1 = gson.fromJson(json, SeDeJson.class);
        System.out.println("Desrilization process :---\n"+gson1);
    }


    @Test
    public static void desrilizationTest() {

        SeDeJson gson = new SeDeJson(2443, 344, "jrv", "sai");

        Response putRes = given()
                .header("Content-Type", "application/json")
                .body(gson)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1");
        String s = putRes.body().prettyPrint();
        System.out.println(s);

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        SeDeJson gson2 = gson1.fromJson(s, SeDeJson.class);
        System.out.println("desrilization process :---\n" + gson2);

    }


    @Test
    public static void restAssured() {
        SeDeJson gson = new SeDeJson(23, 344, "tyy", "sdf");

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts/1";
        Response response = RestAssured.given().header("Content-Type", "application/json").body(gson).when().put()
                .then().extract().response();
        int i = response.statusCode();
        System.out.println(i);
        String strResponse = response.getBody().asPrettyString();
        System.out.println(strResponse);

        SeDeJson seDeJson = response.getBody().as(SeDeJson.class);
        System.out.println(seDeJson.getId());
//        SeDeJson res = response.as(SeDeJson.class);
//        System.out.println(res.getId());

    }
}
