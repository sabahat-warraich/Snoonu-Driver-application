package main.java.app.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import main.java.app.Utalities.WaitUtail;
import main.java.app.config.AppDriver;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static main.java.app.config.BaseClass.driver;

public class SigninPage {

    public SigninPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    WebDriverWait wait= new WebDriverWait(AppDriver.getDriver(), WaitUtail.explicit_Wait);

    //Email input field locator
    @AndroidFindBy(xpath="//android.widget.EditText[@text='E-mail']")
    private AndroidElement emailInputField;


    //Password input field locator
    @AndroidFindBy (xpath="//android.widget.EditText[@text='Password']")
    private AndroidElement passInputField;

    //Signin button locator
    @AndroidFindBy(accessibility = "Sign in")
    private AndroidElement signInBtn;

    public void enterSigninDetails(String email, String pass){
        String psource= driver.getPageSource();
        System.out.println(psource);
        wait.until(ExpectedConditions.elementToBeClickable(emailInputField));
        emailInputField.click();
        driver.navigate().back();
        emailInputField.sendKeys(email);
        passInputField.click();
        passInputField.sendKeys(pass);
        driver.navigate().back();
    }

    public void clickOnSignInButton(){
        try {
            signInBtn.click();
            Thread.sleep(10000);
            String psource= driver.getPageSource();
            System.out.println(psource);
        }
        catch (ElementClickInterceptedException e){
            System.out.println("Element is not clickable in one click");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
