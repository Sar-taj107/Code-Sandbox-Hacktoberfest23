import java.util.*;
public class LongestWordInString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=sc.nextLine();
//  	int ans=longLenString(s);
// 		System.out.println(ans);
        String ans = findLongestWord(s);
		System.out.println("longest word present: "+ans);
	}
	
//1. for find the length of longest word in a given String
// 	public static int longLenString(String s){
	    
// 	    String[] word = s.split(" ");
// 	    int n=word.length;
// 	    int maxLen=0;
// 	    for(int i=0; i<n; i++){
// 	        int currLen=word[i].length();
// 	        maxLen = Math.max(maxLen,currLen);
// 	    }
// 	    return maxLen;

//2. for finding string itself(i.e the longest word in given string)
    public static String findLongestWord(String s){
        String[] word = s.split(" ");
        int n=word.length;
        int maxVal=0;
        String str="";
        for(int i=0; i<n; i++){
            int currMax=word[i].length();
            if(currMax>maxVal){
                maxVal=currMax;
                str=word[i];
            }
        }
        //System.out.println(str);
        return str;
    }
}

/*

output:
Enter the string: why java is platform independent
longest word present: independent

Enter the string: sunday is holyday
longest word present: holyday

*/