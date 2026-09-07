class NumArray {

        int []pref;
    public NumArray(int[] nums) {
        int left=0;
        int right=nums.length;
        int cSum=0;
        this.pref=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            cSum+=nums[i];
            pref[i]=cSum;
        }
    }

        

    public int sumRange(int left, int right) {
        if (left == 0) return pref[right];
        return pref[right]-pref[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */