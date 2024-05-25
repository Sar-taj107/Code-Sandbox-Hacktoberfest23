import java.util.*;
public class FindVowelConstSpaceInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        
        System.out.println("Duplicate character in String: ");
        CountTheCharacters(s);
    }
    public static void CountTheCharacters(String s){
      
      int n=s.length();
     int space=0;
     int cont=0;
     int vowel=0;
      for(int i=0; i<n; i++){
        char ch = s.charAt(i);
        if(ch == ' '){
          space++;
        }else if(ch=='A' || ch=='E' || ch =='I' || ch=='O' || ch =='U' || ch =='a'|| ch =='e'
        || ch == 'i'||ch=='o'||ch=='u'){
          vowel++;
        }else{
          cont++;
        }
      }
      System.out.println("space: "+space);
      System.out.println("Vowel: "+vowel);
      System.out.println("Consonant: "+cont);
    }
}

/*
Output:
Enter the String: The view from the mountaintop was awesome
Duplicate character in String: 
space: 6
Vowel: 15
Consonant: 20

*/