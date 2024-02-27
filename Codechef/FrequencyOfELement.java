package Codechef;

import java.util.Scanner;
public class FrequencyOfELement {
    	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Element: ");
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		findFreq(arr);
	}
	public static void findFreq(int[] arr){
	    int n=arr.length;
	    int[] freq = new int[n+1];
	    for(int num : arr){
	        freq[num]++;
	    }
	    for(int i=0; i<=n; i++){
	        System.out.println("Frequency of "+i+" :"+freq[i]+"");
	    }
	}
}
/*
Output:

Enter array size : 5
Enter the Element: 2 2 3 3 3
Frequency of 0 :0
Frequency of 1 :0
Frequency of 2 :2
Frequency of 3 :3
Frequency of 4 :0
Frequency of 5 :0

Enter array size : 7
Enter the Element: 1 1 2 3 5 5 5
Frequency of 0 :0
Frequency of 1 :2
Frequency of 2 :1
Frequency of 3 :1
Frequency of 4 :0
Frequency of 5 :3
Frequency of 6 :0
Frequency of 7 :0

*/
