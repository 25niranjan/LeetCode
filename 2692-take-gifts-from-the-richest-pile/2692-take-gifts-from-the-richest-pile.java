class Solution {
    public long pickGifts(int[] gifts, int k) {
       List<Integer>list=new ArrayList<>();
       for(int gift: gifts){
        list.add(-gift);
       }
       PriorityQueue<Integer>pq=new PriorityQueue<>(list);
       for(int i=0;i<k;i++){
        int maxEle=-pq.poll();
        pq.offer(-(int)Math.sqrt(maxEle));
       }
       long num=0;
       while(!pq.isEmpty()){
        num-=pq.poll();
       }
       return num;
    }
}