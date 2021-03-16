/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_a;

/**
 *
 * @author Acer
 */
public class person {

    String fName;
    String IName;
    String stuId;
    String stuStatus;
    
    private void setfName (String fName) {
        this.fName = fName;
    }
    
    private String getfName() {
        return fName;
    }
    
    private void setIName (String IName) {
        this.IName = IName;
    }
    
    private String getIName() {
        return IName;
    }
    
    private void setstuId (String stuId) {
        this.stuId = stuId;
    }
    
    private String getstuId() {
        return stuId;
    }
    
    private void setstuStatus (String stuStatus) {
        this.stuStatus = stuStatus;
    }
    
    private String getstuStatus() {
        return stuStatus;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        person student = new person();
        student.setfName("LIsa");
        student.setIName("Palombo");
        student.setstuId("123456789");
        student.setstuStatus("Active");
        
        System.out.println("Student Name    : " + student.getfName() + " " + student.getIName());
        System.out.println("Student ID      : " + student.getstuId());
        System.out.println("Student Status  : " + student.getstuStatus());   
    }
    
}
