package bangunruang;
import java.util.Scanner;
    //Enggar Lanang Nandhito Agil Ghibran
    //20200801076

public class Kubus extends BangunRuang {
    //deklarasi variabel
    private double rusuk;
    private double luasPermukaan;
    private double volume;
    //konstruktor 
    /*Kubus(double rusuk){
        this.rusuk = rusuk ;
    }*/
    Kubus(){
        this.rusuk = rusuk ;
    }
    //Method
    double luasPermukaan(){
        luasPermukaan = rusuk * rusuk ;
        return luasPermukaan;
    }
    double volume(){
        volume = rusuk * rusuk * rusuk ;
        return volume;
    }

    // ini method setter
    public void Setrusuk_KB(double rusuk){
        this.rusuk = rusuk ;
    }
    public void SetluasPermukaan_KB(double rusuk){
        luasPermukaan = rusuk * rusuk ; 
    }
    public void Setvolume_KB(double rusuk){
        volume = rusuk * rusuk * rusuk ;
    }

    // ini method getter
    public double Getrusuk_KB(){
        return this.rusuk;
    }
    public double GetluasPermukaan_KB (){
        return luasPermukaan;
    }
    public double Getvolume_KB (){
        return volume;
    }
}
