import java.util.*;
public class UsingArrList{
    public static void main(String[] args){
        MyStack s = new MyStack();
        s.push(5);
        s.push(15);
        int a= s.pop();
        System.out.println(a);
        System.out.println(s.pop());
    //    System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        
        

       
    }
    
}
class MyStack{
    ArrayList <Integer> al =new ArrayList<>();
void push(int a){
    al.add(a);
   
}
int pop(){
    int a=al.get(al.size()-1);
    al.remove(al.size()-1);
    return a;
}
int peek(){
    return al.get(al.size()-1);
}
int size(){
    return al.size();
}
boolean isEmpty(){
    return al.isEmpty();
}
}
