package onlinetest2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author Xiaodong
 *
 * @param <T>
 */
public class GeneralTreeNode<T>
{
   private T data;
   private GeneralTreeNode leftChild;
   private GeneralTreeNode rightChild;
   
   public GeneralTreeNode(T data)
   {
	  this.data=data;
   }
   
   public T getData()
   {
	 return data;
   }
   
   public void setLeftChild(GeneralTreeNode child)
   {
	  leftChild=child;
   }
   public void setRightChild(GeneralTreeNode child)
   {
	  rightChild=child;
   }
   
   public GeneralTreeNode getLeftChild()
   {
	  return leftChild;
   }
   public GeneralTreeNode getRightChild()
   {
	  return rightChild;
   }
   
   public int depth()
   {
	  int dep=1;
	   if(leftChild!=null)
		 if(leftChild.depth()+1>dep)dep=leftChild.depth()+1;
	   if(rightChild!=null)
		 if(rightChild.depth()+1>dep)dep=rightChild.depth()+1;	  
      return dep;
   }
   
   public String toString()
   {
	  String ret="";
	  LinkedList<GeneralTreeNode> queue=new LinkedList<GeneralTreeNode>();
	  queue.offer(this);
	  GeneralTreeNode n;
	  while(!queue.isEmpty())
	  {
		n=queue.poll();
		ret+=n.data+" ";
		if(n.leftChild!=null)queue.offer(n.leftChild);
		if(n.rightChild!=null)queue.offer(n.rightChild);
	  }
	  return ret.trim();
   }
   
   public boolean search(T key)
   {
	    if(data.equals(key))return true;	 

		  if(leftChild!=null)
			if(leftChild.search(key))return true;
		  if(rightChild!=null)
			if(rightChild.search(key))return true;
		  
	 return false;
	 
   }
   
   public boolean isSemmetric()
   {
	 return false;
   }
}
