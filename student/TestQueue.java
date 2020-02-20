/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class TestQueue {
    
    static Student inputStudent(Scanner s) {
        System.out.println("Enter student name : ");
        String name = s.next();
        System.out.println("Enter student roll : ");
        String roll = s.next();
        System.out.println("Enter student marks : ");
        int marks = s.nextInt();
        Student st = new Student(name, roll, marks);
        return st;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter number of students : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        Queue q = new Queue(100);
        while(num-- > 0) {
            System.out.println("Enter details of student " + (num + 1));
            q.insert(inputStudent(s));
        }
        while(true) {
            System.out.println("1. Insert\n2. Delete\n3. Traverse : ");
            String ch = s.next();
            switch(ch) {
                case "1":
                    q.insert(inputStudent(s));
                    break;
                case "2":
                    System.out.println("Student deleted: "+ q.remove());
                    break;
                case "3":
                    q.traverse();
                    break;
                default:
                    System.out.println("Do you really want exit? (Y/y) ");
                    ch = s.next();
                    if(ch.charAt(0) == 'Y' || ch.charAt(0) == 'y') {
                        return;
                    }
                    break;
            }
        }
    }
}
