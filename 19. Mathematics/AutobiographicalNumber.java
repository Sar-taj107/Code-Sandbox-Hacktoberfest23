import java.util.*;
/*
 
An autobiographical number is a number N such that the first digit of N represents the count of zeroes in N, the second digit represents the count of ones in N, third digit represents the count of twos in N and so on. For example, 1210 is an autobiographical number because:

Number = 1210
Number of zeroes in 1210 = 1 = first digit of Number
Number of ones in 1210 = 2 = second digit of the Number
Number of twos in 1210 = 1 = third digit of the Number
Number of threes in 1210 = 0 = fourth digit of the Number

 */
public class AutobiographicalNumber {
    public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = scanner.nextInt();
    
    //copying value of number in a temp variable
    int temp = number;
    String str = String.valueOf(number);
    int numArray[] = new int[str.length()];
    for(int i = numArray.length - 1; i >= 0; i--)
    {
      numArray[i] = temp % 10;
      temp = temp/10;
    }
    boolean found = true;
    for(int i = 0; i < numArray.length; i++)
    {
      int count = 0;
      for(int j = 0; j < numArray.length; j++)
      {
        if(i == numArray[j])
          count++;
      }
      if(count != numArray[i])
      {
        found = false;
        break;
      }
    }
    if(found)
      System.out.println(number + " is an Autobiographical number.");
    else
      System.out.println(number + " is not an Autobiographical number.");
	}
}

/*
 OUTPUT

Enter the number: 2020
2020 is an Autobiographical number.

Enter the number: 21021
21021 is not an Autobiographical number.

*/