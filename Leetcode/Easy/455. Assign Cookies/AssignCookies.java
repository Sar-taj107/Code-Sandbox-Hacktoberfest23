//package Easy.455. Assign Cookies;
import java.util.*;
public class AssignCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size of child greed factor:");
        int n=sc.nextInt();
        int[] g = new int[n];
        System.out.print("Enter the Element: ");
        for(int i=0; i<n; i++){
            g[i]=sc.nextInt();
        }
        System.out.print("Enter the array size of cookies: ");
        int m=sc.nextInt();
        int[] s = new int[m];
        System.out.print("Enter cookies size:");
        for(int i=0; i<m; i++){
            s[i]=sc.nextInt();
        }
        int ans = findContentChildren(g, s);
        System.out.println("Maximum cookies assign: "+ans);
    }
    public static int findContentChildren(int[] g, int[] s){

        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0;
        while(i<n && j<m){
            if(s[j] >= g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}


/*
OUTPUT:

Enter the array size of child greed factor:3
Enter the Element: 1 2 3
Enter the array size of cookies: 2 
Enter cookies size: 1 1
Maximum cookies assign: 1

Enter the array size of child greed factor:2
Enter the Element: 1 2
Enter the array size of cookies: 3
Enter cookies size: 1 2 3
Maximum cookies assign: 2

*/
