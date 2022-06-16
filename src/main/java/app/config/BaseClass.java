package main.java.app.config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseClass {

        public static AndroidDriver<AndroidElement> driver;

        //Test data variables
        public static String email, password;
/*
    public static AppiumDriverLocalService service;

    public AppiumDriverLocalService startServer(){
        boolean flag = checkIfServerIsRunnning(4723);
        if(!flag) {
            service = AppiumDriverLocalService.buildDefaultService();
            service.start();
        }
        return service;
    }

    public static boolean checkIfServerIsRunnning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(port);

            serverSocket.close();
        } catch (IOException e) {
            //If control comes here, then it means that the port is in use
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }

*/
        @BeforeMethod
        public void setup() throws MalformedURLException {
 //               service = startServer();

                DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("platformName", "Android");
            //	cap.setCapability("adbExecTimeout", 50000);
            cap.setCapability("platformVersion", "11");
            //	cap.setCapability("deviceName", "emulator-5554");
            cap.setCapability("deviceName", "OFJNNFNRAQM7TODM");
            cap.setCapability("appPackage", "com.oryx.falcon_flex_driver.staging");
            cap.setCapability("appActivity", "com.oryx.falcon_flex_driver.MainActivity");
            cap.setCapability("autoGrantPermissions", "true");
        //	cap.setCapability("unicodeKeyboard", true);
         //   cap.setCapability("resetKeyboard", true);

            driver = new AndroidDriver<>(new URL("http://127.0.0.2:4723/wd/hub"), cap);
            AppDriver.setDriver(driver);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

    @SuppressWarnings("unchecked")
    @BeforeClass
    public void readJson() {

        // JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(".\\TestData\\logindata.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray loginList = (JSONArray) obj;
            System.out.println(loginList);

            // Iterate over login array
            loginList.forEach(emp -> parseLoginObject((JSONObject) emp));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseLoginObject(JSONObject login) {
        // Get object within list
        JSONObject LoginObject = (JSONObject) login.get("login");
        // Get first mobile number
        email = (String) LoginObject.get("email");
        password = (String) LoginObject.get("password");
    }

//	@AfterMethod
//	public void tearDown() {
//
//		driver.quit();
//
//	}

    }


