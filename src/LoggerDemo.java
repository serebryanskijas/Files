import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;

import java.util.logging.*;

public class LoggerDemo {

    private final static Logger logger = Logger.getLogger(LoggerDemo.class.getClass().getName());

    public static void main(String[] args) throws FileNotFoundException {

        FileReader file = new FileReader("src/date/Holidays.json");
        JSONTokener tokener = new JSONTokener(file);
        JSONArray holidays = new JSONArray(tokener);
        //System.out.println(holidays.get(0).toString());

        LogManager.getLogManager().reset(); //Не выводить в консоль
        FileHandler fh;
        try {
            // This block configure the logger with handler and formatter
            fh = new FileHandler("src/date/logFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.setLevel(Level.SEVERE);

        for (Object holiday : holidays) {
            String s = ((JSONObject) holiday).getString("name").toString();

            //logger.info(s);

            //logger.fine(s);

            logger.severe(s);
        }

        try {
            int s = 12 / 0;
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            logger.severe(e.getMessage());
        }
    }
}
