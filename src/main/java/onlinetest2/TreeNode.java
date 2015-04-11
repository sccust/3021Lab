package onlinetest2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author Xiaodong
 *
 */
public class TreeNode
{
    private int data;
    private List<TreeNode> children= new ArrayList<TreeNode>();
    
    public TreeNode(int data)
    {
	  this.data=data;
    }
    
    public void addChild(TreeNode child)
    {
	  children.add(child);
    }
    
    public List<TreeNode> getChildren()
    {
	  return children;
    }
    
    
    public int depth()
    {
	  int dep=1;
	  if(!children.isEmpty())
	  {
		for(TreeNode ch:children)
		{
		   if(ch.depth()+1>dep)dep=ch.depth()+1;
		}
	  }
       return dep;
    }
    
    public String toString()
    {
	  String ret="";
	  LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
	  queue.offer(this);
	  TreeNode n;
	  while(!queue.isEmpty())
	  {
		n=queue.poll();
		ret+=n.data+" ";
		for(TreeNode ch:n.children)queue.offer(ch);
	  }
	  return ret.trim();
    }

}
