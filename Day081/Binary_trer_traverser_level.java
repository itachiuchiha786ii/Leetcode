class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> ans=new ArrayList<>();
    	List<Integer> currlist=new ArrayList<>();
    	if(root == null){
    		return ans;
    	}
    	Queue<TreeNode> main=new ArrayDeque<>();
    	Queue<TreeNode> helper=new ArrayDeque<>();
    	main.add(root);
    	while(main.size()>0){
    		TreeNode currNode=main.remove();
    		currlist.add(currNode.val);
    		if(currNode.left!=null){
    			helper.add(currNode.left);
    		}
    		if(currNode.right!=null){
    			helper.add(currNode.right);
    		}
    		if(main.size()==0){
    			ans.add(currlist);
    			currlist=new ArrayList<>();
    			main=helper;
    			helper=new ArrayDeque<>();
    		}
    	}
    	return ans;
    }
}
    		
