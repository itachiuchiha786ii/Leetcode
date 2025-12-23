class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
		int[] r=new int[n];
		int p=1;
		for(int i=n-1;i>=0;i--){
			p=p*nums[i];
			r[i]=p;
		}
		int[] a= new int[n];
        int left = 1 ;
		for(int i=0;i<n-1;i++){
			int v=left*r[i+1];
			a[i]=v;
			left=left*nums[i];
		}
		a[n-1]=left;
		return a;
    }
}
