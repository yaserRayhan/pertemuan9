/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author sutisna
 */
public class Siswa extends pelajar{
    private String nim,asalSekolah;
    private long nilai;
    public Siswa(String nama,long tinggi, long berat,String nim,String asalSekolah,long nilai){
        super(nama,tinggi,berat);
        this.nim=nim;
        this.asalSekolah=asalSekolah;
        this.nilai=nilai;
    }
    
    public String tampilSiswa(){
        return (super.tampilPelajar()+"nim\t: "+nim+"\nAsalSekolah\t: "+asalSekolah+"\nNilai\t: "+nilai);
    }
}
