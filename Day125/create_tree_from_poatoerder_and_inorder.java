
class Solution {
    public int posid=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        posid=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
        	map.put(inorder[i],i);
        }
        return helper(postorder,0,inorder.length-1);
    }
    public TreeNode helper(int[] postorder,int left,int right){
    	if(left>right) return null;
    	int rootval=postorder[posid--];
    	TreeNode root=new TreeNode(rootval);
    	int mid=map.get(rootval);
    	root.right=helper(postorder,mid+1,right);
    	root.left=helper(postorder,left,mid-1);
    	
    	return root;
    }
    	
}
