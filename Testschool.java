/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationdemo;

/**
 *
 * @author alfar
 */
public class Testschool {
    
    public static void main(String [] args){
    
        School school = new School();
        
        school.addStudent("Alfar",26);
        
        school.addStudent("Gihan", 17);
        
        school.getstudent();
    
    
    }
    
}
