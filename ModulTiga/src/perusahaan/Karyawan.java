/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perusahaan;

/**
 *
 * @author ACER
 */
public class Karyawan {
    public String nama;
    private double gaji;
    
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    
    public double getGaji(){
        return this.gaji;
    }
    
    public void printTotalGaji(double tambahan){
        System.out.println("total gajiku : " + (this.gaji+tambahan));
    }
    
    public void printTotalGaji(){
        System.out.println("total gajiku : " + this.gaji);
    }
    
    public void jingle(){
        System.out.println("aku karyawan keren super keren jinjja keren jos pokoknya");
    }
    
    public void bekerja(){
        System.out.println(this.nama + " sedang bekerja");
    }
    
//    public void tampilGaji(){
//        System.out.println("gaji " + this.nama + " : " + this.gaji);
//    }
}
