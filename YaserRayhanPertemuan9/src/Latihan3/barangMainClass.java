/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class barangMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang brn =new Barang();
        
        brn.input(JOptionPane.showInputDialog("Masukan Kode"), 
                JOptionPane.showInputDialog("Masukan Nama"), 
                parseInt(JOptionPane.showInputDialog("Masukan HPP")), 
                parseInt(JOptionPane.showInputDialog("Masukan Harga")), 
                parseInt(JOptionPane.showInputDialog("Masukan Stok")));
        
        brn.Pembelian( parseInt(JOptionPane.showInputDialog("Masukan JumlahBeli")));
        
        brn.hitungLaba();
    }
    
}
