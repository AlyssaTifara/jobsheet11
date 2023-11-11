import java.util.Scanner;
public class SegitigaTugas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Memberi Nilai Yang Akan Diolah 
        System.out.print("Masukkan Nilai N: "); // Memberi Perintah Untuk Memasukkan Nilai Yang Akan Diolah
        int N = scanner.nextInt(); // Deklarasi Untuk Nilai Yang Akan Diolah

        if (N < 3) {
            System.out.println("Nilai N minimal harus 3 atau lebih."); // Meminimalkan Nilai Agar Bisa Membentuk Segitiga Yang Diinginkan 
        } else {
            for (int i = 1; i <= N; i++) { // Membuat Perulangan Baris
                for (int j = N - i; j > 0; j--) { // Mencetak Spasi Sebelum Nilai Ditampilkan 
                    System.out.print(" "); // mencetak nilai=nilai pada setiap baris
                }

                for (int k = 1; k <= i; k++) { // Mencetak Nilai dari 1 hingga i pada setiap baris (perulangan)
                    System.out.print(k); // Mecetak angka pada baris yang sama dan tetap di sisi nilai tersebut
                }

                System.out.println(); // Pindah Ke Baris Baru Setelah Mencetak Nilai 
            }
        }
    }
}






