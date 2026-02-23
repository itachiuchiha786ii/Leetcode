/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0;
	public int height(TreeNode root){
		if(root==null){
			return 0;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		
		return Math.max(lh,rh)+1;
	}

    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);
		helper(root,h);
		return ans;
    }
    public void helper(TreeNode root, int ht){
		if(root == null){
			return ;
		}
		if(ht==1){
			ans=ans+root.val;
		}
		helper(root.left,ht-1);
		helper(root.right,ht-1);
    }
}
