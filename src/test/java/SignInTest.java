package test.java;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import main.java.app.config.BaseClass;
import main.java.app.pages.HomePage;
import main.java.app.pages.OrderPage;
import main.java.app.pages.SigninPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends BaseClass {

     SigninPage signinObj;
     OrderPage orderObj;
     HomePage homeObj;

     @BeforeMethod
    public void signinInitialization(){

         signinObj = new SigninPage();
         orderObj=new OrderPage();
         homeObj=new HomePage();
     }

     @Test
     @Description("Test Description : Driver should be able to login successfully" +
             "Verify that driver is able to navigate the menu on left.")
     @Story("As a driver I need to login successfully to driver app and I should be able to navigate to the" +
             "menu on left")
    public void enter_SignIn_Details_And_Click_On_SignIn_Button(){
         signinObj.enterSigninDetails(email, password);
         signinObj.clickOnSignInButton();
         homeObj.clickOnMenuButton();

     }

    @Test
    @Description("Test Description : Driver should be able to view their task history")
    @Story("As a driver I need to see my task history")
    public void view_Task_History(){
        signinObj.enterSigninDetails(email, password);
        signinObj.clickOnSignInButton();
        homeObj.clickOnMenuButton();
        homeObj.clickTaskHistoryButton();

    }

    @Test
    @Description("Test Description : Driver should be able to view balance details on Agent portal")
    @Story("As a driver I need to see my balance")
    public void view_balance_details_On_Agent_Portal(){
        signinObj.enterSigninDetails(email, password);
        signinObj.clickOnSignInButton();
        homeObj.clickOnMenuButton();
        homeObj.clickAgentPortalButton();
    }

    @Test
    @Description("Test Description : Driver should be able to view their shift schedule on the app")
    @Story("As a driver I need to view my schedule")
    public void view_driver_schedule(){
        signinObj.enterSigninDetails(email, password);
        signinObj.clickOnSignInButton();
        homeObj.clickOnMenuButton();
        homeObj.clickOnScheduleButton();

    }



    @Test
     @Description("Test Description: Verify that driver is able to Go Offline." +
             "Verify that driver is able to go On Line")
     @Story("As a driver I need to go online and off line")
    public void verify_Driver_Is_Able_to_GoOff_And_GoOnLine(){
        signinObj.enterSigninDetails(email, password);
        signinObj.clickOnSignInButton();
        Boolean res=homeObj.clickGoOffLine();
        Assert.assertTrue(res,"Driver is unable to go off line");
         boolean result= homeObj.clickGoOnLineButton();
         Assert.assertTrue(result, "Driver is unable to go online");
    }


    @Test
    @Description("Test description : Driver should be able to receive and accept the order" +
            "Validate that after receiving the order, a driver sees an action button for “Arrived at Pickup"+
            "Validate that after Picking up the order, a driver sees an action button for 'Arrived at Destination'" +
            "Verify the driver is able to complete delivery successfully after complete successfull")
    public void accept_New_Order(){
        signinObj.enterSigninDetails(email, password);
        signinObj.clickOnSignInButton();
        orderObj.clickOnAcceptOrderButton();
        orderObj.clickOnArrivedAtPickup();
        orderObj.clickOnCompletePickUp();
        orderObj.clickOnArrivedAtDestination();
        orderObj.clickOnCompleteOrder();

    }

    @Test
    @Description("Test description :Validate that the driver can proceed without " +
            "using 'Arrived at Pickup' as well since its not mandatory")
    @Story("As a driver I need to proceed with out arrived at pickup")
    public void verify_driver_Can_Procced_WithOut_ArrivedAtPickup(){
        signinObj.enterSigninDetails(email, password);
        signinObj.clickOnSignInButton();
        orderObj.clickOnAcceptOrderButton();
        orderObj.clickOnCompletePickUp();


    }

    @Test
    @Description("Test description :Validate that the driver can proceed without " +
            "utilizing 'Arrived at Destination' feature as well since its not mandatory")
    public void verify_driver_Can_Procced_WithOut_ArrivedAtDestination(){
        signinObj.enterSigninDetails(email, password);
        signinObj.clickOnSignInButton();
        orderObj.clickOnAcceptOrderButton();
        orderObj.clickOnArrivedAtPickup();
        orderObj.clickOnCompletePickUp();
        orderObj.clickOnCompleteOrder();


    }

    @Test
    @Description("Test description: Verify the user is able to decline an order")
    @Severity(SeverityLevel.BLOCKER)
    @Story("As a driver I need to cancel new order")
    public void decline_New_Order(){
        signinObj.enterSigninDetails(email, password);
        signinObj.clickOnSignInButton();
        homeObj.cancelOrder();
    }

    @Test
    @Description("Test Description : Verify that connectivity icon should be displayed on top right" +
            " while user is connected to the internet.")
    @Severity(SeverityLevel.NORMAL)
    @Story("As a driver I need to see connectivity icon when I am online")
    public void check_nternet_Connectivity_Icon(){
        signinObj.enterSigninDetails(email, password);
        signinObj.clickOnSignInButton();
        boolean result=homeObj.checkInternetConnectivityIcon();
        Assert.assertTrue(result,"Driver is not connected with Internet");
    }
}
