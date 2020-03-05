/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author USER
 */
public class Shape {
    static double getArea(double a, double b) {
        System.out.println("Area of a rectangle of size (" + a + ", " + b + ") : ");
        return a*b;
    }
    static int getArea(int a) {
        System.out.println("Area of a square of size (" + a + ") : ");
        return a*a;
    }
    static double getArea(double r) {
        System.out.println("Area of a circle of radius (" + r + " : ");
        return Math.PI * r * r;
    }
    static double getArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s - a)*(s - b)*(s - c));
    }
    
    static double getPerimeter(double a, double b) {
        return 2*(a + b);
    }
    static double getPerimeter(int a) {
        return 4 * a;
    }
    static double getPerimeter(double r) {
        return 2 * Math.PI * r;
    }
    static double getPerimeter(double a, double b, double c) {
        return (a + b + c);
    }
}
