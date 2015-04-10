package onlinetest2;

public class Test22
{
   public static void main(String[] args)
   {
		TreeNode tree = new TreeNode(12);
	     TreeNode ch11 = new TreeNode (5);
        TreeNode ch12 = new TreeNode (23);
        TreeNode ch111 = new TreeNode (34);
        TreeNode ch112 = new TreeNode (22);
        tree.addChild(ch11);
        tree.addChild(ch12);
        ch11.addChild(ch111);
        ch11.addChild(ch112);
	
        System.out.println("depth:"+tree.depth());
        System.out.println("data:"+tree.toString());

        GeneralTreeNode<String> strTree = new GeneralTreeNode<String>("hello");
        
        GeneralTreeNode<Student> stuTree= new GeneralTreeNode<Student>(new Student("stu1","female"));

        GeneralTreeNode<Teacher> teacTree = new GeneralTreeNode<Teacher> (new Teacher("teac1",3021));	
	

        Boolean stuExist= stuTree.search(new Student("stu1","male"));
        
       Boolean teacExist=teacTree.search(new Teacher("t1",3021));
       System.out.println(stuExist);
       System.out.println(teacExist);

   }
}

class Student
{
String name;
String gender;
public Student(String name, String gender);
{
    this.name=name;
    this.gender=gender;
}
public boolean equals(Student other)
{
    return this.name.equalsIgnoreCase(other.name);
}

}


class Teacher
{
String name;
int id;
public Teacher(String name, int id)
{
    this.name=name;
    this.id=id;
}
public boolean equals(Teacher other)
{
    return this.id==other.id;
}

}


