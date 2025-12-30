class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
		int s=0;
		int e=people.length-1;
		int c=0;
		while(s<=e){
			if(people[e]+people[s]<=limit){
				e--;
				s++;
			}else{
				e--;
			}
			c++;
		}
		return c;
    }
}
