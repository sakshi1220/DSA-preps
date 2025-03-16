import java.util.*;

public class PostOrderTraversal{
public void traverse(TreeNode node, List <Integer> ans){
    if(node==null) return;
  
    traverse(node.left,ans);
    traverse(node.right,ans);
    ans.add(node.val);
}
public List<Integer> postorderTraversal(TreeNode root) {
      List <Integer> ans= new ArrayList<>();
      traverse(root,ans);
   
    
     return ans;

}   
}