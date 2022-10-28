/*
NIM : 20200801076
Nama: Enggar Lanang Nandhito Agil Ghibran
 */
package enggarpraktikum4;
import java.util.Scanner;
/**
 * @author Naga Panongan
Buatlah sebuah program untuk menampilkan output berikut
dengan menggunakan konsep perulangan do-while:
1
2
3
4
5
6
7
8
9
10 11 12 13 14 15 16 17 18 19 20
 */
 public class Praktikum4c {
    public static void main(String[] args) {  
        int i = 1;
        do {
            System.out.println(i + (" "));
            i++;
        }
        while (i <= 9);
        do {
            System.out.print(i + (" "));
            i++;
        }
        while (i <= 20);
    }
 }    
