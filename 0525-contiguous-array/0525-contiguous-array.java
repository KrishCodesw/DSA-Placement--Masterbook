class Solution {
    public int findMaxLength(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      map.put(0,-1);
      int currSum=0;
      int maxLength=0;

      for(int right=0;right<nums.length;right++){
        // if there is a zero we need to treat it as -1 , and add -1 
        if(nums[right]==0){
            currSum-=1;
        }else{
            currSum+=1;
        }

        if(map.containsKey(currSum-0)){
            int prevIndex=map.get(currSum);
            int currLen=right-prevIndex;
            maxLength=Math.max(maxLength,currLen);
        }else{
            map.put(currSum,right);
        }
      }
       return maxLength; 
    }
}