
//find the unique binary string/
import java.util.*;
public class UniqueBinaryString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		String[] nums = new String[n];
		System.out.println("Enter string in array:");
		for(int i=0; i<n; i++){
		    nums[i]=sc.next();
		}
		String ans=uniqueBinString(nums);
		System.out.println("unique Binary String: "+ans);
		
	}
	public static String uniqueBinString(String[] nums){
	    
	    int n=nums.length;
	    String res="";
	    for(int i=0; i<n; i++){
	        String str=nums[i];
	        char ch=str.charAt(i);
	        if(ch=='0'){
	            res += '1';
	        }else{
	            res += '0';
	        }
	       //res += str.charAt(i)=='0' ? '1' : '0';          //or use this only ternary operattoe
	    }
	    return res;
    }
}

/*
Output:

Enter the array size: 2
Enter string in array:
11
10
unique Binary String: 01

Enter the array size: 3
Enter string in array:
111
101
110
unique Binary String: 011

*/
