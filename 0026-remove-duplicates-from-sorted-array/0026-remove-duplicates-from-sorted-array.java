class Solution {
    public int removeDuplicates(int[] nums) {
        // Check if the array is empty or has only one element
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        
        // Use two pointers approach to remove duplicates in-place
        int i = 0; // Slow pointer
        for (int j = 1; j < nums.length; j++) {
            // If the current element is different from the previous one
            if (nums[j] != nums[i]) {
                i++; // Move the slow pointer
                nums[i] = nums[j]; // Copy the current element to the position indicated by the slow pointer
            }
        }
        
        // The length of the array after removing duplicates is i + 1
        return i + 1;
    }
}