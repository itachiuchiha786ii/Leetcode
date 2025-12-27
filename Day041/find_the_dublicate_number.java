class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
		for(int i=0;i<nums.length;i++){
			int e=nums[i];
			e=Math.abs(e);
			if(nums[e]>0){
				nums[e]=-nums[e];
			}
			else{
				ans=e;
				break;
			}
		}
		for(int i=0;i<nums.length;i++){
			nums[i]=Math.abs(nums[i]);
		}
		return ans;
    }
}
