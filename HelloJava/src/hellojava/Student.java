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
public class Student {
    
    int Sid;
    String Name;
    int[] Marks;
    int total;

    public Student() {
        
        Sid = 1;
        Name = "ias";
        Marks = new int[]{};
        total = 0;
    }

    public Student(int Sid, String Name, int[] Marks, int total) {
        this.Sid = Sid;
        this.Name = Name;
        this.Marks = Marks;
        this.total = total;
    }
    
    void printStudentDetail(){
    
            System.out.println("Student id is" + Sid);
            System.out.println("Student Name is" + Name);
        int i;
            
            for(i = 0; i<Marks.length; i++)
            {
                System.out.println("Student Marks is" + Marks[i]);
                total = total + Marks[i];
            }
            
            System.out.println("Student Total is" + total);
}
    
    
    
}
