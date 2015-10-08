import java.io.Serializable;

/**
 * Class Start
 *
 * @author Grzegorz Chaś {@literal <gchas@soft-project.pl>}
 */
public class Start implements Serializable {

    public static void main(String [] args) {

        Address address = new Address("fiolkowa", "56");

        Person person = new Person("john", "kowalski", "56", address);

        System.out.println("imie: " + person.getImie());
        System.out.println("nazwisko: " + person.getNazwisko());
        System.out.println("wiek: " + person.getAge());

        System.out.println("address ulica: " + person.getAddress().getUlica());
        System.out.println("address numer: " + person.getAddress().getNumer());
    }
}
