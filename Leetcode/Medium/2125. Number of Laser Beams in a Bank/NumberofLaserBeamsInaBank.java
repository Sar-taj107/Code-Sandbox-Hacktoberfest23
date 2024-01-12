//package Medium.2125. Number of Laser Beams in a Bank;
import java.util.*;
public class NumberofLaserBeamsInaBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array Bank: ");
        int n=sc.nextInt();
        String[] bank = new String[n];
        System.out.println("Enter the Element as binary string: ");
        for(int i=0; i<n; i++){
            bank[i] = sc.next();
        }
        int ans = numberOfBeams(bank);
        System.out.println("Total number of laser beams: "+ans);
    }
    public static int numberOfBeams(String[] bank){

        int n=bank.length;
        int prevDevCount =0;
        int res =0;
        for(int i=0; i<n; i++){
            int currDevCount=0;
            String str =bank[i];
            for(int j=0; j<str.length(); j++){
                char ch=str.charAt(j);
                if(ch == '1'){
                    currDevCount++;
                }
            }
            res += (prevDevCount * currDevCount);
            if(currDevCount != 0){
                prevDevCount = currDevCount;
            }
        }
        return res;
    }
}

/*
OUTPUT:

Enter the size of array Bank: 4
Enter the Element as binary string:
011001 000000 010100 001000
Total number of laser beams: 8

Enter the size of array Bank: 3
Enter the Element as binary string:
000 111 000
Total number of laser beams: 0
 
*/
