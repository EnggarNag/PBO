package tugas3a;
//Tugas Praktikum 3 modul hal 26 bagian a.
//20200801076 - Enggar Lanang Nandhito Agil Ghibran 
import java.util.Scanner;
public class Tugas3A {

    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Nilai Anda : ");
        nilai = input.nextInt();
        
        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Nilai Anda A");
        }
        else if (nilai >= 70 && nilai <= 84) {
            System.out.println("Nilai Anda B");
        }
        else if (nilai >= 60 && nilai <= 69) {
            System.out.println("Nilai Anda C");
        }
        else if (nilai >= 50 && nilai <= 59) {
            System.out.println("Nilai Anda D");
        }
        else if (nilai < 50 ) {
            System.out.println("Nilai Anda E");
        }
        else {
            System.out.println("Maaf, format nilai tidak sesuai");
        }
    }  
}
