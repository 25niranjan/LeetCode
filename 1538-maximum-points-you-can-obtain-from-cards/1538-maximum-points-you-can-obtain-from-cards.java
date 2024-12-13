class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int start=0;
        int end=0;
        int sum=0;
        k=cardPoints.length-k;
        int ans=Integer.MAX_VALUE;
        int totSum=0;
        for(int i=0;i<cardPoints.length;i++){
            totSum+=cardPoints[i];
        }
        if(k==0){
            return totSum;
        }
        while(end<cardPoints.length){
            sum+=cardPoints[end];
            if(end-start+1<k){
                end++;
            }
            else if(end-start+1==k){
                ans=Math.min(ans,sum);
                sum-=cardPoints[start];
                start++;
                end++;
            }
        }
        return totSum-ans;
    }
}