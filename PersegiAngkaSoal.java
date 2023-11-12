import java.util.Scanner;
public class PersegiAngkaSoal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Masukkan angka: "); // Memberi perintah untuk memasukan nilai yang ingin diolah
        int N = scanner.nextInt(); // Deklarasi Untuk Nilai Yang Akan Diolah

        
            for(int i = 1; i <= N; i++){ // Membuat perulangan baris persegi angka (Loop)
                for(int j = 1; j <= N; j++){ // Membuat perulangan kolom persegi angka (Loop)
                    if(i > 1 && i < N && j > 1 && j < N ){ // Kode program yang mengidentifikasi area dalam persegi yang tidak ada angka (area yang dispasi)
                        System.out.print("  "); // Mencetak dua spasi untuk mengisi area itu
                }else{
                    System.out.print(N+" "); // Mencetak nilai N diikuti dengan spasi pada area itu
                }
            } 
            System.out.println(); // Sebagai pemisah baris dalam tampilan persegi
        }
        }
    }