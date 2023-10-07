import java.util.*;
import java.util.Scanner;

abstract class Shape{
    abstract void area();
}
class Rectangle extends Shape{
    int length, breadth;
    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    void area()
    {
        System.out.println("Area of rectangle is"+(length*breadth));
    }
}
class Triangle extends Shape{
    int height,base;
    Triangle(int h, int b){
        height = h;
        base = b;
    }
    void area()
    {
        System.out.println("Area of triangle is"+(0.5*height*base));
    }
}

public class DynamicMethod {
    public static void main(String[] args){
        Shape ob;
        Rectangle ob1 = new Rectangle(2, 2);
        Triangle ob2 = new Triangle(6, 6);
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if(c == 't'){
            ob=ob2;
            ob.area();
        }
        else if(c == 'r'){
            ob=ob1;
            ob.area();
        }
        sc.close();
    }
}
