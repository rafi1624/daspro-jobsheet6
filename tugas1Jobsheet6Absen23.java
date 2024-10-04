import java.util.Scanner;

public class tugas1Jobsheet6Absen23 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0, sebelumDiskon, hargaBuku = 20000, totalHarga, totalDiskon;

        System.out.println("Masukkan Jenis Buku = ");
        jenisBuku = input23.nextLine();
        System.out.println("Masukkan Jumlah Buku = ");
        jumlahBuku = input23.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
            
                
            } else 
                diskon = 0.10;
            
        }   else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.09;
                
            } else
                diskon = 0.08;
            
        } else if (jumlahBuku > 3) {
            diskon = 0.05;
            
        }
        sebelumDiskon = jumlahBuku * hargaBuku;
        totalDiskon = sebelumDiskon * diskon;
        totalHarga = sebelumDiskon - totalDiskon;

        System.out.println("Total Diskon Dalam Persen = " + diskon);
        System.out.println("Total Diskon Dalam Rupiah = " + totalDiskon);
        System.out.println("Total Harga = " + totalHarga);
        
    }
}