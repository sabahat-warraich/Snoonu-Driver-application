package main.java.app.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.java.app.Utalities.WaitUtail;
import main.java.app.config.AppDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public  HomePage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    WebDriverWait wait= new WebDriverWait(AppDriver.getDriver(), WaitUtail.explicit_Wait);

    //go off line button locator
    @AndroidFindBy(accessibility = "Go Offline")
    private AndroidElement goOffLineBtn;

    //go on line button locator

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Go Online']")
    private AndroidElement goOnLineBtn;

    //Menu Icon button locaotor
   // @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
    @AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.view.View")
    private AndroidElement menuIcon;

    // Connectivity icon button locator
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    private AndroidElement connectivityIcon;

    //Decline order button locator
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Decline\"]")
    private AndroidElement declineOrder;

    //Task history button locator
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Task History\"]")
    private AndroidElement taskHistoryBtn;

    //Agent portal button locator
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Agent Portal\"]")
    private AndroidElement agentPortalBtn;

    //Schedule button locator
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Schedule\"]")
    private AndroidElement scheduleBtn;


    public void cancelOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(declineOrder));
        declineOrder.click();
    }

    public boolean checkInternetConnectivityIcon(){
        wait.until(ExpectedConditions.visibilityOf(connectivityIcon));
        boolean res=connectivityIcon.isDisplayed();
        return res;
    }

    public boolean clickGoOffLine(){
        wait.until(ExpectedConditions.elementToBeClickable(goOffLineBtn));
        goOffLineBtn.click();
        wait.until(ExpectedConditions.visibilityOf(goOnLineBtn));
        Boolean res=goOnLineBtn.isDisplayed();
        return res;
    }

    public boolean clickGoOnLineButton(){
        wait.until(ExpectedConditions.elementToBeClickable(goOnLineBtn));
        goOnLineBtn.click();
        wait.until(ExpectedConditions.visibilityOf(goOffLineBtn));
        Boolean res=goOffLineBtn.isDisplayed();
        return res;
    }

    public void clickOnMenuButton(){
        wait.until(ExpectedConditions.elementToBeClickable(menuIcon));
        menuIcon.click();
    }

    public void clickTaskHistoryButton(){
        wait.until(ExpectedConditions.elementToBeClickable(taskHistoryBtn));
        taskHistoryBtn.click();
    }

    public void clickAgentPortalButton(){
        wait.until(ExpectedConditions.elementToBeClickable(agentPortalBtn));
        agentPortalBtn.click();
    }

    public void clickOnScheduleButton(){
        wait.until(ExpectedConditions.elementToBeClickable(scheduleBtn));
        scheduleBtn.click();
    }




}
