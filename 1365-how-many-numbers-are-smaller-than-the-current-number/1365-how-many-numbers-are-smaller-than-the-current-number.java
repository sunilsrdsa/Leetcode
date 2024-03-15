class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

       // Sort the Array
       int[] sort = new int[nums.length];
       for(int i=0; i<nums.length; i++)
       {
        sort[i]=nums[i];
       } 
       Arrays.sort(sort);
       //Sort array inascending order
       //[8,1,2,2,4] = [1,2,2,4,8]
       
       //store the index data wchich tells how many elements lesser than current elements
       //for example 1=0; 2=1; 4=3; 8=4;  //index of soted array will give the value

       Map<Integer, Integer> map = new HashMap<>();
       for(int i=0; i<sort.length; i++)
       {
         if(!map.containsKey(sort[i]))
           map.put(sort[i], i);
       }

       int[] val = new int[nums.length];
       for(int i=0; i<val.length; i++)
       {
        val[i] = map.get(nums[i]);
       }
        return val;
    }
}