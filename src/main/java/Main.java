import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Ekspres ekspres = new Ekspres();
        Napoj espresso = new Napoj("espresso", 1, 2, 0);
        Napoj capuccino = new Napoj("capuccino", 0, 1, 2);
        Napoj americano = new Napoj("americano", 2, 2, 0);

        while (true) {
            System.out.println("Jaką czynność chcesz wykonać?\n" +
                    "    [1] Przygotowanie espresso\n" +
                    "    [2] Przygotowanie cappuccino\n" +
                    "    [3] Przygotowanie americano\n" +
                    "    [4] Uzupełnienie składników");

            Scanner scanner = new Scanner(System.in);
            String wybor = scanner.nextLine();

            switch (wybor) {
                case "1":
                    ekspres.przygotujNapoj(espresso);
                    break;
                case "2":
                    ekspres.przygotujNapoj(capuccino);
                    break;
                case "3":
                    ekspres.przygotujNapoj(americano);
                    break;
                case "4":
                    ekspres.uzupelnijSkladniki();
                    break;
            }
        }
    }
}
