package onlinetest2;

import java.util.ArrayList;
import java.util.List;

public class TreeNode
{
    int data;
    List<TreeNode> children= new ArrayList<TreeNode>();
    
    public TreeNode(int data)
    {
	  this.data=data;
    }
    
    public void addChild(TreeNode child)
    {
	  children.add(child);
    }
    
    
    public int depth()
    {
         return 0;
    }
    
    public String toString()
    {
	  return "";
    }

}
