//package Easy.2960. Count Tested Devices After Test Operations;
import java.util.*;
public class CountTestedDevicesAfterTestOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int n = sc.nextInt();
        int[] batteryPercentages = new int[n];
        System.out.print("Enter the element:");
        for(int i=0; i<n; i++){
            batteryPercentages[i] = sc.nextInt();
        }
        int ans = countTestedDevices(batteryPercentages);
        System.out.println("Number of device tested: "+ans);
    }
    public static int countTestedDevices(int[] batteryPercentages) {
        
        int n=batteryPercentages.length;
        int count=0;
        for(int i=0; i<n; i++){
            if(batteryPercentages[i]==0){
                continue;
            }
            if(batteryPercentages[i]>0){
                count++;
                for(int j=i; j<n; j++){
                    batteryPercentages [j] -= 1;
                }    
            }
        }
        return count;
    }
}

/*
OUTPUT:
Enter the array size:5
Enter the element:1 1 2 1 3
Number of device tested: 3

Enter the array size:3 
Enter the element:0 1 2
Number of device tested: 2

*/
