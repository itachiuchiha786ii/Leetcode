class Solution {
    public int maxAscendingSum(int[] nums) {
        int cs=nums[0];
		int max=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i-1]<nums[i]){
				cs+=nums[i];
			}
			else{
				max=Math.max(max,cs);
				cs=nums[i];
			}
		}
		max=Math.max(max,cs);
		return max;
    }
}
