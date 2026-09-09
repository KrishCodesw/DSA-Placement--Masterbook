class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,-1);
        
        int currSum=0;
        for(int right=0;right<nums.length;right++){
            currSum+=nums[right];
            int rem=((currSum % k) + k) % k;
            if(map.containsKey(rem)){
                if(right-map.get(rem)>=2){
                    return true;
                }
            }else{
            map.put(rem,right);
            }
        }
        return false;
    }
}