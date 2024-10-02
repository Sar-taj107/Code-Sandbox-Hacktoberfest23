class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        boolean present =false;
        Set<String> set = new HashSet<String>(); 
        int count=0;
        
        for(int i=0;i<bannedWords.length;i++){
            set.add(bannedWords[i]);
        }
        
        for(int j=0;j<message.length;j++){
            if(set.contains(message[j])){
                 count++;
            } 
                
            if(count==2) return true;
        }
        
        
        return false;
        
    }
}