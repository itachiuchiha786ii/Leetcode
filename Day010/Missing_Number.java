class Solution {
    public int missingNumber(int[] nums) {
        int ar=0;
        int cr=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            ar+=nums[i];
        }
        return cr-ar;
    }
}
