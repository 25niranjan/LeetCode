class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=1;
        int idx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[idx]>k){
                count++;
                idx=i;
            }
        }
        return count;
    }
}