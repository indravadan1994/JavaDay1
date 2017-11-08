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
public class CallStudent {
    public static void main(String[] args){
        
        Student s;
        s = new Student();
//        s.Name = "Indravadan";
//        s.Sid = 1;
//        s.Marks = new int[]{20,30,40};
//        
        s.setStudentData(1, "indra", new int[]{20,30,36,34,20});
      // s.total = 100;
       
       s.printStudentDetail();
       s.Total();
s.calcResult();
    }
 
   
}
     