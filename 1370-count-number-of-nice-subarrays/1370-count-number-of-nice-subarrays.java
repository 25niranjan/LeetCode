class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(count,1);
        for(int i=0;i<nums.length;i++){
            count+=nums[i]%2;
            if(map.containsKey(count-k)){
                sum+=map.get(count-k);
            }
            map.put(count,map.getOrDefault(count,0)+1);
        }
        return sum;

    }
}