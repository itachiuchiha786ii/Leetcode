class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int e:stones){
            pq.add(e);
        }
        while(pq.size()>1){
            int max=pq.remove();
            int smax=pq.remove();

            int ns=max-smax;
            if(ns!=0){
                pq.add(ns);
            }
        }
        if(pq.size()==0){
            return 0;
        }
        else{
            return pq.remove();
        }
    }
}
