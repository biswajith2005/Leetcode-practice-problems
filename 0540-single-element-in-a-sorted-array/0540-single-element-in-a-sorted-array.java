class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=1;
        int right=nums.length-2;
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-2]!=nums[n-1]){
            return nums[n-1];
        }

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]!=nums[mid-1]&& nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if((mid%2==1 && nums[mid]==nums[mid-1])||(mid%2==0 && nums[mid]==nums[mid+1])){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}