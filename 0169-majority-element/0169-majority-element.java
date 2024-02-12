class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int n= nums.length/2;
        
        for(int a: nums){
            
            mp.put(a, mp.getOrDefault(a,0)+1);
        }
        
        int ans=0;
        
        for(int a: mp.keySet()){
            
            if(mp.get(a)>n){
                ans=a;
            }
        }
        return ans;
    }
}