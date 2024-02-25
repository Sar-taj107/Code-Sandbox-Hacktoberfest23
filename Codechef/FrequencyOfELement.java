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
