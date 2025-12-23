class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ar=new int[nums.length];
		int s=0,e=nums.length-1;
		int p=nums.length-1;
		while(s<=e){
			int sv=nums[s]*nums[s];
			int ev=nums[e]*nums[e];
			if(sv>ev){
				ar[p]=sv;
				s++;
				p--;
			}else{
				ar[p]=ev;
				e--;
				p--;
			}
		}
			return ar;
    }
}
