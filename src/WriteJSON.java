import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {
    public static void main(String[] args) {
        FileWriter file= null;
        JSONObject main = new JSONObject();
        JSONArray persons = new JSONArray();
        main.put("persons", persons);
        JSONObject obj1 = new JSONObject();
        obj1.put("name", "Alex");
        obj1.put("phone", "+375292003472");
        persons.put(obj1);
        JSONArray emails1 = new JSONArray();
        emails1.put("dada@mail.ru");
        emails1.put("nene@mail.ru");
        obj1.put("emails",emails1);
        JSONObject obj2 = new JSONObject();
        obj2.put("name", "Danila");
        obj2.put("phone", "+375292003473");
        persons.put(obj2);
        JSONArray emails2 = new JSONArray();
        emails2.put("dado@mail.ru");
        emails2.put("neno@mail.ru");
        obj2.put("emails",emails2);
        try {
            file = new FileWriter("src/date/json.json");
            file.write(main.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {

                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
