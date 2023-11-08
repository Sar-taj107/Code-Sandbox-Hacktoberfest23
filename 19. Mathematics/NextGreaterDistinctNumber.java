import java.util.*;
/*
Write a program to find the next greater distinct number of a given four digit number.
number range  1000 <= n <= 9000.
*/
public class NextGreaterDistinctNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a four digit number:");
		int n=sc.nextInt();
		int ans= greaterDistinctNum(n);
		System.out.println("Next greater distinct number:"+ans);
	}

	static boolean isDistinctNum(int n){
	    
	    String s= Integer.toString(n);
	    //System.out.println(s);
	    int size=s.length();
	    for(int i=0; i<size; i++){
	        for(int j=i+1; j<size; j++){
	            if(s.charAt(i) == s.charAt(j))
	            return false;
	        }
	    }
	    return true;
	}

	static int greaterDistinctNum(int n){
	    while(true){
	        n++;
	        if(n>9000){
	            n=1000;
	        }
	        
	        if(isDistinctNum(n)){
	        return n;
	        }
	    }
    }
}


/*

Output:

Enter a four digit number:
1234
Next greater distinct number:1235

Enter a four digit number:
3246
Next greater distinct number:3247

Enter a four digit number:
9003
Next greater distinct number:1023

*/