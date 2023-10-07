import java.util.*;

public class UsingArray {
    public static void main(String[] args){
        MyStack s = new MyStack(4);
        s.push(5);
        s.push(15);
        s.push(25);
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.push(35);
        
        System.out.println(s.size());
        System.out.println(s.isEmpty()); 
        
    }


}
class MyStack{
    int arr[];
    int top=-1;
    MyStack(int a){
        arr =new int[a];

    }

void push(int a){
    top++;
    arr[top]=a;
   
}

void print(){
    arr[top+1]=10;
  
   System.out.println(arr[top+1]);
   
}
int pop(){
    int a=arr[top];
    top--;
    return a;

}
int peek(){
    return arr[top];
}
int size(){
    int a=top+1;
    return a;
}
boolean isEmpty(){
    return top==-1;
}

}
    

