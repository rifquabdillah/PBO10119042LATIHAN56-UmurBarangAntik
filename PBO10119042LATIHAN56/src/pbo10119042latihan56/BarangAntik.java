/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan56;

/**
 *
 *@author Muhammad Rifqu Abdillah
 * Kelas    : IF-1
 * NIM      : 10119042 
 */
public class BarangAntik {
  private final int umur;
    
    public BarangAntik(int umur){
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " + this.umur + " tahun");
    }  
}
