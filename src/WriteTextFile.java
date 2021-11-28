import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

    public static void main(String[] args) {
        String fileName = "src/date/date.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);
        } catch (IOException e) {
            // e.printStackTrace();
            System.err.println("Не удалось создать файл с именем date.txt");
            return;
        }
        String s = "что-нибудь для записи";
        try {
            fw.append(s);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}