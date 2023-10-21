class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int add(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
}

class Adder extends Arithmetic {

}

public class Inheritance {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10, 32) + " " + a.add(10, 3, 4));
    }
}
