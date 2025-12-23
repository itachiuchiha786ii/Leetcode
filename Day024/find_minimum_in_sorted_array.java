class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
			return nums[0];
		}else if(nums[0]<nums[nums.length-1]){
			return nums[0];
		}
		int s=0,e=nums.length-1;
		while(s<=e){
			int mid=(s+e)/2;
			if(mid!=0 && nums[mid-1]>nums[mid]){
               return nums[mid];
           }else if( mid!=nums.length-1 && nums[mid]>nums[mid+1] ){
               return nums[mid+1];
           }
			else if(nums[s]<=nums[mid]){
				s=mid+1;
			}
			else{
				e=mid-1;
			}
		}
		return -1;
    }
}
