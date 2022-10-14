/*
Tugas Praktikum 3 modul hal 26 bagian b.
*/
import java.util.Scanner;

public class Tugas3B {
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan bilangan : ");
    int bil = input.nextInt();

    //percabangan
    if (bil < 0) {
    System.out.println("" + bil + " adalah bilangan negatif");
    }
    else if (bil >= 0) {
    System.out.println("" + bil + " adalah bilangan positif");
    }
    else if (bil == 0) {
    System.out.println("" + bil + " adalah bilangan nol");
    }

    }
}