package test.java;

import main.java.app.Utalities.DataUtils;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class CheckJsonData {
    DataUtils testdata= new DataUtils();
    @Test()
    public void checkJsondata(String data) throws FileNotFoundException {
        String[] driverInfo=testdata.readJson();


        System.out.println("driver email is : "+ driverInfo[0]);
        System.out.println("driver pass is : "+ driverInfo[1]);
    }
}
