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
public class Innertest {
    
    public static void main(String [] args){
    
        Innerclassdemo outer = new Innerclassdemo();
    
    Innerclassdemo.Innerc inner = outer.new Innerc();
    
      System.out.println("The name accesed from innerclass is : " + inner.getName() );
      
      
    
    }
    
    
    
}
