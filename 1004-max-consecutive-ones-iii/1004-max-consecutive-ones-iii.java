class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zc=0;
        int n=nums.length;

        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zc++;
            }
            if(zc>k){
                if(nums[left]==0){
                    zc--;
                }
                left++;
            }
        }
        return n-left;
    }
}