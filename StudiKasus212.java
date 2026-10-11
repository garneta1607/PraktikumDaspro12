import java.util.Scanner;

public class StudiKasus212 {
    publis static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen, = 0, peringkatJuara = 0, statusPkm = 0, kurangDokumen;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextline();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNNYA) : ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            peringkatJuara = sc.nextInt();
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1= lolos, 0 = tidak lolos)");
            statusPkm = sc.nextInt();
        }
        
    }
}
