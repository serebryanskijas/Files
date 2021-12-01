import java.io.*;
import java.util.Arrays;
// дублирование для упрощения
public class RWPersons {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    static void write() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/date/file2.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person person = new Person(1, "Alex", "+375292003472");
        person.setEmails(Arrays.asList("1@mail.com", "2@mail.com", "3@mail.com", "4@mail.com"));


        Person person2 = new Person(1, "Dima", "+375292003473");
        person2.setEmails(Arrays.asList("11@mail.com", "22@mail.com", "33@mail.com", "44@mail.com"));

        Persons persons = new Persons();
        persons.addPerson(person);
        persons.addPerson(person2);
        oos.writeObject(persons);
        oos.close();
        fos.close();
    }

    static void read() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/date/file2.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Persons persons = (Persons) ois.readObject();
        persons.getPersons().forEach(person -> System.out.println(person.toString()));

    }
}
