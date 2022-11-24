import java.util.Scanner;


/**
 * Contoh yang dikasih ASDOS :
 * @author shahd
 */
public class OrderingFoodProsedural {
      public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int pil;
        double harga = 0, PPN, totalharga, totalbayar, kembalian;
        String NamaProduk;
        System.out.print("\n SELAMAT DATANG DI RESTAURANT DAPUR LARISA");
        System.out.println("\n DISINI MENYEDIAKAN ANEKA MENU ");
        System.out.print("\n 1. AYAM BAKAR ");
        System.out.print("\n 2. PECEL LELE ");
        System.out.print("\n 3. SEAFOOD (KERANG-KERANGAN, KEPITING,UDANG) SAUS PADANG ");
        System.out.print("\n 4. NASI GORENG AYAM ");
        System.out.print("\n 5. NASI GORENG SEAFOOD ");
        System.out.print("\n 6. MIE GORENG SPESIAL ");
        System.out.print("\n Pilih menu : ");
        pil = scan.nextInt();
        switch(pil) {
            case 1:
            NamaProduk = "AYAM BAKAR ";
            harga = 25000;
            break;

            case 2:
            NamaProduk = "PECEL LELE ";
            harga = 18000;
            break;

            case 3:
            NamaProduk = "SEAFOOD (KERANG-KERANGAN, KEPITING, UDANG)SAUS PADANG ";
            harga = 80000;
            break;

            case 4:
            NamaProduk = "NASI GORENG AYAM ";
            harga = 20000;
            break;

            case 5:
            NamaProduk = "NASI GORENG SEAFOOD ";
            harga = 28000;
            break;

            case 6:
            NamaProduk = "MIE GORENG SPESIAL ";
            harga = 30000;
            break;
            default:
            System.out.println("Maaf, pilihan tidak tersedia");
        }
        PPN = harga*0.10;
        totalharga = harga + PPN;
        System.out.println("\nJumlah Harga : Rp " + harga);
        System.out.println("\nPPN : Rp " + PPN);
        System.out.println("\nTotal Harga : Rp " + totalharga);
        System.out.print("\nTotal Bayar : Rp ");
        totalbayar = scan.nextInt();
        kembalian = totalbayar - totalharga;
        System.out.println("\nKembalian : Rp " + kembalian);
    }
}
