import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.*;


@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person implements Serializable {
    private int id;
    private String name;
    private String phone;
    @XmlElementWrapper(name = "emails")
    @XmlElement(name = "email")
    private List<String> emails;

    Person(){}

    public Person(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String toString(){
        return String.format("id: %s, name: %s, phone: %s",id, name, phone);
    }
}
