import java.util.Scanner;

public class JavaStart {

    public static void main(String[] args) {

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = odczyt.nextLine();

        if ("Maciek".equals(imie)) {
            System.out.println("Siema " + imie);
        } else if ("Zosia".equals(imie)) {
            System.out.println("Siema " + imie);
        } else {
            System.out.println("sory nie kojarze");
        }
    }
}


     /*   System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");
    }*/

