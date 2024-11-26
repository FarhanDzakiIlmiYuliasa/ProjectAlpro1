import java.util.Scanner;

public class kasir3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Mesin Kasir 3\n");

        System.out.println(" _______________________________________________");
        System.out.println("|       Nama Makanan         |       Harga       |");
        System.out.println("|____________________________|___________________|");
        System.out.println("| 1. Soto Ayam               | Rp. 5000          |");
        System.out.println("| 2. Pecel                   | Rp. 7000          |");
        System.out.println("| 3. Ayam Goreng             | Rp. 9000          |");
        System.out.println("| 4. Nasi Goreng             | Rp. 5000          |");
        System.out.println("| 5. Mie Goreng              | Rp. 6000          |");
        System.out.println("|____________________________|___________________|\n");

        System.out.println(" _______________________________________________");
        System.out.println("|       Nama Minuman         |       Harga       |");
        System.out.println("|____________________________|___________________|");
        System.out.println("| 1. Es Teh Anget            | Rp. 5000          |");
        System.out.println("| 2. Es Susu Anget           | Rp. 6000          |");
        System.out.println("| 3. Es Kopi Anget           | Rp. 5000          |");
        System.out.println("| 4. Es Jahe Anget           | Rp. 4000          |");
        System.out.println("| 5. Es Energen Anget        | Rp. 6000          |");
        System.out.println("|____________________________|___________________|\n");

        String namaPemesan;
        int makanan;
        int minuman;
        int jumlahMakanan;
        int jumlahMinuman;

        // List Makanan :
        String mak1 = " Soto Ayam";
        String mak2 = " Pecel";
        String mak3 = " Ayam Goreng";
        String mak4 = " Nasi Goreng";
        String mak5 = " Mie Goreng";

        // List Minuman :
        String min1 = " Es Teh Anget";
        String min2 = " Es Susu Anget";
        String min3 = " Es Kopi Anget";
        String min4 = " Es Jahe Anget";
        String min5 = " Es Energen Anget";

        // Harga tiap menu
        int hargaMak1 = 5000, hargaMak2 = 7000, hargaMak3 = 9000, hargaMak4 = 5000, hargaMak5 = 6000;
        int hargaMin1 = 5000, hargaMin2 = 6000, hargaMin3 = 5000, hargaMin4 = 4000, hargaMin5 = 6000;
        int totalHargaMakanan = 0;
        int totalHargaMinuman = 0;
        double biayaKeseluruhan;

        // Input Nama Pemesan
        System.out.print("Masukkan Nama Kamu : ");
        namaPemesan = input.nextLine();
        // Input Makanan
        System.out.print("Masukkan Nomor Makanan : ");
        makanan = input.nextInt();
        System.out.print("Beli Berapa? ");
        jumlahMakanan = input.nextInt();

        input.nextLine();

        // Input Minuman
        System.out.print("Masukkan Nomor Minuman : ");
        minuman = input.nextInt();
        System.out.print("Beli Berapa? ");
        jumlahMinuman = input.nextInt();

        // Percabangan Makanan
        switch (makanan) {
            case 1:
                System.out.println("\nMakanan kamu" + mak1 + ", harganya Rp. " + hargaMak1 + ", Jumlahnya " + jumlahMakanan);
                totalHargaMakanan = jumlahMakanan * hargaMak1;
                break;
            case 2:
                System.out.println("\nMakanan kamu" + mak2 + ", harganya Rp. " + hargaMak2 + ", Jumlahnya " + jumlahMakanan);
                totalHargaMakanan = jumlahMakanan * hargaMak2;
                break;
            case 3:
                System.out.println("\nMakanan kamu" + mak3 + " harganya Rp. " + hargaMak3 + ", Jumlahnya " + jumlahMakanan);
                totalHargaMakanan = jumlahMakanan * hargaMak3;
                break;
            case 4:
                System.out.println("\nMakanan kamu" + mak4 + ", harganya Rp. " + hargaMak4 + ", Jumlahnya " + jumlahMakanan);
                totalHargaMakanan = jumlahMakanan * hargaMak4;
                break;
            case 5:
                System.out.println("\nMakanan kamu" + mak5 + ", harganya Rp. " + hargaMak5 + ", Jumlahnya " + jumlahMakanan);
                totalHargaMakanan = jumlahMakanan * hargaMak5;
                break;
            default:
                System.out.println("Nomor makanan tidak valid.");
                break;
        }

        // Percabangan Minuman
        switch (minuman) {
            case 1:
                System.out.println("Minuman kamu" + min1 + ", harganya Rp. " + hargaMin1 + ", Jumlahnya " + jumlahMinuman);
                totalHargaMinuman = jumlahMinuman * hargaMin1;
                break;
            case 2:
                System.out.println("Minuman kamu" + min2 + ", harganya Rp. " + hargaMin2 + ", Jumlahnya " + jumlahMinuman);
                totalHargaMinuman = jumlahMinuman * hargaMin2;
                break;
            case 3:
                System.out.println("Minuman kamu" + min3 + ", harganya Rp. " + hargaMin3 + ", Jumlahnya " + jumlahMinuman);
                totalHargaMinuman = jumlahMinuman * hargaMin3;
                break;
            case 4:
                System.out.println("Minuman kamu" + min4 + ", harganya Rp. " + hargaMin4 + ", Jumlahnya " + jumlahMinuman);
                totalHargaMinuman = jumlahMinuman * hargaMin4;
                break;
            case 5:
                System.out.println("Minuman kamu" + min5 + ", harganya Rp. " + hargaMin5 + ", Jumlahnya " + jumlahMinuman);
                totalHargaMinuman = jumlahMinuman * hargaMin5;
                break;
            default:
                System.out.println("Nomor minuman tidak valid.");
                break;
        }

        // Hasil akhir
        biayaKeseluruhan = totalHargaMakanan + totalHargaMinuman;
        System.out.println("\nNama Pemesan : " + namaPemesan);
        System.out.println("Total harga Makanan : Rp. " + totalHargaMakanan);
        System.out.println("Total harga Minuman : Rp. " + totalHargaMinuman);
        System.out.println("Biaya keseluruhan : Rp. " + biayaKeseluruhan);

        input.close();
    }
}