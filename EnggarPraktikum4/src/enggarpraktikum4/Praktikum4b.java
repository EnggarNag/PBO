/*
NIM : 20200801076
Nama: Enggar Lanang Nandhito Agil Ghibran
 */
package enggarpraktikum4;
import java.util.Scanner;
/**
 * @author Naga Panongan
Buatlah sebuah program untuk menampilkan sederatan angka
genap dan ganjil beserta jumlahnya
Contoh :
1 3 5 7 9 = 25
2 4 6 8 10 = 30
 */
public class Praktikum4b {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int total_ganjil=0;
        int total_genap=0;
        
        while (i <= 10){
            if (i%2 != 0){
                System.out.print (i + " ");
                total_ganjil += i;
            } 
            i++;    
        }
        System.out.print (" = " + total_ganjil + " \n");
        while (j <= 10){
            if (j%2 == 0){
                System.out.print (j + " ");
                total_genap += j;
            } 
            j++;  
        } 
        System.out.print (" = " + total_genap + " \n"); 
}
}

