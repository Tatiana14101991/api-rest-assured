import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;

/**
 * Created by Tanya
 */
public class usersTest {

    @Test
    public void apiTest(){
        //дано
        given()
                //тело
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                //заголовок
                .header("Content-Type", "application/json")
                //   .header("Accept", ContentType.JSON.getAcceptHeader())
                //отправь сюда запрос
                .post("https://reqres.in/api/login")
                //тогда статус 200 и залогируй
                .then().statusCode(200).log().all();


    }




}
