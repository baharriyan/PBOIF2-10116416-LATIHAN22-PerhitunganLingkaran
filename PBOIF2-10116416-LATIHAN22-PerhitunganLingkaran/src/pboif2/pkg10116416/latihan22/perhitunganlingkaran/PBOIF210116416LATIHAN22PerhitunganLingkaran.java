/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116416.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Riyan bahar
 * nim: 10116416
 * PBOIF2
 */
public class PBOIF210116416LATIHAN22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("========Perhitungan Lingkaran========");
        System.out.print("Masukan nilai diameter lingkaran :");
        Scanner scanner = new Scanner(System.in);
        int diameter = scanner.nextInt();
        
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + (diameter/2));
        System.out.println("Luas Lingkaran      = " + (3.14*(diameter/2)*(diameter/2)));
        System.out.println("Keliling Lingkaran  = " + (2*3.14*(diameter/2)));
    }
    
}
