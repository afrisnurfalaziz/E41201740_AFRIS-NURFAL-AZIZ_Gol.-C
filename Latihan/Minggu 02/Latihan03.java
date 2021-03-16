/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan03;

/**
 *
 * @author Acer
 */
public class Latihan03 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        class book {
            int price;
            int pages;
            
        public void set (int price, int pages) {
            this.price = price;
            this.pages = pages;
        }
        
        public void show () {
            System.out.println("books information");
            System.out.println("books price : " +price);
            System.out.println("number of pages : " +pages);
        }
    }
        book javabook = new book();
        javabook.set(6000, 100);
        javabook.show();
        
    }
}
