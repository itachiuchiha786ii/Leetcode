class Solution {
    public int[] twoSum(int[] numbers, int target){
		int[] ar=new int[2];
		int st=0,ed=numbers.length-1;
		while(st<ed){
			int sum=numbers[st]+numbers[ed];
			if(sum==target){
				ar[0]=st+1;
				ar[1]=ed+1;
				return ar;
			}
			else if(sum>target){
				ed--;
			}else{
				st++;
			}
		}
		return ar;
	}
    
}
