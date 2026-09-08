class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        //Number of subarrays which have the sum divisible by k not equal to
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int currentSum=0;

        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            int rem=(currentSum % k + k) % k;
            //  Mistake- -- > remainder ka formula wrong hai
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}