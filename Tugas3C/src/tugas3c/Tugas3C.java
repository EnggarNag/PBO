package tugas3c;
//Tugas Praktikum 3 modul hal 26 bagian c.
//20200801076 - Enggar Lanang Nandhito Agil Ghibran
import java.util.Scanner;
public class Tugas3C {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int bil = input.nextInt();

        //percabangan
        if (bil%2 == 0) {
        System.out.println("" + bil + " adalah bilangan genap");
        }
        else {
        System.out.println("" + bil + " adalah bilangan ganjil");
        }
    
    }
    
}
