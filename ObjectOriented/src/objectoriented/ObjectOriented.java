/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objectoriented;

import model.person;



/**
 *
 * @author jeancastro
 */
public class ObjectOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        person p1 = new person();
        person p2 = new person("ken", 3.0, 'M');
        
        System.out.println("--Person ONE--");
        p1.walk();
        p1.sing();
        
        System.out.println("--Person TWO-");
        p2.walk();
        p2.sing();
        
        p2.name = "Greg";
        System.out.println("--Person TWO again--");
        p2.walk();
        p2.sing();
               
    }
    
}