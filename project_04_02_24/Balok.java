/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_04_02_24;

/**
 *
 * @author LOQ
 */
public class Balok {
    private int panjang, lebar, tinggi, la, lp, volume;
    
    public Balok(){
    }
    public Balok(int panjang){
         this.panjang = panjang;
    }
    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int getTinggi(){
        return tinggi;
    }
    
    public void setPanjang (int panjang){
        this.panjang = panjang;
    }
    public void setLebar (int lebar){
        this.lebar = lebar;
    }
    public void setTinggi (int tinggi){
        this.tinggi = tinggi;
    }
    
    public int hitungLA(){
        return panjang*lebar;
    }
    public int hitungLP(){
        int lp;
        lp = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
        return lp;
    }
    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
    public int hitungVolume(int la){
        return la*tinggi;
    }
    
    public void printBalok(){
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar   = " + lebar);
        System.out.println("Tinggi  = " + tinggi);
    }
    
    public void printBalok(int la, int lp, int volume){
        System.out.println("Luas alas = " + la);
        System.out.println("Luas Permukaan = " + lp);
        System.out.println("Volume    = " + volume);
    }
    
}
