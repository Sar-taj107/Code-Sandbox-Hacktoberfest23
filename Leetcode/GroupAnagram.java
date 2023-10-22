import java.util.*;
/*
Ques:49
Group Anagrams

Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

 */
public class GroupAnagram {
    public static void main(String[] args) {
        
        GroupAnagram solution = new GroupAnagram();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String array size:");
        int n=sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the string:");

        for(int i=0; i<n; i++){
            strs[i]=sc.next();
        }
        List<List<String>> groupedAnagrams = solution.groupAnagrams(strs);

        // Print the grouped anagrams
        System.out.println("Anagram group:");
        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> umap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!umap.containsKey(sortedStr)) {
                umap.put(sortedStr, new ArrayList<>());
            }
            umap.get(sortedStr).add(str);
        }

        for (List<String> group : umap.values()) {
            ans.add(group);
        }

        return ans;
    }
}

/*
Output:

Enter the String array size:
6
Enter the string:
eat tea tan ate nat bat
Anagram group:
[eat, tea, ate]
[bat]
[tan, nat]

 */