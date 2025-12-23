class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			int e=arr[i];
			if(hm.containsKey(e)==true){
				hm.put(e,hm.get(e)+1);
			}
			else{
				hm.put(e,1);
				}
		}
		int ans=-1;
		for(int key: hm.keySet()){
				if(hm.get(key)==key){
					ans=Math.max(ans,key);
				}
		}
		return ans;
	
				
    }
}
