package main.java.app.Utalities;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {

    /* Write json file to store order ID*/
    @SuppressWarnings("unchecked")
    public void writeOrderIdInJsonFile(String id) {
        //Creating a JSONObject object
        JSONObject jsonObject= new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("Id", id);

        try {
            FileWriter file = new FileWriter("ApiTestData\\order_detail.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Order Id is stored in order_detail Json file: "+jsonObject);
    }


}
