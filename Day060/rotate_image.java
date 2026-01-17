class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
			for(int j=i;j<matrix.length;j++){
				int k=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=k;
			}
		}
		for(int i=0;i<matrix.length;i++){
			int[] temp=matrix[i];
			reverse(temp);
		}
		return ;
	}
	public  void reverse(int[] arr){
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int k=arr[start];
			arr[start]=arr[end];
			arr[end]=k;
			start++;
			end--;
		}
    
	}
    
}
