import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        biodata();
        System.out.println("\n");

        Scanner input = new Scanner(System.in);
        int bil1, bil2;

        System.out.print("Angka 1 : ");
        bil1 = input.nextInt();
        System.out.print("Angka 2 : ");
        bil2 = input.nextInt();
        System.out.println("\n");

        int jumlah = bil1 + bil2;
        int kurang = bil1 - bil2;
        int kali = bil1 * bil2;
        float bagi = (float) bil1 / bil2;
        int modulo = bil1 % bil2;

        System.out.println("Penjumlahan : " + bil1 + " + " + bil2 + " = " + jumlah);
        System.out.println("Pengurangan : " + bil1 + " - " + bil2 + " = " + kurang);
        System.out.println("Perkalian   : " + bil1 + " * " + bil2 + " = " + kali);
        System.out.println("Pembagian   : " + bil1 + " / " + bil2 + " = " + bagi);
        System.out.println("Modulo      : " + bil1 + " mod " + bil2 + " = " + modulo);
        System.out.println("\n");
//Statement1        
        boolean a, b;
        //Penjumlahan % 2 >= Pembagian % 2
        a = true;
        //Modulo % 2 <= Perkalian % 2 
        b = true;
        if (a && b) {
            System.out.println("Statement 1 : Penjumlahan % 2 >= Pembagian % 2 AND Modulo % 2 <= Perkalian % 2 -> true");
        } else {
            System.out.println("Statement 1 : Penjumlahan % 2 >= Pembagian % 2 AND Modulo % 2 <= Perkalian % 2 -> false");
        }
//Statement2        
        boolean c, d;
        //Perkalian % 2 == Pengurangan
        c = false;
        //% 4 == kurang 
        d = false;
        if (c || d) {
            System.out.println("Statement 2 : Perkalian % 2 == Pengurangan OR % 4 == kurang -> true");
        } else {
            System.out.println("Statement 2 : Perkalian % 2 == Pengurangan OR % 4 == kurang -> false");
        }
//Statement3
        boolean e, f;
        //Penjumlahan <= pengurangan + pembagian    
            if (jumlah <= kurang + bagi) {
                e = true;
            } else {
                e = false;
            }
        //perkalian >= Modulo + pengurangan
            if (kali >= modulo + kurang) {
                f = true;
            } else {
                f = false;
            }
        if (e && f) {
            System.out.println("Statement 3 : Penjumlahan <= Pengurangan + Pembagian AND Perkalian >= Modulo + Pengurangan -> true");
        } else {
            System.out.println("Statement 3 : Penjumlahan <= Pengurangan + Pembagian AND Perkalian >= Modulo + Pengurangan -> false");
        }
//Statement4        
        boolean g, h;             
        //!(perkalian > penjumlahan ) => ini udh pasti false
            if (!(kali > jumlah)){
                g = true;
            } else {
                g = false;
            }
        //pengurangan < pembagian
            if (kurang < bagi){
                h = true;
            } else {
                h = false;
            }
        if (g || h) {
            System.out.println("Statement 4 : !(Perkalian > Penjumlahan ) OR Pengurangan < Pembagian -> true ");
        } else {
            System.out.println("Statement 4 : !(Perkalian > Penjumlahan ) OR Pengurangan < Pembagian -> false ");
        }
//Statement5        
        int i, j;
        //penjumlahan+perkalian
        i = jumlah + kali;
        //Pengurangan++ + Modulo-- 
        j = kurang++ + modulo--;
        if (i >= j) {
            System.out.println("Statement 5 : Penjumlahan+Perkalian >= Pengurangan++ + Modulo-- -> true ");
        } else {
            System.out.println("Statement 5 : Penjumlahan+Perkalian >= Pengurangan++ + Modulo-- -> true ");
        }
    }

    static void biodata() {
        System.out.println("Nama    :Enggar Lanang Nandhito Agil Ghibran");
        System.out.println("NIM     :20200801076");
        System.out.println("Email   :enggarlanang@gmail.com");
    }
    static void input() {
        Scanner input = new Scanner(System.in);
        int bil1, bil2;

        System.out.print("Angka 1 : ");
        bil1 = input.nextInt();
        System.out.print("Angka 2 : ");
        bil2 = input.nextInt();
    }
}
