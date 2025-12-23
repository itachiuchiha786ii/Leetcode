class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arrlist=new ArrayList<>();
		int p=num.length-1;
		int carry=0;
		while(p>=0 || k>0){
			int i=k%10;
			int nv=0;
			if(p>=0){
			 nv=num[p];
			}
			int sum=nv+i+carry;
			int d=sum%10;
			carry=sum/10;
			arrlist.add(d);
			p--;
			 k=k/10;
		}
		if(carry>0){
			arrlist.add(carry);
		}
		Collections.reverse(arrlist);
		return arrlist;
    }
}
