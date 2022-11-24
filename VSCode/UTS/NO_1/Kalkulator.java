import java.util.Scanner;
    //Enggar Lanang Nandhito Agil Ghibran
    //20200801076

public class Kalkulator {
    //deklarasi variabel
    static boolean isRun = true;
    private double input1, input2;
    private double pertambahan, pengurangan , perkalian, modulus;
    Scanner input = new Scanner(System.in);
    
    //konstruktor 
    Kalkulator(){
        this.input1 = input1 ;
        this.input2 = input2 ;
        //referensi ke object yang sedang aktif
    }
    //Method Tambah, Kurang, Kali, dan Modulus tipe data double
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
    public void setpertambahan(double input1,double input2){
        pertambahan = input1 + input2 ;
    }
    public void setpengurangan(double input1,double input2){
        pengurangan = input1 - input2 ;
    }
    public void setperkalian(double input1,double input2){
        perkalian = input1 * input2 ;
    }
    public void setmodulus(double input1,double input2){
        modulus = input1 % input2 ;
    }
    // ini method getter
    public double getInput1(){
        return this.input1;
    }
    public double getInput2(){
        return this.input2;
    }
    public double getpertambahan(){
        return pertambahan;
    }
    public double getpengurangan(){
        return pengurangan;
    }
    public double getperkalian(){
        return perkalian;
    }
    public double getmodulus(){
        return modulus;
    }
    //Main Program
    public static void main(String[] args) {
        
        Kalkulator angka = new Kalkulator();
        angka.setInput1(20);
        angka.setInput2(5);
        do {
            menuOperasi();
            Scanner input = new Scanner(System.in);
            int menu ;
            System.out.print("Pilih Operasi Hitung : ");
            menu = input.nextInt();
            
            switch(menu){
                case 1:
                    System.out.println("Bilangan 1 = " + angka.getInput1());
                    System.out.println("Bilangan 2 = " + angka.getInput2());
                    angka.setpertambahan (angka.getInput1(),angka.getInput2());
                    System.out.println("Hasil Pertambahan = " + angka.getpertambahan());
                break;
                case 2:
                    System.out.println("Bilangan 1 = " + angka.getInput1());
                    System.out.println("Bilangan 2 = " + angka.getInput2());
                    angka.setpengurangan (angka.getInput1(),angka.getInput2());
                    System.out.println("Hasil Pengurangan = " + angka.getpengurangan());
                break;
                case 3:
                    System.out.println("Bilangan 1 = " + angka.getInput1());
                    System.out.println("Bilangan 2 = " + angka.getInput2());
                    angka.setperkalian (angka.getInput1(),angka.getInput2());
                    System.out.println("Hasil Perkalian = " + angka.getperkalian());
                break;
                case 4:
                    System.out.println("Bilangan 1 = " + angka.getInput1());
                    System.out.println("Bilangan 2 = " + angka.getInput2());
                    angka.setmodulus (angka.getInput1(),angka.getInput2());
                    System.out.println("Hasil Modulus = " + angka.getmodulus());
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
    //method tampil
    static void menuOperasi(){
        //System.out.print("Input Bilangan 1 : ");
        //input1 = input.nextInt();
        //System.out.print("Input Bilangan 2 : ");
        //input2 = input.nextInt();
        System.out.println("Menu Kalkulator");
        System.out.println("=================");
        System.out.println("1. Pertambahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian");
        System.out.println("4. Modulus ");
        System.out.println("5. Exit ");
    }
}