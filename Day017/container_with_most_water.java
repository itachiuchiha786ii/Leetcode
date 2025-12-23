class Solution {
    public int maxArea(int[] height) {
        int s=0,e=height.length-1;
		int w=0,h=0,mc=0;
		while(s<e){
			h=Math.min(height[s],height[e]);
			w=e-s;
			int c=h*w;
			mc=Math.max(c,mc);
			if(height[s]<height[e]){
				s++;
			}
			else{
				e--;
				}
		}
		return mc;
    }
}
