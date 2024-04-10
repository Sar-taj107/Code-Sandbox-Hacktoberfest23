//package Medium.950. Reveal Cards In Increasing Order;
import java.util.*;
public class RevealCardsInIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int[] deck = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            deck[i] = sc.nextInt();
        }
        int[] ans = deckRevealedIncreasing(deck);
        System.out.print("card in increasing order: ");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] deckRevealedIncreasing(int[] deck){

        int n=deck.length;
        int[] res = new int[n];
        int i=0, j=0;
        boolean skip = false;
        Arrays.sort(deck);
        while (i<n) {
            if(res[j] == 0){
                if(skip ==false){
                    res[j] = deck[i];
                    i++;
                }
                skip = !skip;
            }
            j=(j+1) %n;
        }
        return res;
    }
}
/*
Output:

Enter the array size: 7
Enter the Element: 17 13 11 2 3 5 7
card in increasing order: 2 13 3 11 5 17 7 

Enter the array size: 2
Enter the Element: 1 1000 
card in increasing order: 1 1000

*/

