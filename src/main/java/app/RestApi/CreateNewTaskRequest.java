package main.java.app.RestApi;

import io.restassured.RestAssured;
import io.restassured.http.Header;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import main.java.app.pojo.CreateNewTaskPojo;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CreateNewTaskRequest extends AuthenticateMemberLoginRequest {
    String accessToken;
    String id;
    RequestSpecification httpRequest;
    AuthenticateMemberLoginRequest authMember= new AuthenticateMemberLoginRequest();
    @Test
    public void createNewTask(){

        RestAssured.baseURI = "https://webgateway-staging-lb.falconflex.ai";
        RestAssured.basePath = "/trip-api/Task/";
        File body = new File(System.getProperty("user.dir") + "\\ApiTestData\\CreateNewTask.json");
        accessToken= authMember.authenticateMember();

        Header acceptHeader = new Header("Accept", "application/json");
        Header contentTypeHeader = new Header("Content-Type", "application/json");
        Header authentication= new Header("Authorization", "Bearer "+accessToken);
        List<Header> headers = new ArrayList<>();
        headers.add(acceptHeader);
        headers.add(contentTypeHeader);
        headers.add(authentication);
        Headers allHeaders = new Headers(headers);
        httpRequest =  RestAssured.given().headers(allHeaders);
        CreateNewTaskPojo response = httpRequest
                .body(body)
                .when()
                .post().as(CreateNewTaskPojo.class);
        id=response.getId();

        System.out.println("Order Id is : "+ id);
    }

}
