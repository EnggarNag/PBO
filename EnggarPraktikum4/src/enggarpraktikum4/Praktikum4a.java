/*
NIM : 20200801076
Nama: Enggar Lanang Nandhito Agil Ghibran
 */
package enggarpraktikum4;
import java.util.Scanner;
/*
 * @author Naga Panongan
Buatlah sebuah program untuk menampilkan output berikut:
30 29 28 27 26.......16 1 2 3 4 5 6 7 8 9.....15
 */
public class Praktikum4a {    
    public static void main(String[] args) {
        
        for(int i=30; i >= 16; i--){
            System.out.print( i + " ");
        }
        System.out.print("  ");
        for(int j=1; j <= 15; j++){
            System.out.print( j + " ");
        }
    }
    
}