package main.java.app.Utalities;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonFileWriter {

    /* Write json file to store order ID*/
    @SuppressWarnings("unchecked")
    public void writeOrderIdInJsonFile(String id) {
        //Creating a JSONObject object
        JSONObject jsonObject= new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("taskIds", List.of(id));
        jsonObject.put("agentId", "6284aa044d32e28612f4bff2");

        try {
            FileWriter file = new FileWriter("ApiTestData\\assignTask.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Order Id is stored in order_detail Json file: "+jsonObject);
    }


}
