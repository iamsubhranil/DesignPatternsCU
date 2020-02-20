/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author USER
 */
public class Student {

    private final String name;
    private final String rollNo;
    private final int marks;

    public Student(String name, String rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "[roll:"+rollNo+",name:"+name+",marks:"+marks+"]";
    }
    
}
