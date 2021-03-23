/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Acer
 */
public class Tugas_b {
    public static void main(String[] args) {
        int jumlah =0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Masukkan Jumlah Deret Array : ");
        jumlah = scan.nextInt();
        
        for (int i = 0; i <= jumlah - 1; i++){
            int[] acak = new int[jumlah];
            acak[i] = random.nextInt(100);
            System.out.print(acak[i] + " ");
        }
        System.out.println(" ");
    }
}
