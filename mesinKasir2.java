import java.util.Scanner;

public class mesinKasir2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat Scanner

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
        System.out.print("Masukkan Nama Pemesan : ");
        namaPemesan = input.nextLine();

        System.out.print("Massukkan Nama Makanan : ");
        namaMakanan = input.nextLine();
        hargaMakanan = 10000;
        System.out.print("Beli berapa? ");
        jumlahMakanan = input.nextInt();

        input.nextLine();

        System.out.print("Massukkan Nama Minuman : ");
        namaMinuman = input.nextLine();
        hargaMinuman = 5000;
        System.out.print("Beli berapa? ");
        jumlahMinuman = input.nextInt();
        
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
        jumlahUang = input.nextDouble();

        // Menghitung kembalian
        if (jumlahUang >= biayaKeseluruhan) {
            kembalian = jumlahUang - biayaKeseluruhan;
            System.out.println("Kembalian : " + kembalian);
        } 
        else {
            System.out.println("Uang yang diberikan tidak cukup!");
            System.out.print("Masukkan Jumlah Uang Lagi : ");
            jumlahUang = input.nextDouble();
            kembalian = jumlahUang - biayaKeseluruhan;
            System.out.println("Kembalian : " + kembalian);
        }

        input.close(); // Menutup Scanner
    }
}
