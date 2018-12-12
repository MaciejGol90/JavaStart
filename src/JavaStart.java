import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaStart {

    public static void main(String[] args) throws FileNotFoundException {

   /*    Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = odczyt.nextLine();

        if ("Maciek".equals(imie)) {
            System.out.println("Siema " + imie);
        } else if ("Zosia".equals(imie)) {
            System.out.println("Siema " + imie);
        } else {
            System.out.println("sory nie kojarze");


        File imiona = new File("imiona.txt");
        Scanner in = new Scanner(imie);

        String zdanie = in.nextLine();
        System.out.println(zdanie);

        PrintWriter zapis = new PrintWriter("imiona.txt");
        zapis.println(imie);
        zapis.close();
*/


   Scanner odczyt = new Scanner(System.in);
   int odlicznie;
        System.out.println("Podaj cas odliczania: ");
        for(odlicznie = odczyt.nextInt(); odlicznie>0; odlicznie--) {
            System.out.println("Wybuch za: " + odlicznie);
        }
            System.out.println("BUM");
        }
    }



     /*   System.out.println("Ania");
        System.out.println("Bartek");
        System.out.println("Kasia");
    }*/

