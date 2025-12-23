class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
		if(target<nums[0]){
			return 0;
		}
		else if(nums.length==1){
			if(nums[0]>target){
				return 0;
			}else if(nums[0]==target){
				return 0;
			}
			else{
				return 1;
			}
			
		}else{
		while(s<=e){
			int mid=(s+e)/2;
			if(target==nums[mid]){
				return mid;
			}else if(target <nums[mid+1] && target >nums[mid]){
				return mid+1;
			}
			else if(target>nums[e]){
				return e+1;
			}
			else if(nums[mid]<target){
				s=mid+1;
			}
			else{
				e=mid-1;
			}
		}
		}
		return -1;
    }
}
