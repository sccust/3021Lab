package onlinetest2;

/**
 * 
 * @author Xiaodong
 *
 */
public class TestFinal
{
   public static void main(String[] args)   {
	 int totalScore=0;
	 String scoreDetail="";
	 
	 TreeNode tree = new TreeNode(12);
	 TreeNode ch1 = new TreeNode(34);
	 TreeNode ch2 = new TreeNode(57);
	 TreeNode ch12= new TreeNode(44);
	 ch12.setRightChild(new TreeNode(123));
	 ch1.setLeftChild(new TreeNode(13));
	 ch1.setRightChild(ch12);
	 tree.setLeftChild(ch1);
	 tree.setRightChild(ch2);
	 System.out.println(tree.getLeftChild().getRightChild().getRightChild().getData()+"");
	 System.out.println("data:" + tree.toString());
	 /**Q1(1)*/
	 if(tree.getLeftChild().getRightChild().getRightChild().getData()==123)
	 {
	    totalScore+=2;
	    scoreDetail+="2 ";
	 }
	 else scoreDetail+="0 ";
	 
	 /**Q1(2)*/
	 if(tree.toString().equalsIgnoreCase("12 34 57 13 44 123"))
	 {
	    totalScore+=2;
	    scoreDetail+="2 ";
	 }
	 else scoreDetail+="0 ";
	 

	 
	 
      GeneralTreeNode<Double> doubTree= new GeneralTreeNode<Double>(0.05);
      doubTree.setLeftChild(new GeneralTreeNode<Double>(0.07));
      doubTree.setRightChild(new GeneralTreeNode<Double>(0.08));
      doubTree.getLeftChild().setLeftChild(new GeneralTreeNode<Double>(0.54));
      doubTree.getLeftChild().setRightChild(new GeneralTreeNode<Double>(0.73));
      doubTree.getRightChild().setLeftChild(new GeneralTreeNode<Double>(0.55));
      doubTree.getRightChild().setRightChild(new GeneralTreeNode<Double>(0.82));
      doubTree.getRightChild().getRightChild().setRightChild(new GeneralTreeNode<Double>(0.99));
      
      GeneralTreeNode<String> strTree = new GeneralTreeNode<String> ("Comp3021");	
      strTree.setLeftChild(new GeneralTreeNode<String>("src"));
      strTree.setRightChild(new GeneralTreeNode<String>("lib"));
      strTree.getLeftChild().setLeftChild(new GeneralTreeNode<String>("blog"));
      strTree.getLeftChild().setRightChild(new GeneralTreeNode<String>("gui"));
      System.out.println(strTree.getLeftChild().getRightChild().getData());
      
      GeneralTreeNode<Student> stuTree= new GeneralTreeNode<Student>(new Student("Amy","m"));
      stuTree.setLeftChild(new GeneralTreeNode<Student>(new Student("Tom","f")));
      stuTree.setRightChild(new GeneralTreeNode<Student>(new Student("Tom","m")));
      stuTree.getLeftChild().setLeftChild(new GeneralTreeNode<Student>(new Student("Jack","f")));
      stuTree.getLeftChild().setRightChild(new GeneralTreeNode<Student>(new Student("Kim","f")));
      stuTree.getRightChild().setLeftChild(new GeneralTreeNode<Student>(new Student("Kim","f")));
      stuTree.getRightChild().setRightChild(new GeneralTreeNode<Student>(new Student("Jack","f")));
      
      
      GeneralTreeNode<Teacher> teacTree = new GeneralTreeNode<Teacher> (new Teacher("Tim",3021));	
      teacTree.setLeftChild(new GeneralTreeNode<Teacher>(new Teacher("Zhang",0422)));
      teacTree.setRightChild(new GeneralTreeNode<Teacher>(new Teacher("Lee",2015)));
      teacTree.getLeftChild().setLeftChild(new GeneralTreeNode<Teacher>(new Teacher("Jack",3111)));
      teacTree.getLeftChild().setRightChild(new GeneralTreeNode<Teacher>(new Teacher("Wang",3512)));
      teacTree.getRightChild().setLeftChild(new GeneralTreeNode<Teacher>(new Teacher("Wang",5512)));
      teacTree.getRightChild().getLeftChild().setRightChild(new GeneralTreeNode<Teacher>(new Teacher("Wang",2222)));
      System.out.println(teacTree.getLeftChild().getRightChild().getData());
      
      /**Q2(1)*/
	 if(   doubTree.getRightChild().getRightChild().getRightChild().getData().equals(0.99)
	    && stuTree.getLeftChild().getRightChild().getData().equals(new Student("Kim","f"))
	    && teacTree.getRightChild().getLeftChild().getRightChild().getData().equals(new Teacher("Kim",2222)))
	 {
	    totalScore+=2;
	    scoreDetail+="2 ";
	 }
	 else scoreDetail+="0 ";
      
      
      
      /**Q2(2)*/
      boolean doubExist= doubTree.search(0.01);
      boolean strExist=strTree.search("blog");
      boolean stuExist= stuTree.search(new Student("Kim","m"));
      boolean teacExist=teacTree.search(new Teacher("Wang",2222));
      System.out.println(doubExist);
      System.out.println(strExist);
      System.out.println(stuExist);
      System.out.println(teacExist);
	 if(!doubExist&&strExist&&stuExist&&teacExist)
	 {
	    totalScore+=2;
	    scoreDetail+="2 ";
	 }
	 else scoreDetail+="0 ";
      
      
      
      /**Q2(3)*/
	 boolean doubSemetric= doubTree.isSemmetric();
      boolean strSemetric=strTree.isSemmetric();
      boolean stuSemetric= stuTree.isSemmetric();
      boolean teacSemetric=teacTree.isSemmetric();
      System.out.println(doubSemetric);
      System.out.println(strSemetric);
      System.out.println(stuSemetric);
      System.out.println(teacSemetric);
	 if(!doubExist&& !strExist&& stuExist&& !teacExist)
	 {
	    totalScore+=2;
	    scoreDetail+="2 ";
	 }
	 else scoreDetail+="0 ";
	 
	 
	 System.out.println("TotalScore:"+totalScore);
	 System.out.println("details:"+scoreDetail);
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



