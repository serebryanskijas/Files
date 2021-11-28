import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "src/date/date.txt";
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
            System.out.println(fr.getEncoding());
            String s;
            while ((s = br.readLine()) != null)
                sb.append(s).append(System.lineSeparator());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sb);
    }
}
