import java.util.Scanner;
    //Enggar Lanang Nandhito Agil Ghibran
    //20200801076

public class Calculator {
    //deklarasi variabel
    static boolean isRun = true;
    private double input1, input2;
    private double pertambahan, pengurangan , perkalian, modulus;
    Scanner input = new Scanner(System.in);
    
    static void menuOperasi(){
        System.out.println("Menu Kalkulator");
        System.out.println("=================");
        System.out.println("1. Pertambahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian");
        System.out.println("4. Modulus ");
        System.out.println("5. Exit ");
    }
    //konstruktor 
    Calculator(){
        this.input1 = input1 ;
        this.input2 = input2 ;
        //referensi ke object yang sedang aktif
    }
    
    //Method Tambah, Kurang, Kali, dan Modulus
    double pertambahan(){
        pertambahan = input1 + input2 ;
        return pertambahan;
    }
    double pengurangan(){
        pengurangan = input1 - input2 ;
        return pengurangan;
    }
    double perkalian(){
        perkalian = input1 * input2 ;
        return perkalian;
    }
    double modulus(){
        modulus = input1 % input2 ;
        return modulus;
    }

    // ini method setter
    public void setInput1(double input1){
        this.input1 = input1 ;
    }
    public void setInput2(double input2){
        this.input2 = input2 ;
    }
    // ini method getter
    public double getInput1(){
        return this.input1;
    }
    public double getInput2(){
        return this.input2;
    }

    //Main Program
    public static void main(String[] args) {
        
        Calculator angka = new Calculator();
        angka.setInput1(20);
        angka.setInput2(5);
        do {
            /*System.out.print("Input Bilangan : ");
            input1 = input.nextDouble();
            System.out.print("Input Bilangan : ");
            input2 = input.nextDouble();*/
            menuOperasi();
            Scanner input = new Scanner(System.in);
            int menu ;
            System.out.print("Pilih Operasi Hitung : ");
            menu = input.nextInt();
            
            switch(menu){
                case 1:
                    System.out.println("Hasil Pertambahan = " + angka.pertambahan());
                break;
                case 2:
                    System.out.println("Hasil Pengurangan = " + angka.pengurangan());
                break;
                case 3:
                    System.out.println("Hasil Perkalian = " + angka.perkalian());
                break;
                case 4:
                    System.out.println("Hasil modulus = " + angka.modulus());
                break;
                case 5:
                    System.exit(5);
                break;
                default:
                    System.out.println("Menu tidak tersedia");    
            }
            System.out.println(" ");  
        } while (isRun);
    }

}