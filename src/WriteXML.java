import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Arrays;

public class WriteXML {
    public static void main(String[] args) {
        //writePerson();
        writePersons();
    }

    public static void writePerson(){
        Person person = new Person(1, "Alex", "+375292003472");
        person.setEmails(Arrays.asList("1@mail.com", "2@mail.com", "3@mail.com"));

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            //Print XML String to file
            jaxbMarshaller.marshal(person, new File("src/date/person.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void writePersons(){
        Person person1 = new Person(1, "Tex", "+375292003473");
        person1.setEmails(Arrays.asList("111@mail.com", "222@mail.com", "333@mail.com"));
        Person person2 = new Person(2, "Mex", "+375292003474");
        person2.setEmails(Arrays.asList("11@mail.com", "22@mail.com", "33@mail.com"));
        Persons persons = new Persons();
        persons.addPerson(person1);
        persons.addPerson(person2);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            //Print XML String to file
            jaxbMarshaller.marshal(persons, new File("src/date/persons.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
