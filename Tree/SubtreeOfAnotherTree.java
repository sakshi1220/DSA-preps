public class SubtreeOfAnotherTree {
        boolean isSame(TreeNode node, TreeNode subNode){
             if(node==null && subNode==null) return true;
            if(node==null || subNode==null) return false;
            
          if(node.val!=subNode.val) return false;
            return isSame(node.right,subNode.right)&& isSame(node.left,subNode.left);
        }
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(root==null){
                return false;
            }
             if(isSame(root, subRoot)) return true;
           
            return isSubtree(root.right,subRoot)|| isSubtree(root.left,subRoot) ;

    }
}
