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
public class Anonymousdemo {
    
    
    public static void main(String []args){
    
    Anonym anonymous = new Anonym(){
    
    
    
    public void getMethod(){
    
    System.out.println("The value of x is: " +x);
    
    }
    
    
    };
    
    anonymous.getMethod();
    
    
    }
    
}


abstract class Anonym{

int x = 32;

public void getMethod(){};




}
