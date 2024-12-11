class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int []arr=new int [2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                arr[0]=i;
                arr[1]=map.get(target-nums[i]);
                return arr;

            }
            map.put(nums[i],i);
            }
            return arr;
    }
}