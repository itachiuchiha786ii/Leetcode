class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int num=0;
		int targcou=0;
		for(int e: nums){
			if(e==target){
				targcou++;
			}else if(e<target){
				num++;
			}
		}
			List<Integer> ans=new ArrayList<>();
			while(targcou>0){
				ans.add(num);
				num++;
				targcou--;
			}
			return ans;
    
    }
}
