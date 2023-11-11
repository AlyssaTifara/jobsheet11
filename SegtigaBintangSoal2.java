import java.util.Scanner;
public class SegtigaBintangSoal2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan nilai N (minimal 5): ");
        int N = input.nextInt();

        if (N < 5) {
            System.out.println("Nilai N minimal harus 5 atau lebih.");
        } else {
            // Loop untuk setiap baris segitiga
            for (int i = N; i >= 1; i--) {
                // Loop untuk mencetak bintang pada setiap baris
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // Pindah ke baris baru setelah mencetak bintang pada baris tersebut
                System.out.println();
            }
        }
    }
}