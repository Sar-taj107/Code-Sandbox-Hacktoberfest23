import java.util.Scanner;

/*
ques: Floys triange.

                    1
                    2 3
                    4 5 6 
                    7 8 9 10
                    11 12 13 14 15

 */

public class FloydsTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the number of row:");
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();

        int x=1;
        //outer loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }

    }
}

/*
 OUTPUT:

Enter the number of row:5
1
2 3 
4 5 6
7 8 9 10
11 12 13 14 15

*/