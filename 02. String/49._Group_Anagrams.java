// https://leetcode.com/problems/group-anagrams/description/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        
        HashMap<String,List<String>> HM = new HashMap<>();
        
        for(String x : strs){
            char arr[] = x.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);
            
            if(HM.containsKey(temp)){
                HM.get(temp).add(x);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(x);
                HM.put(temp, list);
            }
        }
        
        for(String x : HM.keySet()){
            ans.add(HM.get(x));
        }
        
        return ans;
        
    }
}
