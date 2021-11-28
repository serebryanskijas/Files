import java.io.*;

public class ReadBinFile {
    public static void main(String[] args) {
        String fileName = "src/date/bin.bin";
        try (FileInputStream fis = new FileInputStream(fileName);
             DataInputStream dis = new DataInputStream(fis)){
                 String s = dis.readUTF();
                 double value = dis.readDouble();
                 int i = dis.readInt();
                 System.out.printf("text: %s, double: %f, int: %d%n", s,value,i);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
