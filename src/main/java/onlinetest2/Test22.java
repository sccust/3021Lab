package onlinetest2;

/**
 * 
 * @author Xiaodong
 *
 */
public class Test22
{
   public static void main(String[] args)
   {
	 TreeNode tree = new TreeNode(66);
	 TreeNode ch11 = new TreeNode(54);
	 TreeNode ch12 = new TreeNode(107);
	 TreeNode ch111 = new TreeNode(1);
	 TreeNode ch112 = new TreeNode(22);
	 ch11.addChild(ch111);
	 ch11.addChild(ch112);
	 tree.addChild(ch11);
	 tree.addChild(ch12);

	 System.out.println("depth:" + tree.depth());
	 System.out.println("data:" + tree.toString());
	 
	 
      GeneralTreeNode<Student> stuTree= new GeneralTreeNode<Student>(new Student("Amy","m"));
      stuTree.addChild(new GeneralTreeNode<Student>(new Student("Tom","f")));
      stuTree.addChild(new GeneralTreeNode<Student>(new Student("Chan","m")));
      
      GeneralTreeNode<Teacher> teacTree = new GeneralTreeNode<Teacher> (new Teacher("Tim",3021));	
      teacTree.addChild(new GeneralTreeNode<Teacher>(new Teacher("Zhang",0422)));
      teacTree.addChild(new GeneralTreeNode<Teacher>(new Teacher("Lee",2015)));
      teacTree.getChildren().get(0).addChild(new GeneralTreeNode<Teacher>(new Teacher("Jack",3111)));
      teacTree.getChildren().get(0).addChild(new GeneralTreeNode<Teacher>(new Teacher("Wang",3512)));
      System.out.println(teacTree.getChildren().get(0).getChildren().get(1).getData().name);
      
      
      Boolean stuExist= stuTree.search(new Student("Amy","m"));
      Boolean teacExist=teacTree.search(new Teacher("Wang",3021));
      System.out.println(stuExist);
      System.out.println(teacExist);

   }
}

class Student
{
   String name;
   String gender;

   public Student(String name, String gender) {
	 this.name = name;
	 this.gender = gender;
   }

   @Override
   public boolean equals(Object other)
   {
	 return this.name.equals(((Student)other).name);
   }
}

class Teacher
{
   String name;
   int id;

   public Teacher(String name, int id) {
	 this.name = name;
	 this.id = id;
   }

   @Override
   public boolean equals(Object other)
   {
	 return this.id == ((Teacher)other).id;
   }
}
