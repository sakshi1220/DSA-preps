
    class TreeNode {
      int val;
    TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }
  }
 
  class MaxDepthOfTree {
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
       int lh= maxDepth(root.left);
       int rh= maxDepth(root.right);
       return 1+ Math.max(lh,rh);
    }

    public static void main(String[] args) {
        // Constructing the tree: 
        //         3
        //        / \
        //       9   20
        //          /  \
        //         15   7
        TreeNode root = new TreeNode(3, 
                            new TreeNode(9), 
                            new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        
                    
                            // MaxDepthOfTree sol = new MaxDepthOfTree();
        System.out.println("Maximum Depth: " + maxDepth(root)); // Output: 3
    }
}
