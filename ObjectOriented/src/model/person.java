/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import objectoriented.ObjectOriented;

/**
 *
 * @author jeancastro
 */
public class person {
    
 //Attributes
        String name;
        double height;
        char gender;
        
       
    //constructor for the custom values
    /**
     * 
     
     * @param name is the name of the person
     * @param height how tall is the person 
     * @param gender 
     */
        
    public person (String name, double height, char gender) {
        
        
        this.name = name;
        this.height = height;
        this.gender = gender;
        
        
    }
    /**
     * default constructor
     */
    
    public person () {
        
        this.name = "Amilcar";
        this.gender = 'M';
        this.height = 1.77;
    }
    
    public void walk() {
        
        System.out.println(name + "is walking");
    
}
    public void sing() {
        System.out.println(name + " is singing");
        
    }
    
}
    
