package polymorphism;

import java.util.Arrays;

public class Polymorphism {

    public static void main(String[] args) {
        
        Circle c = new Circle(5);
        
        System.out.println(c.area());
        
        Triangle t = new Triangle(5, 6);
        
        System.out.println(t.area());
        
        Rectangular r = new Rectangular(50, 60);
        
        System.out.println(r.area());
//        Shape[] shapes = new Shape[3];
//
//        shapes[0] = new Circle(5);
//        shapes[1] = new Rectangular(20, 30);
//        shapes[2] = new Triangel(30, 20);
//
//        System.out.println(Arrays.deepToString(shapes));
//
//        for (Shape shp : shapes) {
//
//            System.out.println(shp.area());

        }
    }


