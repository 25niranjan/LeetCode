class Solution {
    public long findScore(int[] nums) {
        long score=0;
        boolean ans[]=new boolean[nums.length];
        int [][]arr=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(arr1,arr2)->arr1[0]-arr2[0]);
        for(int i=0;i<nums.length;i++){
            int number=arr[i][0];
            int index=arr[i][1];
            if(!ans[index]){
                score+=number;
                ans[index]=true;
                if(index-1>=0){
                    ans[index-1]=true;
                }
                if(index+1<nums.length){
                    ans[index+1]=true;
                }
            }
        }
        return score;

    }
}