class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int Fo = -1;
        int Lo = -1;

        // Find First Occurrence
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                Fo = mid;
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        // Reset boundaries
        left = 0;
        right = nums.length - 1;

        // Find Last Occurrence
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                Lo = mid;
                left = mid + 1;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return new int[]{Fo, Lo};
    }
}