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
public class Queue {
        
    private final int size;
    private int rear, front;
    private final Student data[];
    
    public Queue(int s) {
        size = s;
        rear = front = 0;
        data = new Student[size];
    }
    
    void insert(Student s) {
        if(rear == size) {
            System.out.println("Queue is full!");
        }
        else {
            data[rear++] = s;
        }
    }
    
    Student remove() {
        if(front == rear) {
            System.out.println("Queue is empty!");
            return null;
        } else {
            return data[front++];
        }
    }
    
    void traverse() {
        for(int i = front; i < rear;i++) {
            System.out.println(data[i]);
        }
    }
}
