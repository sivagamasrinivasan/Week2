/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package printstudent;

/**
 *
 * @author Sivagama
 */
public class PrintStudent {

    /**
     * define and print 3 student details
     */
    public static void main(String[] args) 
    {
       Student s1 = new Student();
       s1.setName("peter");
       s1.setAge(20);
       Student s2 = new Student();
       s2.setName("john");
       s2.setAge(21);
       Student s3 = new Student();
       s3.setName("radwan");
       s3.setAge(19);
       Student[] list = new Student[3]; //array of object declaration
       list[0]= s1; // objects saved in array
       list[1]=s2;
       list[2]=s3;
       for( int i=0;i<=list.length-1;i++)
       {
           System.out.println(list[i].getName()+" "+list[i].getAge());
       }
    }

}
