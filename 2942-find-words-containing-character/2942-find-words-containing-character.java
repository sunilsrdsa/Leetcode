class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<words.length; i++)
        {
            if(words[i].indexOf(x)!=-1)
            {
                list.add(i);
            }
        }

        return list;
        
        
        
    /* another approach
        List<Integer> ans = new ArrayList<>();
       for(int i=0;i<words.length;i++){
           for(int j = 0; j < words[i].length(); j++){
               if(words[i].charAt(j) == x){
                   ans.add(i); 
                   break; 
               }

           }
              
       }
       
       return ans; */
        
        
    }
}