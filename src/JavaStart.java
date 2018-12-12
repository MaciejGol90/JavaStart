import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaStart {

    public static void main(String[] args) throws FileNotFoundException {

       /* Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = odczyt.nextLine();

        if ("Maciek".equals(imie)) {
            System.out.println("Siema " + imie);
        } else if ("Zosia".equals(imie)) {
            System.out.println("Siema " + imie);
        } else {
            System.out.println("sory nie kojarze");
        }*/

        File imiona = new File("imiona.txt");
        Scanner in = new Scanner(imiona);

        String zdanie = in.nextLine();
        System.out.println(zdanie);

    }
}


     /*   System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");
    }*/

