package onlinetest2;

import java.util.ArrayList;
import java.util.List;

public class GeneralTreeNode<T>
{
   private T data;
   private List<GeneralTreeNode<T>> children=new ArrayList<GeneralTreeNode<T>>();
   public GeneralTreeNode(T t)
   {
	 this.data=t;
   }
   
   public void addChild(GeneralTreeNode<T> child)
   {
	 children.add(child);
   }
   
   public String toString()
   {
	 return "";
   }
   
   public T getData()
   {
	 return data;
   }
   
   public boolean search(T key)
   {
	 if (children.isEmpty())return data.equals(key);
	 else 
	 {
	    for(GeneralTreeNode<T> child:children)
	    {
		  if(child.search(key))return true;
	    }
	 }
	 return false;
	 
   }
}
