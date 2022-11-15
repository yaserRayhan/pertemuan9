/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan4;

/**
 *
 * @author Yaser
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BukuGambar bg=new BukuGambar("B001","BUKU GAMBAR",2500,3000,5,2);
        BukuGambar pn=new BukuGambar("P002","PENSIL 2B",1500,1750,10,1);
        System.out.println(bg.TampilBuku());
        System.out.println("----------------------------------");
        System.out.println(pn.TampilBuku());
        
    }
    
}
