class Solution {
    public int count=0;
    public int ans;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return ans;
        
    }
    public int helper(TreeNode root, int k){
    	if(root ==null){
    		return ;
    	}
    	helper(root.left,k);
    	count=count+1;
    	if(count==k){
    		ans=root.val;
    	}
    	helper(root.right,k);
    }
}
