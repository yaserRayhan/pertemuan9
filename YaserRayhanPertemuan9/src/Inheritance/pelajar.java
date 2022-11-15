/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author sutisna
 */
public class pelajar {
    private String nama;
    private Long tinggi;
    private Long berat;
    
    public pelajar(String nama, long tinggi, long berat){
        this.nama=nama;
        this.tinggi=tinggi;
        this.berat=berat;
    }
    
    public String tampilPelajar(){
        return ("Nama\t: "+nama+"\nTinggi\t: "+tinggi+"\nBerat\t: "+berat+"\n");
    }
}
