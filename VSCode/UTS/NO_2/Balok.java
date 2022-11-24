package bangunruang;
import java.util.Scanner;
    //Enggar Lanang Nandhito Agil Ghibran
    //20200801076

public class Balok extends BangunRuang {
    //deklarasi Variabel
    private double panjang,lebar,tinggi;
    private double luasPermukaan;
    private double volume;
    //konstruktor 
    /*Balok (double panjang,double lebar,double tinggi){
        this.panjang = panjang ;
        this.lebar = lebar ;
        this.tinggi = tinggi ;
    }*/
    Balok (){
        this.panjang = panjang ;
        this.lebar = lebar ;
        this.tinggi = tinggi ;
    }

    //Method
    double luasPermukaan(){
        luasPermukaan = panjang * lebar ;
        return luasPermukaan;
    }
    double volume(){
        volume = panjang * lebar * tinggi ;
        return volume;
    }
    // ini method setter
    public void Setpanjang_BL(double panjang){
        this.panjang = panjang ;
    }
    public void Setlebar_BL(double lebar){
        this.lebar = lebar ;
    }
    public void Settinggi_BL(double tinggi){
        this.tinggi = tinggi ;
    }
    public void SetluasPermukaan_BL(double panjang,double lebar){
        luasPermukaan = panjang * lebar ;
    }
    public void Setvolume_BL(double panjang,double lebar,double tinggi){
        volume = panjang * lebar * tinggi ;
    }

    // ini method getter
    public double Getpanjang_BL(){
        return this.panjang;
    }
    public double Getlebar_BL(){
        return this.lebar;
    }
    public double Gettinggi_BL(){
        return this.tinggi;
    }
    public double GetluasPermukaan_BL (){
        return luasPermukaan;
    }
    public double Getvolume_BL (){
        return volume;
    }

}
