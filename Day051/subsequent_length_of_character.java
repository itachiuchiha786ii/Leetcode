class Solution {
    public int maxPower(String s) {
        int c=1;
		int max=1;
		int k=0;
		char[] ch=s.toCharArray();
		for(int i=1;i<ch.length;i++){
			if(ch[i]==ch[k]){
				c++;
				k++;
			}else{
				c=1;
				k++;
			}
			if(c>max){
					max=c;
				}
		}
		return max;
    }
}
