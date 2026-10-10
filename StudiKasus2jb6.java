import java.util.Scanner;

public class StudiKasus2jb6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama, jenisKegiatan;
        int jumlahDokumen = 0, peringkatJuara = 0, statusPkm = 0, kurangDokumen;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMANA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah Dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat Juara : ");
            peringkatJuara = sc.nextInt();
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah Dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos");
            statusPkm = sc.nextInt();
        }

    } 
}
