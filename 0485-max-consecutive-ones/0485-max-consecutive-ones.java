class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount=0;
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}