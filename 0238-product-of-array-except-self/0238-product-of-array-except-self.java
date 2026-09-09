class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answer=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int leftProduct=1;
        for(int i=0; i<nums.length;i++){
            answer[i]=leftProduct;
            leftProduct*=nums[i];
        }
        int rightProduct=1;
        for(int i=nums.length-1; i>=0;i--){
            answer[i]*=rightProduct;
            rightProduct*=nums[i];
        }
        return answer;
        
    }
}