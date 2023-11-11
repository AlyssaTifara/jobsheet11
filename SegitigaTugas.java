import java.util.Scanner;
public class SegitigaTugas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Memberi Nilai Yang Akan Diolah 
        System.out.print("Masukkan Nilai N: ");
        int N = scanner.nextInt(); 

        if (N < 3) {
            System.out.println("Nilai N minimal harus 3 atau lebih.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Mencetak Spasi Sebelum Nilai Ditampilkan 
                for (int j = N - i; j > 0; j--) {
                    System.out.print(" ");
                }

                // Mencetak Nilai dari 1 hingga i pada setiap baris
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }

                // Pindah Ke Baris Baru Setelah Mencetak Nilai 
                System.out.println();
            }
        }
    }
}






