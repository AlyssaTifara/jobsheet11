import java.util.Scanner;
public class SegtigaBintangSoal2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan nilai N (minimal 5): "); // Memberi perintah untuk memasukan nilai yang ingin diolah
        int N = input.nextInt(); // Deklarasi Untuk Nilai Yang Akan Diolah

        if (N < 5) {
            System.out.println("Nilai N minimal harus 5 atau lebih."); // Memberi batasan nilai 
        } else {
            for (int i = N; i >= 1; i--) { // Loop untuk setiap baris segitiga
                for (int j = 1; j <= i; j++) { // Loop untuk mencetak bintang pada setiap baris
                    System.out.print("*"); // Mencetak bintang
                }
                System.out.println(); // Perpindahan baris setelah mencetak bintang pada baris sebelumnya
            }
        }
    }
}