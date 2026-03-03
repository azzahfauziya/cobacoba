/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modultiga;

import perusahaan.Karyawan;
import perusahaan.Manager;

/**
 *
 * @author ACER
 */
public class ModulTiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager azzah = new Manager();
        azzah.setGaji(1000000000);
        azzah.nama = "Azzah";
        
        Karyawan edo = new Karyawan();
        edo.setGaji(1000);
        edo.nama = "edow";
        
        ModulTiga.meeting(azzah,edo);
        
        azzah.bekerja();
        azzah.menyuruh();
        azzah.jingle();
        azzah.printTotalGaji(2000000000);
        
        edo.bekerja();
        edo.jingle();
        edo.printTotalGaji();
    }
    
    public static void meeting(
            Karyawan karyawanOne, 
            Karyawan karyawan){
        karyawanOne.jingle();
        karyawan.jingle();
    }
    
}
