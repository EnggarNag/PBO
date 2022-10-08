package operatorhitung;

import java.util.Scanner;
public class demo {
    public static void main (String[] args) {
        biodata();
        System.out.println("\n");
        input(); 
        
    }
    static void biodata(){
        System.out.println("Nama    :Enggar Lanang Nandhito Agil Ghibran");
        System.out.println("NIM     :20200801076");
        System.out.println("Email   :enggarlanang@gmail.com"); 
    }
    static void input(){
    Scanner input = new Scanner(System.in);
        int bil1, bil2 ;
        System.out.print("Angka 1 : ");
            bil1=input.nextInt();
        System.out.print("Angka 2 : ");
            bil2=input.nextInt();
}   
    class operasihitung {
        int bil1 ;
        int bil2 ;
        int jumlah = bil1+bil2;
        int kurang = bil1-bil2;
        int kali   = bil1*bil2;
        float bagi = (float)bil1/bil2;
        int modulo = bil1%bil2;
        
        /*System.out.println("Penjumlahan : "+bil1+" + "+bil2+" = "+jumlah);
        System.out.println("Pengurangan : "+bil1+" - "+bil2+" = "+kurang);
        System.out.println("Perkalian   : "+bil1+" * "+bil2+" = "+kali);
        System.out.println("Pembagian   : "+bil1+" / "+bil2+" = "+bagi);
        System.out.println("Modulo      : "+bil1+" mod "+bil2+" = "+modulo);
        */
    }
    
}
