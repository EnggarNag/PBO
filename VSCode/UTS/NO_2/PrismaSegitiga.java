package bangunruang;
import java.util.Scanner;
    //Enggar Lanang Nandhito Agil Ghibran
    //20200801076

public class PrismaSegitiga extends BangunRuang {
    //deklarasi variabel
    private double rusuk,tinggi;
    private double luasPermukaan;
    private double volume;
    //konstruktor 
    /*PrismaSegitiga (double rusuk, double tinggi){
        this.rusuk = rusuk ;
        this.tinggi = tinggi ;
    }*/
    PrismaSegitiga (){
        this.rusuk = rusuk ;
        this.tinggi = tinggi ;
    }

    //Method
    double luasPermukaan(){
        luasPermukaan = 0.5 * rusuk * tinggi ;
        return luasPermukaan;
    }
    double volume(){
        volume = (0.5 * rusuk * tinggi) * tinggi ;
        return volume ;
    }
    // ini method setter
    public void Settinggi_PS(double tinggi){
        this.tinggi = tinggi ;
    }
    public void Setrusuk_PS(double rusuk){
        this.rusuk = rusuk ;
    }
    public void SetluasPermukaan_PS(double rusuk,double tinggi){
        luasPermukaan = 0.5 * rusuk * tinggi ;
    }
    public void Setvolume_PS(double rusuk,double tinggi){
        volume = (0.5 * rusuk * tinggi) * tinggi ;
    }
    // ini method getter
    public double Gettinggi_PS(){
        return this.tinggi;
    }
    public double Getrusuk_PS(){
        return this.rusuk;
    }
    public double GetluasPermukaan_PS (){
        return luasPermukaan;
    }
    public double Getvolume_PS (){
        return volume;
    }
}