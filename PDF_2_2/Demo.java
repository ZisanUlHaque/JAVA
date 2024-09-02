/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDF_2_2;

/**
 *
 * @author ZISAN
 */
public class Demo {
    public static void main(String ar[]){
        Student s1 = new Student();
        s1.showData();
        
        Student s2 = new Student();
        s2.showData();
    }
}
class Student{
    int a;
    static int b;
    Student(){
       
        b++;
    }
    public void showData(){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
}