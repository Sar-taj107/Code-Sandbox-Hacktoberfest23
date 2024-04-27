/*
Question 2 (Medium taged) TCS NQT_26.04.24 / 2nd_shift
In a vegetable store, there is a variety of fruits available for sale. Each fruit is listed along
with its unit cost and the total quantity sold. Your task is to compute the total sales,average sales,
and identify the best-selling product.

The input consists of a list of sales transactions in the following format:
innput:
sale_transaction = [
  (Apple, 0.8, 20),
  (Banana, 0.5, 10),
  (Apple, 0.8, 10),
  (Orange, 1.5, 20),
  (Banana, 0.5, 20),
  (Orange, 1.5, 10)
]

Here, each tuple represents a sale transaction, consisting of the fruit name (as a string), the unit
 cost of the fruit (as a double), and the total quantity sold (as an integer).

Your program should output the following information:

Total sales cost: The sum of the product of the unit cost of each item with the quantity of the item. This should be displayed with two decimal places.
Average sales cost: The total sales cost divided by the total number of items. This should also be displayed with two decimal places.
Best-selling product: The product that generated the maximum sales revenue.

Output:
Total sales cost: 84.00
Average sales cost: 14.00
Best selling product: Orange

*/
import java.util.*;
public class ComputeSalesTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        
        double maxSalec=Double.MIN_VALUE;
        String bsp = "";
        double totSalesc=0.0;
        double avgSalesc=0.0;
        
        for(int i=0; i<n; i++){
          String s = sc.next();
          double uc= sc.nextDouble();
          int q = sc.nextInt();
          
          double x=uc*q;
          if(maxSalec < x){
            bsp = s;
          }
          maxSalec = Math.max(maxSalec, x);
          
          totSalesc += x;
          avgSalesc = totSalesc / n;
        }
          System.out.printf("Total sales cost: "+"%.2f\n",totSalesc);
          System.out.printf("Average sales cost: "+"%.2f\n",avgSalesc);
          System.out.println("Best salling product: "+bsp);
    }
}

/*
Output:
Total sales cost: 84.00
Average sales cost: 14.00
Best salling product: Orange

*/