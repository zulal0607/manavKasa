import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz= 0.95, Patlıcan = 5.00;
        int kgArmut, kgElma, kgDomates, kgMuz, kgPatlıcan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? " );
        kgArmut = inp.nextInt();
        System.out.print("Elma kaç kilo ? ");
        kgElma = inp.nextInt();
        System.out.print("Domates kaç kilo ? ");
        kgDomates = inp.nextInt();
        System.out.print("Muz kaç kilo ? ");
        kgMuz = inp.nextInt();
        System.out.print("Patlican kaç kilo ? ");
        kgPatlıcan = inp.nextInt();

        double tutar = (kgArmut * Armut) + (kgElma * Elma) + (kgDomates * Domates) + (kgMuz * Muz) + (kgPatlıcan * Patlıcan);

        System.out.print("Toplam tutarınız : " + tutar);

    }
}
