class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        per(nums,new ArrayList<>(),res);
        return res;
    }

    static void per(int[] nums,List<Integer>list, List<List<Integer>> res)
    {
        if(nums.length==list.size()){
         res.add(new ArrayList<>(list));
         return;
        }

        for(int num:nums )
        {
            if(list.contains(num))
            continue;
            
            list.add(num);
            per(nums,list,res);
            list.remove(list.size()-1);
        }
        
    }
    
}