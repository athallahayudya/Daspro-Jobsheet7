import java.util.Scanner;
public class Pelanggan06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nama;
        char jawab;
        int jml = 0;
        do{
            System.out.print("Masukkan nama pelanggan: ");
            nama = scan.nextLine();
            jml++;
            System.out.print("Apakah anda ingin memasukkan nama pelangga baru (Y/T)? ");
            jawab = scan.nextLine().charAt(0);
       } while (jawab == 'Y' || jawab == 'y');

        System.out.printf("Jumlah pelanggan yang Anda masukkan = " + jml);
    }
}