/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Acer
 */
public class BubbleSort_Descending {
    public static void main(String[] args) {
        int arr[] = {3,60,35,2,45,320,5};
        
        System.out.println("Array Before Bubble Sort");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        bubbleSort(arr); //sorting array elemente using bubble sort
        
        System.out.println("");
        
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
 }
    }
    
 
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
 
        for(int i=0; i < n; i++){
        for(int j=1; j < (n-i); j++){
 
            if(arr[j-1] < arr[j]){
                
                //swap the elements!
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                }
            }
        }
    }
}
