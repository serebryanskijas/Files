import java.io.*;

public class WriteBinFile {
    public static void main(String[] args) {
        String s = "0101110100 kjhdasfbkjbdfas";
        byte[] buffer = s.getBytes();
        String fileName = "src/date/bin.bin";
        try (FileOutputStream fos= new FileOutputStream(fileName,false);
             DataOutputStream dos = new DataOutputStream(fos)){
            dos.writeUTF(s);
            dos.writeDouble(3.14);
            dos.writeInt(10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
