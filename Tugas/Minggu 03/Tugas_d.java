/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_d;

import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Tugas_d {
     public static void main(String[] args) {
         String nama;
         int harga1, harga2, harga3, harga4, harga5;
         int Jumlah;
         Scanner scan;
         scan = new Scanner(System.in);
         
         System.out.println("----------------------------------------------");
         System.out.println("         Khasrisma Agung Plaza < KAP >        ");
         System.out.println("           Promo Belanja Berhadiah            ");
         System.out.println("       Khusus Pembelian 5 Barang Pertama      ");
         System.out.println("        Dengan harga minimum Rp. 1000.00      ");
         System.out.println("----------------------------------------------");
         
         System.out.print("Masukkan nama pembeli : ");
         nama = scan.nextLine();
         System.out.println(" ");
         
         System.out.print("Masukkan harga barang ke-1      = ");
         harga1 = scan.nextInt();
         System.out.print("Masukkan harga barang ke-2      = ");
         harga2 = scan.nextInt();
         System.out.print("Masukkan harga barang ke-3      = ");
         harga3 = scan.nextInt();
         System.out.print("Masukkan harga barang ke-4      = ");
         harga4 = scan.nextInt();
         System.out.print("Masukkan harga barang ke-5      = ");
         harga5 = scan.nextInt();
         
         Jumlah = harga1 + harga2 + harga3 + harga4 + harga5;
         System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp. " + Jumlah);
         System.out.println(" ");
         
         if (Jumlah >= 10000) {
             System.out.println("Selamat.....");
             System.out.println("Anda mendapatkan hadiah 1 buah mug cantik ");
         }
         System.out.println("----------------------------------------------");
         System.out.println("                 Terima kasih                 ");
         System.out.println("  Anda sudah balanja di Kharisma Agung Plaza"  );
         
     }
}
