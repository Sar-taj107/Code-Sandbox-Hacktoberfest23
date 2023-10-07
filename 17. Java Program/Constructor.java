public class Constructor {
    
    
        public static void main(String[] args){
            Construct taj = new Construct(7,8,9);
            taj.print();
        }
    }
    class Construct{
        int x,y,z;
        Construct(int a, int b, int c){
            x=a;
            y=b;
            z=c;
        }
        void print(){
            System.out.println(x+" "+y+" "+z);
        }
        
    }
    

