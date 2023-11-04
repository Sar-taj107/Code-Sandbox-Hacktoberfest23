/*
find the number/count of words in a given string.

input:
given string  s="I Love my india"

output:
Number of word:4

*/
import java.util.*;

public class CountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();

        findWordCount(s);
    }
    static void findWordCount(String s){

        String[] str = s.split(" "); //convert the given string into array of String using 
                                           //using split() method by passing Space as a delimeter.
        int n = str.length;                
        System.out.println("Number of Word:"+n);
    }
}

/*
Output:

Enter the String:
I love my india
Number of Word:4

*/