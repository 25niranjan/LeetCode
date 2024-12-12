class Solution {
    private int helper(int []arr,int goal){
        int size=arr.length;
        int count=0;
        int sum=0;
        int i=0;
        for(int j=0;j<size;j++){
            sum+=arr[j];
            while(sum>goal && i<=j){
                sum-=arr[i++];
            }
            count+=j-i+1;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
      return helper(nums,goal)-helper(nums,goal-1);
    }
}