import java.util.HashMap;
import java.util.Map;

public class Ekspres {

    Map<Skladnik, Integer> zasobniki = new HashMap<>();

    private final Skladnik KAWA = new Skladnik("Kawa");
    private final Skladnik WODA = new Skladnik("Woda");
    private final Skladnik MLEKO = new Skladnik("Mleko");
    public Ekspres() {
        zasobniki.put(KAWA, 10);
        zasobniki.put(WODA, 10);
        zasobniki.put(MLEKO, 5);
    }

    public void przygotujNapoj(Napoj napoj) {
        Integer iloscKawy = zasobniki.get(KAWA);
        Integer iloscWody = zasobniki.get(WODA);
        Integer iloscMleka = zasobniki.get(MLEKO);

        if (iloscWody - napoj.getWoda() < 0
                || iloscKawy - napoj.getKawa() < 0
                || iloscMleka - napoj.getMleko() < 0) {
            System.out.println("Nie można przygotować " + napoj.getNazwa()
        + "! Brak składników!");
        } else {
            zasobniki.put(KAWA, iloscKawy - napoj.getKawa());
            zasobniki.put(WODA, iloscWody - napoj.getWoda());
            zasobniki.put(MLEKO, iloscMleka - napoj.getMleko());
            System.out.println("Przygotowywanie " + napoj.getNazwa() + "...");
        }
    }

    public void uzupelnijSkladniki() {
        Integer iloscKawy = zasobniki.get(KAWA);
        Integer iloscWody = zasobniki.get(WODA);
        Integer iloscMleka = zasobniki.get(MLEKO);

        System.out.println("Uzupełniono " + (10 - iloscKawy) + " jednostki kawy");
        System.out.println("Uzupełniono " + (10 - iloscWody) + " jednostki wody");
        System.out.println("Uzupełniono " + (5 - iloscMleka) + " jednostki mleka");

        zasobniki.put(KAWA, 10);
        zasobniki.put(WODA, 10);
        zasobniki.put(MLEKO, 5);
    }

    public int getIloscWody() {
        return zasobniki.get(WODA);
    }

    public int getIloscKawy() {
        return zasobniki.get(KAWA);
    }

    public int getIloscMleka() {
        return zasobniki.get(MLEKO);
    }
}
