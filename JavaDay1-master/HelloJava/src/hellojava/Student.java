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
    
   private int Sid;
   private String Name;
   private int[] Marks;
   private int total;

    public Student() {
        
        Sid = 1;
        Name = "ias";
        Marks = new int[]{};
        total = 0;
    }

    public Student(int Sid, String Name, int[] Marks) {
        this.Sid = Sid;
        this.Name = Name;
        this.Marks = Marks;
       // this.total = total;
    }
    
    void setStudentData(int Sid, String Name, int[] Marks){
        
        
        this.Sid = Sid;
        this.Name = Name;
        this.Marks = Marks;
        //this.total = total;
    }
    
    void printStudentDetail(){
    
            System.out.println("Student id is " + Sid);
            System.out.println("Student Name is " + Name);
        
            //int i;
//            for(i = 0; i<Marks.length; i++)
//            {
//                System.out.println("Student Marks is " + Marks[i]);
//                total = total + Marks[i];
//            }
            
           // System.out.println("Student Total is " + total);
}
    void Total(){
        int i;
        for(i = 0; i<Marks.length; i++)
            {
                System.out.println("Student Marks is " + Marks[i]);
                total = total + Marks[i];
            }
        System.out.println("Student Total is " + total);
        
        int failSubject = 0;
     for ( i = 0; i < this.Marks.length; i++)
             {
                 
                 if(i<45)
                 {
                     failSubject = failSubject + 1;
                   
                 }
                     
             }
      if(failSubject >= 2)
                    {
                        System.out.println("Fail!!!!");
                    }
        //calcResult();
            
    }  
    
    void calcResult(){
        
       if (total >= 95)
{
    System.out.println("A+");
}
else if( total >= 85 && total < 95)
{
    System.out.println("A");
}
else if( total >=75 && total <85)
{
    System.out.println("B+");
}
else if(total >=65 && total < 75)
{
    System.out.println("B");
}
   else if(total >=55 && total < 65)
{
    System.out.println("C+");
}
else if(total >=50 && total < 55)
{
    System.out.println("C");
}
else if(total >=45 && total < 50)
{
    System.out.println("D+");
}
else if(total < 45)
{
    System.out.println("F");
}
}
    
    
}
