/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava;

/**
 *
 * @author macstudent
 */
public class HelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Java!!!");
        
        HelloJava obj = new HelloJava();
        obj.greet("Indravadan");
        obj.greet();
        obj.greet("IAS","123","ABC","XYZ");
        
    }
    
    void greet(String name)
    {
        System.out.println("Welcome," + name);
    }
    
    void greet(String... names)
    {
        
        System.out.println("Welcome," + names.length);
        for(int i=0; i<names.length; i++)
        {
            System.err.println("Welcome," + names[i]);
        }
        
        for (String name : names) {
            System.err.println("Welcome," + name);
        }
    }
    
    void greet()
    {
        System.out.println("Welcome, Indra" );
    }
    
    
}
