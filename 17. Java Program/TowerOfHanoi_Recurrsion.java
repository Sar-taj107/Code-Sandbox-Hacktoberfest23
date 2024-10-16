import java.util.Scanner;

public class TowerOfHanoi 
{

    // Recursive function to solve the Tower of Hanoi problem
  
    public static void solve(int n, char fromRod, char toRod, char auxRod) 
  {
        if (n == 1) 
        {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        // Move n-1 disks from fromRod to auxRod using toRod
    
        solve(n - 1, fromRod, auxRod, toRod);
    
        // Move the nth disk from fromRod to toRod
    
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
    
        // Move the n-1 disks from auxRod to toRod using fromRod
    
        solve(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the number of disks
    
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        // Solve the Tower of Hanoi problem
    
        solve(n, 'A', 'C', 'B');  // A is the source rod, C is the destination rod, B is the auxiliary rod

        scanner.close();
    }
}
