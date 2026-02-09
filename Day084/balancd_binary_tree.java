class Solution {
     boolean bf=true;
     public int ht(TreeNode root){
     	if(root==null){
     		return 0;
     	}
     	int lh=ht(root.left);
     	int rh=ht(root.right);
     	if(Math.abs(lh-rh)>1){
     		return false;
     	}
     	return Math.max(lh,rh)+1;
     }
    public boolean isBalanced(TreeNode root) {
        int h=ht(root);
        return bf;
    }
}
