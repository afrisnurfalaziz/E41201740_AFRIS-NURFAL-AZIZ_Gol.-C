/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_A;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Tugas_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int awal;
        int akhir;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Batas Awal Bilangan = ");
        awal = scan.nextInt();
        
        System.out.print("Batas Akhir Bilangan = ");  
        akhir = scan.nextInt();
        
        for (int i = awal; i <= akhir; i++) {
            if(i % 2 == 0){
        System.out.print(i + "");
        }
        System.out.print(" ");
    
        }
    }
}

