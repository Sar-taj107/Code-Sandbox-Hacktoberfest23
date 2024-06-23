

/*
    Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

     Boyer-Moore Voting Algorithm 
     TC- O(n)
     Sc -O(1)
 */
import java.util.*;
public class MajorityElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[] arr =new int[n];

        System.out.println("Enter the element:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> res=majorityEle(arr);
        System.out.println(res);

    }

    public static List<Integer> majorityEle(int arr[]){

        int n=arr.length;
        List<Integer> list = new ArrayList();

        if(n==0){
            return list;
        }

        int x=arr[0], count1=0;
        int y=arr[0], count2=0;

        for(int i=0; i<n; i++){
            if(arr[i] == x){
                count1++;
            }else if(arr[i] == y){
                count2++;
            }else if(count1 ==0){
                x=arr[i];
            }else if(count2 ==0){
                y=arr[i];
            }else{
                count1 --;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int i=0; i<n; i++){
            if(arr[i] == x){
                count1 ++;
            }
            else if(arr[i] == y){
                count2 ++;
            }
        }
        if(count1 > n/3){
            list.add(x);
        }
        if(count2 > n/3){
            list.add(y);
        }
        return list;
    }
}

/*
OUTPUT:

Enter the array size:
3
Enter the element:
3 2 3
[3]

 */
