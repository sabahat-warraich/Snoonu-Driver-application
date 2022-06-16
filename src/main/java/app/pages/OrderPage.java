package main.java.app.pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import main.java.app.Utalities.WaitUtail;
import main.java.app.config.AppDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static main.java.app.config.BaseClass.driver;

public class OrderPage {
    public  OrderPage () {
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }
        WebDriverWait wait= new WebDriverWait(AppDriver.getDriver(), WaitUtail.explicit_Wait);

    //Accept order button locator
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Accept Order']")
    private AndroidElement acceptOrderBtn;

    // Connectivity icon button locator
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    private AndroidElement connectivityIcon;

    //Order detail page locator
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.ScrollView")
    private AndroidElement orderDetailPage;

    //Arrived at pickup button locator
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Arrived at Pick up\"]")
    private AndroidElement arrivedAtPickUpBtn;

    //Arrived at destination button locator
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Arrived at Destination\"]")
    private AndroidElement arrivedAtDestinaionBtn;

    //complete pickup button locator
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.ScrollView/android.view.View/android.view.View/android.view.View[3]")
    private AndroidElement completePickUpBtn;

    //complete pickup button endpoint locator
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Zoom in\"]")
    private AndroidElement completePickupEndPoint;

    //Complete delivery button locator
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.ScrollView/android.view.View/android.view.View/android.view.View[3]")
    private AndroidElement completeDeliveryBtn;

    //Successful delivery message
    @AndroidFindBy(accessibility = "You've successfully delivered the order. Thank you!")
    private AndroidElement successfulDeliveryMsg;

    public void clickOnAcceptOrderButton(){
        wait.until(ExpectedConditions.elementToBeClickable(acceptOrderBtn));
        acceptOrderBtn.click();
    }
    public void scrollUpOderPage(){
        int endX = orderDetailPage.getLocation().getX() + (orderDetailPage.getSize().getWidth() / 2);
        int endY = orderDetailPage.getLocation().getY() + (orderDetailPage.getSize().getHeight() / 2);
        int startX = connectivityIcon.getLocation().getX() + (connectivityIcon.getSize().getWidth() / 2);
        int startY = connectivityIcon.getLocation().getY() + (connectivityIcon.getSize().getHeight() / 2);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();

    }

    public void clickOnArrivedAtPickup(){
      //  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"Arrived at Pick up"+"\").instance(0))");
        wait.until(ExpectedConditions.elementToBeClickable(arrivedAtPickUpBtn));
        arrivedAtPickUpBtn.click();
    }
    public void swipeToCompletePickUpButton(){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"amount to collect"+"\").instance(0))");
       /* int startX = arrivedAtPickUpBtn.getLocation().getX() + (arrivedAtPickUpBtn.getSize().getWidth() / 2);
        int startY = arrivedAtPickUpBtn.getLocation().getY() + (arrivedAtPickUpBtn.getSize().getHeight() / 2);
        int endX = completePickUpBtn.getLocation().getX() + (completePickUpBtn.getSize().getWidth() / 2);
        int endY = completePickUpBtn.getLocation().getY() + (completePickUpBtn.getSize().getHeight() / 2);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();*/

    }
    public void clickOnCompletePickUp(){
        wait.until(ExpectedConditions.visibilityOf(completePickUpBtn));
        int startX = completePickUpBtn.getLocation().getX() + (completePickUpBtn.getSize().getWidth() / 2);
        int startY = completePickUpBtn.getLocation().getY() + (completePickUpBtn.getSize().getHeight() / 2);
        int endX = completePickupEndPoint.getLocation().getX() + (completePickupEndPoint.getSize().getWidth() / 2);
        int endY = completePickupEndPoint.getLocation().getY() + (completePickupEndPoint.getSize().getHeight() / 2);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }
    public void clickOnArrivedAtDestination(){
        wait.until(ExpectedConditions.elementToBeClickable(arrivedAtDestinaionBtn));
        arrivedAtDestinaionBtn.click();
    }
    public void clickOnCompleteOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(completeDeliveryBtn));
        int startX = completeDeliveryBtn.getLocation().getX() + (completeDeliveryBtn.getSize().getWidth() / 2);
        int startY = completeDeliveryBtn.getLocation().getY() + (completeDeliveryBtn.getSize().getHeight() / 2);
        int endX =   completePickupEndPoint.getLocation().getX() + (completePickupEndPoint.getSize().getWidth() / 2);
        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }


}
