/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanDua;

import javax.swing.*;

/**
 *
 * @author hp
 */
public class segitiga {
    String alas,tinggi;
    public void input(){
        alas=JOptionPane.showInputDialog("Masukan Alas");
        tinggi=JOptionPane.showInputDialog("Masukan Tinggi"); 
    }
    
    public double hitung(){
        long a=Long.parseLong(alas);
        long t=Long.parseLong(tinggi);
        return (0.5*a*t);
    }
    public void hasil(){
         JOptionPane.showMessageDialog(null,"0.5*"+alas+"*"+tinggi+" = "+hitung());
    }
}
