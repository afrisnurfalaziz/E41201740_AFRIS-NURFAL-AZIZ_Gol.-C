/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_B;

/**
 *
 * @author Acer
 */
public class Tugas_b {
    public static void main(String[] args) {
        int a = 1;
        
        System.out.println("          Do_While          ");
        System.out.println("Bilangan ke;ipatan 2 (1-100)");
        System.out.println("============================");
        
        do {
            System.out.print(a + " ");
            a = a * 2;
            System.out.print(" ");
        } while (a <= 100);
    }
}
