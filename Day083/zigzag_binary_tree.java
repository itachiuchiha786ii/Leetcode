class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root == null){
        	return ans;
        }
        List<Integer> currans=new ArrayList<>();
        Stack<TreeNode> main=new Stack<>();
        Stack<TreeNode> helper=new Stack<>();
        int level=0;
        main.push(root);
        while(main.size()>0){
        	TreeNode currnode=main.pop();
        	currans.add(currnode.val);
        	if(level==0){
        		if(currnode.left!=null){
        			helper.push(currnode.left);
        		}
        		if(currnode.right!=null){
        			helper.push(currnode.right);
        		}
        	}else{
        		if(currnode.right!=null){
        			helper.push(currnode.right);
        		}
        		if(currnode.left!=null){
        			helper.push(currnode.left);
        		}
        	}
        	if(main.size()==0){
        		ans.add(currans);
        		currans =new ArrayList<>();
        		level=1-level;
        		main=helper;
        		helper=new Stack<>();
        	}
        }
        return ans;
        		
        		
        
    }
}
