class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int num1[]=new int[n];

        for(int i=0;i<n;i++){
            int newIdx=(i+k)%n;
            num1[newIdx]= nums[i];
        }
        for(int j=0;j<n;j++){
            nums[j]=num1[j];
        }
    }
}