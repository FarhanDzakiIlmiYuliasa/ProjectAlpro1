import java.util.Scanner;

public class mesinKasir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat Scanner

        System.out.println("Mesin Kasir Sederhana\n");
        System.out.println("=============================\n");

        // deklarasi
        String namaPemesan;
        String namaMakanan;
        String namaMinuman;
        double hargaMakanan;
        double hargaMinuman;
        int jumlahMakanan;
        int jumlahMinuman;
        double totalHargaMakanan;
        double totalHargaMinuman;
        double biayaKeseluruhan;
        double jumlahUang;
        double kembalian;

        // inisialisasi
        System.out.println("Masukkan Nama Pemesan : ");
        namaPemesan = scanner.nextLine();
        namaMakanan = "Chicken crispy";
        namaMinuman = "CocaCola";
        hargaMakanan = 24000;
        hargaMinuman = 5500;
        jumlahMakanan = 2;
        jumlahMinuman = 2;
        totalHargaMakanan = hargaMakanan * jumlahMakanan;
        totalHargaMinuman = hargaMinuman * jumlahMinuman;
        biayaKeseluruhan = totalHargaMakanan + totalHargaMinuman;
        
        System.out.println("Nama Pemesan : " + namaPemesan + "\n");
        System.out.println("Nama Makanan : " + namaMakanan);
        System.out.println("Harga Makanan : " + hargaMakanan);
        System.out.println("Jumlah : " + jumlahMakanan);
        System.out.println("Total : " + totalHargaMakanan + "\n");
        System.out.println("Nama Mininuman : " + namaMinuman);
        System.out.println("Harga Minuman : " + hargaMinuman);
        System.out.println("Jumlah : " + jumlahMinuman);
        System.out.println("Total : " + totalHargaMinuman + "\n");
        System.out.println("Total Biaya : " + biayaKeseluruhan);

        // Meminta input jumlah uang dari pengguna
        System.out.print("Jumlah Uang yang Diberikan: ");
        jumlahUang = scanner.nextDouble();

        // Menghitung kembalian
        if (jumlahUang >= biayaKeseluruhan) {
            kembalian = jumlahUang - biayaKeseluruhan;
            System.out.println("Kembalian : " + kembalian);
        } 
        else {
            System.out.println("Uang yang diberikan tidak cukup!");
        }

        scanner.close(); // Menutup Scanner
    }
}
