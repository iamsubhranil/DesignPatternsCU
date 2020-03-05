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
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Shape.getArea(1, 2));
        System.out.println(Shape.getArea(4));
        System.out.println(Shape.getArea(2.1217812));
        System.out.println(Shape.getArea(3, 4, 5));
        
        System.out.println(Shape.getPerimeter(12, 13));
        System.out.println(Shape.getPerimeter(8));
        System.out.println(Shape.getPerimeter(4.54523));
        System.out.println(Shape.getPerimeter(7, 8, 9));
    }
    
}
