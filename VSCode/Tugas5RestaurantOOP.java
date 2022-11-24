import java.util.Scanner;
    //Enggar Lanang Nandhito Agil Ghibran
    //20200801076

public class Tugas5RestaurantOOP {
    //deklarasi variabel
    private float harga,ppn,total, bayar, kembalian;  
    Scanner input = new Scanner(System.in);

    //konstruktor dengan parameter harga
    public Tugas5RestaurantOOP(float harga){
        this.harga = harga; //referensi ke object yang sedang aktif
    }

    //Method ppn,total_harga,total_bayar,kembalian
    public float ppn(){
        ppn = harga * 10/100;
        return ppn;
    }
    public float total(){
        total = harga + ppn ;
        return total;
    }
    public float bayar(){
        System.out.print("Total Bayar  : Rp  ");
        bayar = input.nextInt();
        if (bayar < total){
            System.out.println("Uang Kurang ");
            return 0;
        } else if (bayar == total){
            System.out.println("Uang Pas!! ");
            return 0;
        } else{
            return bayar;
        }
    }    
    public float kembalian(){
        return bayar - total ;
    }

    //Method menampilkan
    void tampil(){
        System.out.println("Jumlah Harga : Rp  "+ harga);
        System.out.println("PPN          : Rp  "+ ppn());
        System.out.println("Total Harga  : Rp  "+ total());
        bayar();
        System.out.println("Kembalian    : Rp  "+ kembalian());
    }

    //Main Program
    public static void main(String[] args) {
        welcome();
        listmenu();

        int menu ;
        Scanner input = new Scanner(System.in);

        System.out.print("\nPilih Menu : ");
        menu = input.nextInt();
        
        switch (menu) {
          case 1://ayam bakar
            // membuat OBJECT ayam bakar dan mengisi nilai harga pada OBJECT ayam bakar melalui parameter
            Tugas5RestaurantOOP ayam = new Tugas5RestaurantOOP (25000); 
            ayam.tampil(); // memanggil method tampil
            break;
          case 2://pecel lele
            Tugas5RestaurantOOP lele = new Tugas5RestaurantOOP (15000);
            lele.tampil();
            break;
          case 3://seafood saus padang
            Tugas5RestaurantOOP seafood = new Tugas5RestaurantOOP (30000);
            seafood.tampil();
            break;
          case 4://nasgor ayam
            Tugas5RestaurantOOP nasgoryam = new Tugas5RestaurantOOP (20000);
            nasgoryam.tampil();
            break;
          case 5://nasgor seafood
            Tugas5RestaurantOOP nasgors = new Tugas5RestaurantOOP (27000);
            nasgors.tampil();
            break;
          case 6://mie ayam spesial
            Tugas5RestaurantOOP mieayam = new Tugas5RestaurantOOP (22000);
            mieayam.tampil();
            break;
          default:
            System.out.println("Maaf, Menu tidak tersedia");           
        }
        thanks();
    }
    
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
}