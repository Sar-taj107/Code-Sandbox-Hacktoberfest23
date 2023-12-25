//package Easy.1758. Minimum Changes To Make Alternating Binary String;
import java.util.*;
public class MinimumChangesToMakeAlternatingBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary String: ");
        String s=sc.nextLine();
        int ans = countAlternateString(s);
        System.out.println(ans);
    }
    public static int countAlternateString(String s){

        int n=s.length();
        int countAlaternateOne=0;
        int countAlternateZero=0;

        for(int i=0; i<n; i++){
            if(i%2 == 0){
                if(s.charAt(i) == '0'){
                    countAlaternateOne++;
                }else{
                    countAlternateZero++;
                }
            }else{
                if(s.charAt(i) == '1'){
                    countAlaternateOne++;
                }else{
                    countAlternateZero++;
                }
            }
        }
        return Math.min(countAlaternateOne, countAlternateZero);
    }
}

/*
OUTPUT:

Enter the binary String: 0100
Minimum change: 1

Enter the binary String: 10
Minimum change: 0

Enter the binary String: 1111
Minimum change: 2

*/