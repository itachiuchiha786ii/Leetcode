class Solution {
    public int pivotIndex(int[] nums) {
        int rmx=0;
		for(int e:nums){
			rmx+=e;
		}
		int lmx=0;
		 for(int i=0;i<nums.length;i++){
			rmx-=nums[i];
			if(rmx==lmx){
				return i;
			}
			lmx+=nums[i];
		}
		return -1;
        
    }
}
