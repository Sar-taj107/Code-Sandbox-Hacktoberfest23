//package Easy.2942. Find Words Containing Character;
import java.util.*;
public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size: ");
        int n=sc.nextInt();
        String[] words = new String[n];
        System.out.print("Enter the word: ");
        for(int i=0; i<n; i++){
            words[i]=sc.next();
        }
        System.out.print("Enter the character: ");
        char x=sc.next().charAt(0);
        
        List<Integer> ans = findWordsContaining(words,x);
        System.out.println("word present at index: "+ans);
    }
    public static List<Integer> findWordsContaining(String[] words, char x){
        int n=words.length;
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<n; i++){
            String s= words[i];
            int l=s.length();
            for(int j=0; j<l; j++){
                if(s.charAt(j) == x){
                    li.add(i);
                    break;
                }
            }
        }
        return li;
    }
}

/*
Output:

Enter array Size: 2
Enter the word: leet code
Enter the character: e
word present at index: [0, 1]

Enter array Size: 4
Enter the word: abc bcd aaaa cbc
Enter the character: a
word present at index: [0, 2]

*/