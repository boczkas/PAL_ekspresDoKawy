import java.util.HashMap;
import java.util.Map;

public class Napoj {
    private String nazwa;

    private Map<Skladnik, Integer> skladniki = new HashMap<>();

    public Napoj(String nazwa, Integer iloscWody, Integer iloscKawy, Integer iloscMleka) {
        this.nazwa = nazwa;
        skladniki.put(new Skladnik("Woda"), iloscWody);
        skladniki.put(new Skladnik("Kawa"), iloscKawy);
        skladniki.put(new Skladnik("Mleko"), iloscMleka);
    }

    int getWoda() {
        return skladniki.get(new Skladnik("Woda"));
    }

    int getKawa() {
        return skladniki.get(new Skladnik("Kawa"));
    }

    int getMleko() {
        return skladniki.get(new Skladnik("Mleko"));
    }

    String getNazwa() {
        return nazwa;
    }
}
