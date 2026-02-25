class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] maxpro=new int[n];
        maxpro[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
        	int currmax=Math.max(maxpro[i+1],prices[i]);
        	maxpro[i]=currmax;
        }
        int ans=0;
        for(int i=0;i<prices.length;i++){
        	int curpro=maxpro[i]-prices[i];
        	ans=Math.max(ans,curpro);
        }
        return ans;
    }
}
