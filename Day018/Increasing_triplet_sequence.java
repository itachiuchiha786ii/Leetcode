class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int f=Integer.MAX_VALUE;
		int s=Integer.MAX_VALUE;
		int t=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++){
			int e=nums[i];
			if(f>=e){
				f=e;
			}
			else if(s>=e){
				s=e;
			}
			else{
				t=e;
				return true;
			}
        }
			return false;
        
        
    }
}
