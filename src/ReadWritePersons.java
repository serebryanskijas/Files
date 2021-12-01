import java.io.*;
import java.util.Arrays;

public class ReadWritePersons {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/date/file.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person(1, "Alex", "+375292003472");
        person.setEmails(Arrays.asList("1@mail.com", "2@mail.com", "3@mail.com", "4@mail.com"));
        oos.writeObject(person);

        Person person2 = new Person(1, "Dima", "+375292003473");
        person2.setEmails(Arrays.asList("11@mail.com", "22@mail.com", "33@mail.com", "44@mail.com"));
        oos.writeObject(person2);
        oos.close();
        fos.close();
    }

    static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/date/file.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = null;
        try {

            while ((person = (Person) ois.readObject()) != null) {
                System.out.println(person.toString());
            }
        } catch (EOFException e) {

        }
    }
}
