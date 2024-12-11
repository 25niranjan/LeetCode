class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int right=0;
        int max=0;
        for(int left=0;left<nums.length;left++){
            while(right<nums.length && nums[right]-nums[left]<=2*k){
                right++;
            }
            max=Math.max(max,right-left);
        }
        return max;
    }
}