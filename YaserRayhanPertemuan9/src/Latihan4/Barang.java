/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

/**
 *
 * @author Yaser
 */
public class Barang {
    private String kode;
    private String nama;
    
    public Barang(String kode,String nama){
        this.kode=kode;
        this.nama=nama;
    }
    
    public String tampilBarang(){
        return("INPUT:\nKode\t\t: "+kode+"\nNama\t\t: "+nama+"\n");
    }
}
