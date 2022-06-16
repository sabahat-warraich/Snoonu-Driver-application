package main.java.app.Utalities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {

    //read content data json file and get content for video file

        public String[] readJson() throws FileNotFoundException {

            // JSON parser object to parse read file
            JSONParser jsonParser = new JSONParser();

            String[] dataArray = new String[0];
            try (FileReader reader = new FileReader("TestData\\login.json")) {
                // Read JSON file
                Object obj = jsonParser.parse(reader);

                JSONArray loginList = (JSONArray) obj;
                dataArray = new String[loginList.size()];
                System.out.println(loginList);

                for (int i = 0; i < loginList.size(); i++) {
                    JSONObject driver = (JSONObject) loginList.get(i);
                    System.out.println("Users -> " + driver);//This prints every block - one json object
                    JSONObject user = (JSONObject) driver.get("login");
                    System.out.println("User -> " + user); //This prints each data in the block
                    String username = (String) user.get("email");
                    String password = (String) user.get("password");
                    dataArray[i] = username + "," + password;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return dataArray;

        }
        }