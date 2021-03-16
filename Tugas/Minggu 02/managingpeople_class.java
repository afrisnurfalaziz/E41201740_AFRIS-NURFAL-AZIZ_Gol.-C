/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

/**
 *
 * @author Acer
 */
public class managingpeople_class {
    
    String name;
    int age;
    
    public managingpeople_class (String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName (){
        return name;
    }
    
    public int getAge (){
        return age;
    }
}
