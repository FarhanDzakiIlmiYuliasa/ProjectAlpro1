public class kasirArray {
    public static void main(String[] args) {
        String makanan [] = {"nasi goreng","Soto","Mie Ayam"};
        double hargaMakanan [] = {10000,12000,8000};
        
        System.out.println("Daftar menu");
        for(int i = 0; i < makanan.length; i++){
            System.out.println("["+i+"]- "+makanan[i]+" - Rp"+hargaMakanan[i]);
        }
    }
}