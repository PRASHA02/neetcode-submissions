class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<=nums.length-2;i++){
            if(nums[nums.length-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}