/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanA2_Array1D;

/**
 *
 * @author Acer
 */
public class Array1D {
    public static void main(String[] args) {
        int[] angka = {5, 10, 17, 20, 1};
        String[] teks = {"Saya","Sedang","Belajar","OOP","Java"};
        
        for(int i=0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        
        for(int j=0; j<teks.length; j++){
            System.out.print(teks[j]);
            System.out.print(" ");
        }
    }
    
}
