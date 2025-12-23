class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pu=new PriorityQueue<>();
		for(int i=0;i<nums.length;i++){
			if(pu.size()<k){
				pu.add(nums[i]);
			}
			else if(pu.peek()<nums[i]){
				pu.remove();
				pu.add(nums[i]);
			}
		}
		return pu.peek();
    }
}
