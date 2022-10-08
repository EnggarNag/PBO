
import java.util.Scanner;
public class tgs2PBO {
    public static void main(String args[]) {
        // TODO code application logic here 
        Scanner input = new Scanner(System.in);
        int bil1, bil2 ;
        System.out.print("Angka 1 : ");
         bil1=input.nextInt();
        System.out.print("Angka 2 : ");
         bil2=input.nextInt();
            
        int jumlah = bil1+bil2;
        int kurang = bil1-bil2;
        int kali = bil1*bil2;
        float bagi = (float)bil1/bil2;
        int modulo = bil1%bil2;
     
        System.out.println("Penjumlahan : "+bil1+" + "+bil2+" = "+jumlah);
        System.out.println("Pengurangan : "+bil1+" - "+bil2+" = "+kurang);
        System.out.println("Perkalian   : "+bil1+" * "+bil2+" = "+kali);
        System.out.println("Pembagian   : "+bil1+" / "+bil2+" = "+bagi);
        System.out.println("Modulo      : "+bil1+" mod "+bil2+" = "+modulo);
        
        System.out.println("Statement 1 : p ");
    }
}
