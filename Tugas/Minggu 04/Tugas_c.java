/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_C;

import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Tugas_c {
    public static void main(String[] args) {
        int nilai[]; int banyakdata; int rata_rata;
        int jumlahnilai = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Data Nilai = ");
        banyakdata = scan.nextInt();
        nilai = new int[banyakdata];
        
        for (int a = 0; a < banyakdata; a++) {
            System.out.print("Masukkan data nilai ke-" + (a + 1) + " = ");
            nilai[a] = scan.nextInt();
            
            jumlahnilai += nilai[a];
        }
        
        int min = nilai[0]; int max = nilai[0];
        
        for (int b = 0; b < banyakdata; b++) {
            if (nilai[b] > max) {
                max = nilai[b];
            }
        }
        
        for (int c = 0; c < banyakdata; c++) {
            if (nilai[c] < min) {
                min = nilai[c];
            }
        }
        
        rata_rata = jumlahnilai / banyakdata;
        System.out.println("");
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maksimum = " + max);
        System.out.println("Nilai rata-ratanya adalah = " + rata_rata);
    }
}
