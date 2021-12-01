import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJSON {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/date/json.json");
            JSONTokener tokener = new JSONTokener(file);
            JSONObject obj = new JSONObject(tokener);
            //System.out.println(obj.toString(2));
            JSONArray persons = obj.getJSONArray("persons");
            for (int i=0; i< persons.length(); i++){
                JSONObject person = persons.getJSONObject(i);
                String name = person.getString("name");
                System.out.println(name);
                JSONArray emails = person.getJSONArray("emails");
                for (int j = 0; j < emails.length(); j++) {
                    System.out.println(emails.get(j));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
