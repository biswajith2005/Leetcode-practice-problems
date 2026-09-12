class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount=0;
        int left=0;
        int n=nums.length;

        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zeroCount++;
            }
            if(zeroCount>k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left++;
            }

        }
        return n-left;
    }
}