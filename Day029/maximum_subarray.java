class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0],max=nums[0];
		for(int i=1;i<nums.length;i++){
			if(cs+nums[i]>nums[i]){
				cs+=nums[i];
			}else{
				cs=nums[i];
			}
			max=Math.max(max,cs);
		}
		return max;
    }
}
