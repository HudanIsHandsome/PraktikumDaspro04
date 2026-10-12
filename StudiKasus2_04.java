import java.util.Scanner; 
public class StudiKasus2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String BKM;
        int Jumlah_Dokumen;
        int juara;
        int Status_PKM;

        System.out.println("Masukkan Nama Anda :");
        nama = sc.nextLine();
        System.out.println("Jenis Lomba Yang Anda Ikuti (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya) :");
        BKM = sc.nextLine();
        System.out.println("Masukkan Jumlah Dokumen Yang Anda Kirim (-0-4) :" );
        Jumlah_Dokumen = sc.nextInt();
        System.out.println("Masukkan Peringkat Juara (1-3) jika Tidak Juara (0) :");
        juara= sc.nextInt();
        

        if (BKM.equalsIgnoreCase("BELMAWA") || BKM.equalsIgnoreCase("BAKORMA")|| BKM.equalsIgnoreCase("Mandiri")) {
            if (Jumlah_Dokumen == 4) {
                if (juara >0 && juara <4) {
                    System.out.println("Dana Penghargaan Diberikan");
                } else {
                    System.out.println("Kamu Bukan Juara 1, 2, atau 3");
                }
            } else {
                System.out.println("Jumlah Dokumen Tidak Lengkap, kurang" + (4 - Jumlah_Dokumen) + "Dokumen");
            }
        } 
    }
}
