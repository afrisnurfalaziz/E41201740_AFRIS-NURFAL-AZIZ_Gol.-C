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
public class Tugas_b_kelipatan {
    public static void main(String[] args) {
        int i = 1;
        
        System.out.println("          If_Else           ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        for(i=1; i<=100; i++) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
            else
            {
                System.out.print(" "); 
            }
        }
    }
}
