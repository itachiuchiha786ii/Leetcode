class Solution {
    public int lengthOfLastWord(String s) {
        int y=0;
        if(s.length() == 1){
            return 1;
        }
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)==' '){
				y++;
			}else{
				y=i;
				break;
			}
		}
		
		int c=0;
		
		for(int i=y;i>=0;i--){
			if(s.charAt(i)== ' '){
				break;
			}
			c++;
        }
        return c;
    
    }
}
