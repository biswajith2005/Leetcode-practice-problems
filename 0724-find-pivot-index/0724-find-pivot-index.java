class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=totalsum-leftsum-nums[i];

            if(leftsum==rightsum){
            return i;
        }
        leftsum+=nums[i];
        }
        
        return -1;
    }
}