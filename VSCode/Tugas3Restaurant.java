import java.util.Scanner;

public class Tugas3Restaurant {
    //deklarasi variabel
    private float harga,ppn,total, bayar, kembalian;  
    Scanner input = new Scanner(System.in);
    //konstrukter dengan parameter harga
    public Tugas3Restaurant(float _harga){
        harga = _harga;
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
            System.out.print("Uang Kurang");
            return 0;
        } else if (bayar == total){
            System.out.print("Uang Pas!!");
            return 0;
        } else{
            return bayar;
        }
    }    
    
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
            Tugas3Restaurant ayam = new Tugas3Restaurant (25000);
            ayam.tampil();
            break;
          case 2://pecel lele
            Tugas3Restaurant lele = new Tugas3Restaurant (15000);
            lele.tampil();
            break;
          case 3://seafood saus padang
            Tugas3Restaurant seafood = new Tugas3Restaurant (30000);
            seafood.tampil();
            break;
          case 4://nasgor ayam
            Tugas3Restaurant nasgoryam = new Tugas3Restaurant (20000);
            nasgoryam.tampil();
            break;
          case 5://nasgor seafood
            Tugas3Restaurant nasgors = new Tugas3Restaurant (27000);
            nasgors.tampil();
            break;
          case 6://mie ayam spesial
            Tugas3Restaurant mieayam = new Tugas3Restaurant (22000);
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
    static void biodata(){
        System.out.println("NIM  : 20200801076");
        System.out.println("Nama : Enggar Lanang Nandhito Agil Ghibran");
    }  
}