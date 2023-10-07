import java.util.Scanner;

/*
 ques zero- one triangle 
                            1
                            0 1
                            1 0 1
                            0 1 0 1
                            1 0 1 0 1

 */

public class ZeroOnetriangle {
    public static void main(String[] args) {
        System.out.print("Enter the number of row:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                int sum=(i+j);
                if(sum % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
