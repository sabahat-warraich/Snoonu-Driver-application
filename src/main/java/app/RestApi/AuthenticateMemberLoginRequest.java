package main.java.app.RestApi;

import io.restassured.RestAssured;
import main.java.app.pojo.AuthenticateMemberPojo;




public class AuthenticateMemberLoginRequest {
    String access_token;
    public String authenticateMember(){

        String baseURI = "https://webgateway-staging-lb.falconflex.ai";
        String basePath = "/identity-api/login";

        AuthenticateMemberPojo response = RestAssured.given().
                 baseUri(baseURI)
                .basePath(basePath)
                .formParam("client_id","FalconFlexPortal")
                .formParam("client_secret", "SuperSecretPassword")
                .formParam("username","sabahat_test@gmail.com")
                .formParam("password","Sabahat@786")
                .formParam("grant_type","password")
                .post().as(AuthenticateMemberPojo.class);

        access_token=response.getAccessToken();

        return access_token;
    }
}
