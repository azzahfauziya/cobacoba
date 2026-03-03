/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perusahaan;

/**
 *
 * @author ACER
 */
public class Manager extends Karyawan{
    public void menyuruh() {
        System.out.println("KERJA SANA!!!");
    }
    
    @Override
    public void jingle(){
        super.jingle();
        System.out.println("aku manager keren!!");
    }
}
