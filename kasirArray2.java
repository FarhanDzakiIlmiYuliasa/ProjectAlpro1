import java.util.Scanner;

public class kasirArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String makanan [] = {"Soto Ayam","Pecel","Ayam Goreng","Nasi Goreng","Mie Goreng"};
        double hargaMakanan [] = {5000,7000,9000,5000,6000};

        int [] jumlahMakanan = new int[makanan.length];

        System.out.println("Daftar menu makanan");
        for(int i = 0; i < makanan.length; i++){
            System.out.println("["+i+"]- "+makanan[i]+" - Rp"+hargaMakanan[i]);
        }

        System.out.print("Pilih makanan :");
        int pilihMakanan = input.nextInt();

        System.out.print("Beli Berapa? ");
        jumlahMakanan[pilihMakanan=1]= input.nextInt();

        double total = hargaMakanan[pilihMakanan=1] * jumlahMakanan[pilihMakanan=1];

        System.out.println("Anda memesan :" +makanan[pilihMakanan=1]+" "+jumlahMakanan[pilihMakanan=1]+" Porsi");
        System.out.println("biaya Total = "+total);

        input.close();
    }
}
