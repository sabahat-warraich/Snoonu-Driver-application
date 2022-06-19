package main.java.app.RestApi;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import main.java.app.getTaskPojo.GetTask;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

public class GetTaskRequest extends CreateNewTaskRequest{
    CreateNewTaskRequest getOrder= new CreateNewTaskRequest();
    String delivery_Address;

    @Test
    public void getTaskInformation(){
        RestAssured.baseURI = "https://webgateway-staging-lb.falconflex.ai";
        RestAssured.basePath = "/trip-api/Task/";
        String[] res=getOrder.createNewTask();
        System.out.println("Access token : "+ res[0]);
        System.out.println("Order Id : "+ res[1]);

        Header acceptHeader = new Header("Accept", "application/json");
        Header contentTypeHeader = new Header("Content-Type", "application/json");
        Header authentication= new Header("Authorization", "Bearer "+res[0]);
        List<Header> headers = new ArrayList<>();
        headers.add(acceptHeader);
        headers.add(contentTypeHeader);
        headers.add(authentication);
        Headers allHeaders = new Headers(headers);
        httpRequest =  RestAssured.given().headers(allHeaders);
        GetTask response = httpRequest
                .queryParams("id",res[1])
                .when()
                .get()
                .as(GetTask.class);

        delivery_Address=response.getDelivery().getAddress();


        System.out.println("Delivery Address : "+ delivery_Address);

    }
}
