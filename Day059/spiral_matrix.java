class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ar=new int[n][n];
		int count=1;
		int mincol=0;
		int maxcol=n-1;
		int minrow=0;
		int maxrow=n-1;
		while(count<=n*n){
			for(int c=mincol;c<=maxcol;c++){
				ar[minrow][c]=count;
				count++;
			}
			for(int r=minrow+1;r<=maxrow;r++){
				ar[r][maxcol]=count;
				count++;
			}
			for(int c=maxcol-1;c>=mincol;c--){
				ar[maxrow][c]=count;
				count++;
			}
			for(int r=maxrow-1;r>=minrow+1;r--){
				ar[r][mincol]=count;
				count++;
			}
			minrow++;
			maxrow--;
			mincol++;
			maxcol--;
		}
		return ar;
    }
}
