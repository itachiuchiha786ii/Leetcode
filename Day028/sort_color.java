class Solution {
    public void sortColors(int[] nums) {
        int l=0,h=nums.length-1;
		int mid=0;
		while(mid<=h){
			if(nums[mid]==0){
				sw(nums,l,mid);
				mid++;
				l++;
			}else if(nums[mid]==1){
				mid++;
			}
			else{
				sw(nums,h,mid);
				h--;
			}
		}
		System.out.print(Arrays.toString(nums));
	}
	public static void sw(int[] num,int i, int j){
		int k=num[i];
		num[i]=num[j];
		num[j]=k;
	}
}
