import java.util.Scanner;

public class ReversedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] bilangan = new int[4];

        System.out.println("Isi nya ada " + bilangan.length);
        for (int alpha = 0; alpha < 4; alpha++) {
            System.out.print("Masukkan Bilangan ke-" + alpha + ": ");
            bilangan[alpha] = scan.nextInt();
        }

        System.out.println("-----------------------------");

        for (int alpha = 3; alpha >= 0; alpha--) {
            System.out.println("Isi bilangan ke-" + alpha + " adalah : " + bilangan[alpha]);
        }
        if (scan != null) {
            scan.close();
        }
    }
}