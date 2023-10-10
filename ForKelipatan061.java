import java.util.Scanner;
public class ForKelipatan06 {

    public static void main(String[] args) {
        Scanner scan06 = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter=0;
        double rata_rata;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan06.nextInt();

        for (int i = 1; i <= 50; i++){
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
    
        }
            
        rata_rata = (double)jumlah/counter;
        

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata dari bilangan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rata_rata);
    }
}