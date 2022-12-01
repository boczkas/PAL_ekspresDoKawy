import java.util.Objects;

public class Skladnik {
    String nazwa;

    public Skladnik(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skladnik skladnik = (Skladnik) o;
        return Objects.equals(nazwa, skladnik.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa);
    }
}
