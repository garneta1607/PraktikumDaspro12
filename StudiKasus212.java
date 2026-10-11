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
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnorecase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            if (jumlahDokumen < 4) {
                kurangdokumen = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen + "dokumen). Dana penghargaan tidak diberikan. ");
            } else {
                if (peringkatJuara >== 1 && peringkatJuara <== 3) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan. ");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3). ");
                }
            }
        } else if (jeniskegiatan.equalsIgnoreCase("PKM")) {
            if (jumlahDokumen < 4) {
                kurangDokumen = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen + "dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (statusPkm == 1) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                }
            }
        } else if (jenisKegiatam.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        } else {
            System.out.println("Status: Jenis kegiatan tidak valid.");
        }
    }
}
