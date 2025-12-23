class Solution {
    public String largestNumber(int[] nums) {
        String[] ar=new String[nums.length];
		for(int i=0;i<nums.length;i++){
			ar[i]=nums[i]+"";
		}
		Arrays.sort(ar,(s1,s2)->(s1+s2).compareTo(s2+s1));
		StringBuilder sb=new StringBuilder("");
		for(int i=ar.length-1;i>=0;i--){
			sb.append(ar[i]);
		}
		if(sb.charAt(0)=='0'){
			return "0";
		}
		return sb.toString();
    }
}
