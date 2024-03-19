import java.util.*;
public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter char array size: ");
        int l = sc.nextInt();
        char[] tasks = new char[l];
        System.out.print("Enter the task name as character: ");
        for(int i=0; i<l; i++){
            tasks[i] = sc.next().charAt(0);
        }
        System.out.print("Enter the interval time n: ");
        int n=sc.nextInt();
        int ans =  leastInterval(tasks, n);
        System.out.print("Minimum number of interval to do all tasks: "+ans);

    }
    public static int leastInterval(char[] tasks, int n){
        
        int[] mp = new int[26];
        for(char ch : tasks){
            mp[ch - 'A']++;
        }

        int minTime = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<26; i++){
            if(mp[i] > 0){
                pq.add(mp[i]);
            }
        }
        while(!pq.isEmpty()){
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i=1; i<=n+1; i++){
                if(!pq.isEmpty()){
                    int freq = pq.peek();
                    pq.poll();
                    freq--;
                    tmp.add(freq);
                }
            }
            for(int fq : tmp){
                if(fq > 0){
                    pq.add(fq);
                }
            }
            if(pq.isEmpty()){
                minTime += tmp.size();
            }else{
                minTime +=n+1;
            }
        }
        return minTime;
    }
}

/*
Output:

Enter char array size: 6
Enter the task name as character: A A A B B B
Enter the interval time n: 2
Minimum number of interval to do all tasks: 8

nter char array size: 6
Enter the task name as character: A C A B D B
Enter the interval time n: 1
Minimum number of interval to do all tasks: 6

*/