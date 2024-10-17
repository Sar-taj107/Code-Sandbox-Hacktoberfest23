abstract class bank{ //An abstract class with a function without any defination, hence any function can use this method with their own definatio
    abstract void get_balance();
}
class bank1 extends bank {
    void get_balance(){
        int a=1000;
        System.out.println("The balance in bank 1 is "+ a);
    }
}
class bank2 extends bank {
    void get_balance(){
        int b=1500;
        System.out.println("The balance in bank 2 is "+ b);
    }
}
class bank3 extends bank {
    void get_balance(){
        int c=2000;
        System.out.println("The balance in bank 3 is "+ c);
    }
}
public class abstract_bank {
    public static void main(String[] args) {
        bank1 obj = new bank1();
        bank2 obj1 = new bank2();
        bank3 obj2 = new bank3();
        obj.get_balance();
        obj1.get_balance();
        obj2.get_balance();


    }
}
