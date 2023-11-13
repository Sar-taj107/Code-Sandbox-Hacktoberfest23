//2785. Sort Vowels in a String
import java.util.*;
public class SortVowelString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String:");
		String s=sc.nextLine();
		
		String ans = sortVowels(s);
		System.out.println("sorted Vowel String:"+ans);	
	}

	public static boolean isVowel(char ch){
	    ch = Character.toLowerCase(ch);
	    return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
	}
    
	public static String sortVowels(String s){
	    
	    int n=s.length();
	    StringBuilder sb = new StringBuilder();
	    char[] ch= s.toCharArray();
	    for(int i=0; i<n; i++){
	        if(isVowel(ch[i])){
	            sb.append(ch[i]);
	        }
	    }
	    
	    char[] sortedVowel =sb.toString().toCharArray();
	    Arrays.sort(sortedVowel);
	    int j=0;
	    StringBuilder res = new StringBuilder(s);
	    for(int i=0; i<n; i++){
	        if(isVowel(ch[i])){
	            res.setCharAt(i,sortedVowel[j]);
	            j++;
	        }
	    }
	    return res.toString();
    }
}

/*
Output:

Enter a String:lEetcOde
sorted Vowel String:lEOtcede

Enter a String:TajUddIn
sorted Vowel String:TIjUddan

*/