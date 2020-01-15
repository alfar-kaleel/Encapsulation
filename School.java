/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationdemo;

import java.util.ArrayList;

/**
 *
 * @author alfar
 */



class student {
    
    public String Name;
    public int Age;
    
    public student(String name, int age){
    
    this.Name = name;
    
   this.Age = age;
    
    }
    
}



public class School{

    private static ArrayList<student> students = new ArrayList();

public void addStudent(String name,int age){

    students.add(new student(name,age));



}


public void getstudent(){

for(student student : students){

System.out.println("The student is :" + student.Name +" "+ "Age is : " + student.Age );


}


}


}

