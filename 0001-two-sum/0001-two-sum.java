class Solution {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> numIndeces= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement= target-nums[i];

            if(numIndeces.containsKey(complement)){
                return new int[]{numIndeces.get(complement),i};
            }

            numIndeces.put(nums[i], i);
        }
        return new int[] {};
    }
}