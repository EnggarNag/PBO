package bangunruang;
import java.util.Scanner;
    //Enggar Lanang Nandhito Agil Ghibran
    //20200801076

public class BangunRuang {
    //deklarasi variabel
    static boolean isRun = true;
    //Main Program
    static void menuOperasi(){
        System.out.println("Menu Bangun Ruang");
        System.out.println("=================");
        System.out.println("1. Kubus ");
        System.out.println("2. Balok ");
        System.out.println("3. Prisma Segitiga");
        System.out.println("4. Exit ");
    }
    public static void main(String[] args) {
        
        Kubus Hitam = new Kubus();
        Hitam.Setrusuk_KB(5);
        Balok Merah = new Balok();
        Merah.Setpanjang_BL(5);
        Merah.Setlebar_BL(3);
        Merah.Settinggi_BL(4);
        PrismaSegitiga Kuning = new PrismaSegitiga();
        Kuning.Setrusuk_PS(4);
        Kuning.Settinggi_PS(6);

        do {
            menuOperasi();
            Scanner input = new Scanner(System.in);
            int menu ;
            System.out.print("Pilih Bangun Ruang : ");
            menu = input.nextInt();
            
            switch(menu){
                case 1:
                    //System.out.println("Rusuk = " + Hitam.Getrusuk_KB());
                    Hitam.SetluasPermukaan_KB (Hitam.Getrusuk_KB());
                    System.out.println("luas Permukaan Kubus = " + Hitam.GetluasPermukaan_KB());
                    Hitam.Setvolume_KB (Hitam.Getrusuk_KB());
                    System.out.println("Volume Kubus = " + Hitam.Getvolume_KB());
                break;
                case 2:
                    //System.out.println("Panjang = " + Merah.Getpanjang_BL());
                    //System.out.println("Lebar = " + Merah.Getlebar_BL());
                    //System.out.println("Tinggi = " + Merah.Gettinggi_BL());
                    Merah.SetluasPermukaan_BL (Merah.Getpanjang_BL(),Merah.Getlebar_BL());
                    System.out.println("luas Permukaan Balok = " + Merah.GetluasPermukaan_BL());
                    Merah.Setvolume_BL (Merah.Getpanjang_BL(),Merah.Getlebar_BL(),Merah.Gettinggi_BL());
                    System.out.println("Volume Balok = " + Merah.Getvolume_BL());
                break;
                case 3:
                    //System.out.println("Rusuk = " + Kuning.Getrusuk_PS());
                    //System.out.println("Tinggi = " + Kuning.Gettinggi_PS());
                    Kuning.SetluasPermukaan_PS (Kuning.Getrusuk_PS(),Kuning.Gettinggi_PS());
                    System.out.println("luas Permukaan Prisma Segitiga = " + Kuning.GetluasPermukaan_PS());
                    Kuning.Setvolume_PS (Kuning.Getrusuk_PS(),Kuning.Gettinggi_PS());
                    System.out.println("Volume Prisma Segitiga = " + Kuning.Getvolume_PS());
                break;
                case 4:
                    System.exit(5);
                break;
                default:
                System.out.println("Menu tidak tersedia");    
            }
            System.out.println(" ");  
        } while (isRun);
        
    }
    
}

