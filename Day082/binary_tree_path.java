class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        if(root == null){
        	return ans;
        }
        else if(root.left ==null && root.right == null){
        	ans.add(""+root.val);
        }
        List<String> leftans=binaryTreePaths(root.left);
        List<String> rightans=binaryTreePaths(root.right);
        
        for(String str: leftans){
        	ans.add(root.val+"->"+str);
        }
        for(String str: rightans){
        	ans.add(root.val+"->"+str);
        }
        return ans;
    }
}
