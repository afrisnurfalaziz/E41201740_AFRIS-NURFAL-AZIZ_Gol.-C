/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Acer
 */
public abstract class A { //Deklarasi class
    abstract public void method2(); //Deklarasi method abstract.
    //Method konkrit yang memiliki implementasi.
    public void method1() {
        System.out.println("Method konkret dari class A");
    }
}
