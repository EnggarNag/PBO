package tugas3drestaurant;
//Tugas Praktikum 3 Restaurant
//20200801076 - Enggar Lanang Nandhito Agil Ghibran
import java.util.Scanner;
public class Tugas3Drestaurant {
    //deklarasi variabel
    private float harga,ppn,total, bayar, kembalian;  
    Scanner input = new Scanner(System.in);
    //konstruktor dengan parameter harga
    public Tugas3Drestaurant(float _harga){
        harga = _harga;
    }
    //Method ppn
    public float ppn(){
        ppn = harga * 10/100;
        return ppn;
    }
    //Method total
    public float total(){
        total = harga + ppn ;
        return total;
    }
    //Method bayar
    public float bayar(){
        System.out.print("Total Bayar  : Rp  ");
        bayar = input.nextInt();
        if (bayar < total){
            System.out.print("Uang Kurang");
            return 0;
        } else if (bayar == total){
            System.out.print("Uang Pas!!");
            return 0;
        } else{
            return bayar;
        }
    }    
    //Method kembalian
    public float kembalian(){
        return bayar - total ;
    }
    //Method menampilkan
    public void tampil(){
        System.out.println("Jumlah Harga : Rp  "+ harga);
        System.out.println("PPN          : Rp  "+ ppn());
        System.out.println("Total Harga  : Rp  "+ total());
        bayar();
        System.out.println("Kembalian    : Rp  "+ kembalian());
    }
    //MAIN PROGRAM
    public static void main(String[] args) {
        biodata();
        welcome();
        listmenu();

        int menu ;
        float harga, ppn,total, bayar, kembalian;
        Scanner input = new Scanner(System.in);

        System.out.print("\nPilih Menu : ");
        menu = input.nextInt();
        
        switch (menu) {
          case 1://ayam bakar
            Tugas3Drestaurant ayam = new Tugas3Drestaurant (25000);
            ayam.tampil();
            break;
          case 2://pecel lele
            Tugas3Drestaurant lele = new Tugas3Drestaurant (15000);
            lele.tampil();
            break;
          case 3://seafood saus padang
            Tugas3Drestaurant seafood = new Tugas3Drestaurant (30000);
            seafood.tampil();
            break;
          case 4://nasgor ayam
            Tugas3Drestaurant nasgoryam = new Tugas3Drestaurant (20000);
            nasgoryam.tampil();
            break;
          case 5://nasgor seafood
            Tugas3Drestaurant nasgors = new Tugas3Drestaurant (27000);
            nasgors.tampil();
            break;
          case 6://mie ayam spesial
            Tugas3Drestaurant mieayam = new Tugas3Drestaurant (22000);
            mieayam.tampil();
            break;
          default:
            System.out.println("Maaf, Menu tidak tersedia");           
        }
        thanks();
    }
    //konstruktor tanpa parameter welcome , thanks, listmenu, dan biodata
    static void welcome(){
        System.out.println("\nSELAMAT DATANG DI RESTAURANT DAPUR LARISA");
        System.out.println("DISINI MENYEDIAKAN ANEKA MENU \n");
    }
    static void thanks(){
        System.out.println("\nTERIMA KASIH SUDAH DATANG KE RESTAURAN INI!");
    }
    static void listmenu(){
        System.out.println("1. AYAM BAKAR ");
        System.out.println("2. PECEL LELE ");
        System.out.println("3. SEAFOOD (KERANG-KERANGAN, KEPITING, UDANG) SAUS PADANG ");
        System.out.println("4. NASI GORENG AYAM ");
        System.out.println("5. NASI GORENG SEAFOOD ");
        System.out.println("6. MIE GORENG SPESIAL ");    
    }
    static void biodata(){
        System.out.println("NIM  : 20200801076");
        System.out.println("Nama : Enggar Lanang Nandhito Agil Ghibran");
    }  
}
