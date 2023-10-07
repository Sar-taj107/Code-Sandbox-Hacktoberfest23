/* Create a object of dogs tiger and the necessary methods to concept of method overloading.*/

import java.util.Scanner;

class Animal
{
    void sound()
    {
        System.out.println("sound of animals, which varies");
    }
        boolean hasLife(){
            return true;
        }
        boolean hasTail(){
            return true;
        }
        int noOfEyes(){
            return 2;
        }
        int noOfLegs(){
            return 4;
        }
    
}
class Dog extends Animal
{
    void sound(){
        System.out.println("Barking...");
    }
}
class Tiger extends Animal
{
    void sound(){
        System.out.println("Roaring...");
    }
}
public class MethodOverloading
{
    public static void main(String[] args)
    {
        Animal ob = new Animal();
        Dog ob2 = new Dog();
        Tiger ob3 = new Tiger();
        ob.sound();
        ob2.sound();
        ob3.sound();
    }
}
