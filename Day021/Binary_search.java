class Solution {
    public int search(int[] nums, int target) {
        int s=0,ed=nums.length-1;
		int mid=s+ed/2;
		while(s<=ed){
			mid=(s+ed)/2;
			if(nums[s]==target || nums[ed]==target || nums[mid]==target){
				if(nums[s]==target){
					return s;
				}else if(nums[ed]==target){
					return ed;
				}
				return mid;
			}
			else if(nums[mid]<target){
				s=mid+1;
			}
			else if(nums[mid]>target){
				ed=mid-1;
			}
			else{
				return -1;
			}
			
		}
		return -1;
    }
}
