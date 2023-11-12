import java.util.Arrays;
import java.util.Scanner;
public class AtlelSoal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String atlet[][] = new String[4][6]; // Deklarasi untuk menyimpan data atlet dari berbagai cabor
        String cabor, nama;

        for(int i = 0; i < atlet.length; i++){ // Membuat perulangan baris
            System.out.println("Cabang olahraga ke-"+(i+1)+": ");
            atlet[i][0] = input.nextLine(); // Memerintahkan untuk memasukkan jenis cabor 
            
            for(int j = 1; j< atlet[i].length; j++){ // Membuat perulangan kolom
                System.out.println("Nama atlet ke-"+j+": ");
                atlet[i][j] = input.nextLine(); // Memerintahkan untuk memasukkan nama atlet 
            }
        }
        for (int i = 0; i < atlet.length; i++) {
            Arrays.sort(atlet[i], 1, atlet[i].length); // Mengurutkan nama atlet di setiap cabor dari huruf A-Z
        }

        
        System.out.println("Data Atlet:"); // Menampilkan isi data yang sudah diintupkan
        for (int i = 0; i < atlet.length; i++) { 
            System.out.println("Cabang Olahraga ke-" + (i + 1)+" "+atlet[i][0]); // Menampilkan urutan cabor yang telah diinput
            System.out.println("Daftar Atlet: "); // Menampilkan nama atlet
            for (int j = 1; j < atlet[i].length; j++) {
                System.out.println(atlet[i][j]);
            }
            System.out.println();// Menampilkan data atlet dalam urutan yang telah diurutkan sebelumnya
        }
    }
}