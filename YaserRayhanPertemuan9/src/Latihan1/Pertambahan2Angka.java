/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import static java.lang.Integer.parseInt;
import javax.swing.*;

/**
 *
 * @author yaser
 * 
 */
public class Pertambahan2Angka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String angka1,angka2;
        
        angka1=JOptionPane.showInputDialog("Masukan Angka Pertama");
        angka2=JOptionPane.showInputDialog("Masukan Angka Kedua");
        
        JOptionPane.showMessageDialog(null,parseInt(angka1)+parseInt(angka2));
    }
    
}
