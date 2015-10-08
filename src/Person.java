import java.io.Serializable;

/**
 * Class Person
 *
 * @author Grzegorz Chaś {@literal <gchas@soft-project.pl>}
 */
public class Person implements Serializable {

    private String imie;
    private String nazwisko;
    private String age;

    private Address address;

    public Person(String imie, String nazwisko, String age, Address address) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.age = age;
        this.address = address;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
