/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan04;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Latihan04 {
    
    public static void main(String[] args) {
        // Buat Scanner
        Scanner sl = new Scanner(System.in);
        
        // Ambil Nilai Dari Keyboard
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = sl.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = sl.nextInt();
        
        //Hitung dan Print
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
