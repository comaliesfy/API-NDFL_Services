package API;

import JSONCreator.ClientRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class API_NDFL {

    public static final String BASE_URL = "https://app2report-ci02025377-dev-kapun.apps.test-ose.sigma.sbrf.ru/app2report/report";
    ClientRequest cl = new ClientRequest();

    public void returnClient() {
        Response response = RestAssured.given()
                .header("iv-user", "iv-user")
                .contentType(ContentType.JSON)
                .body(cl.requestToJson())
                .post(BASE_URL);
        assertEquals(200, response.getStatusCode());
        System.out.print(response.getBody().asString());
    }

    public void uploadFile(String filename) {
        Response response = RestAssured.given()
                .header("iv-user", "iv-user")
                .contentType("multipart/form-data")
                .multiPart("file", new File(filename))
                .when()
                .put(BASE_URL);
        //Добавить логгер
       System.out.print(response.getBody().asString());

    }
}

