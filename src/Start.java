import java.io.Serializable;

/**
 * Class Start
 *
 * @author Grzegorz Chaś {@literal <gchas@soft-project.pl>}
 */
public class Start implements Serializable {

    public static void main(String [] args) {

        Person person = new Person("john", "kowalski", "56");

        System.out.println("imie: " + person.getImie());
        System.out.println("nazwisko: " + person.getNazwisko());
        System.out.println("wiek: " + person.getAge());
    }
}
