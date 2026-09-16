import java.util.Scanner;
public class KonversiNilai {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai angka (0 - 100): ");
        
        if (input.hasNextInt()) {
            int nilai = input.nextInt();

        
            if (nilai < 0 || nilai > 100) {
                System.out.println("Silakan masukkan nilai yang valid");
            } else if (nilai >= 85) {
                System.out.println("Nilai Huruf: A");
            } else if (nilai >= 70) {
                System.out.println("Nilai Huruf: B");
            } else if (nilai >= 55) {
                System.out.println("Nilai Huruf: C");
            } else if (nilai >= 40) {
                System.out.println("Nilai Huruf: D");
            } else {
                System.out.println("Nilai Huruf: E");
            }
        } else {
            System.out.println("Silakan masukkan nilai yang valid");
        }


    }
}