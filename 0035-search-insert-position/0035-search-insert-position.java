class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i-1]<target && nums[i+1]>target){
                nums[i]=target;
            }
        }
        return i;
    }
}