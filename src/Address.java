import java.io.Serializable;

/**
 * Class Address
 *
 * @author Grzegorz Chaś {@literal <gchas@soft-project.pl>}
 */
public class Address implements Serializable {

    private String ulica;
    private String numer;

    public Address(String ulica, String numer) {
        this.ulica = ulica;
        this.numer = numer;
    }

    public String getUlica() {
        return ulica;
    }

    public String getNumer() {
        return numer;
    }

}
