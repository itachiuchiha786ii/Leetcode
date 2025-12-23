class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
			return nums[0];
		}else if(nums[nums.length-1]!= nums[nums.length-2]){
			return nums[nums.length-1];
		}else if(nums[0]!=nums[1]){
			return nums[0];
		}
			int s=0,e=nums.length-1;
			while(s<=e){
				int mid=(s+e)/2;
				if(nums[mid]!=nums[mid-1] && nums[mid]!= nums[mid+1]){
					return nums[mid];
				}else if(mid%2==1){
					if(nums[mid]==nums[mid-1]){//odd
						s=mid+1;
					}else{
						 e=mid-1;
					}
				}else{//even
					if(nums[mid]==nums[mid+1]){
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
