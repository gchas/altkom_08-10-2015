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

    public Person(String imie, String nazwisko, String age) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.age = age;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
