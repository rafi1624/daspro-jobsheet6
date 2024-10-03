import java.util.Scanner;

public class pemilihan2Percobaan2Absen23 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        int menu;
        double diskon,totalHarga;
        String member ;
        double harga;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Rice Bowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.println("Masukkan Angka Dari Menu Yang Dipilih = ");
        menu = input23.nextInt();
        input23.nextLine();
        System.out.print("Apakah Punya Member (y/n) ? = ");
        member = input23.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Rice Bowl = " + harga);

            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);

            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar");
                return;
            }
            totalHarga = harga - (harga*diskon);
            System.out.println("Total Bayar Setelah Diskon = " + totalHarga);

        }
        else if (member.equalsIgnoreCase("n")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Rice Bowl = " + harga);

            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga  Bundling = " + harga);

                
            } else {
                System.out.println("Masukkan Pilihan Menu Dengan Benar ");
                return;
            }
            
            System.out.println("Total Bayar = " + harga);

        
        } else {
            System.out.println("Member Tidak Valid");

        }
        System.out.println("----------------------------------------");


    }
}