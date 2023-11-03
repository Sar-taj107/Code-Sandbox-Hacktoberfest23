// Day 80
// https://codeforces.com/problemset/problem/1397/A
// 1397 A. Juggling Letters

import java.util.*;

public class jugglingLettersCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int arr[] = new int[26];
            for (int i = 0; i < a; i++) {
                String s = in.next();
                for (int j = 0; j < s.length(); j++) {
                    arr[s.charAt(j) - 'a']++;
                }
            }
            int i;
            for (i = 0; i < 26; i++) {
                if (arr[i] % a != 0) {
                    break;
                }
            }
            if (i == 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}