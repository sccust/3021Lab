package onlinetest2;

/**
 * 
 * @author Xiaodong
 * 
 */
public class TestFinal {
	public static void main(String[] args) {
		double totalScore = 0;
		String scoreDetail = "";

		try {
			TreeNode node1 = new TreeNode(11);
			TreeNode node2 = new TreeNode(22);

			if (node1.getData() == 11 && node2.getData() == 22) {
				/** Q1(1): constructor & getData */
				totalScore += 0.8;
				scoreDetail += "Q1(1): constructor + getData(): 0.8\n";
			} else {
				scoreDetail += "Q1(1): constructor + getData(): 0\n";
			}

		} catch (Exception e) {

		}

		try {
			TreeNode root = new TreeNode(11);
			TreeNode leftnode = new TreeNode(22);
			root.setLeftChild(leftnode);

			if (root.getLeftChild().getData() == 22) {
				/** Q1(1): setLeftChild, getLeftChild */
				totalScore += 0.6;
				scoreDetail += "Q1(1): setLeftChild() + getLeftChild(): 0.6\n";
			} else {
				scoreDetail += "Q1(1): setLeftChild() + getLeftChild(): 0\n";
			}

		} catch (Exception e) {

		}

		try {
			TreeNode root = new TreeNode(11);
			TreeNode rightnode = new TreeNode(33);
			root.setRightChild(rightnode);

			if (root.getRightChild().getData() == 33) {
				/** Q1(1): setRightChild, getRightChild */
				totalScore += 0.6;
				scoreDetail += "Q1(1): setRightChild() + getRightChild: 0.6\n";
			} else {
				scoreDetail += "Q1(1): setRightChild() + getRightChild: 0\n";
			}

		} catch (Exception e) {

		}

		try {

			TreeNode tree = new TreeNode(12);
			TreeNode ch1 = new TreeNode(34);
			TreeNode ch2 = new TreeNode(57);
			TreeNode ch12 = new TreeNode(44);
			ch12.setRightChild(new TreeNode(123));
			ch1.setLeftChild(new TreeNode(13));
			ch1.setRightChild(ch12);
			tree.setLeftChild(ch1);
			tree.setRightChild(ch2);

			/** Q1(2) */
			/** Relax the criterion by adding trim() */
			if (tree.toString().trim().equalsIgnoreCase("12 34 57 13 44 123")) {
				totalScore += 2;
				scoreDetail += "Q1(2): 2\n";
			} else
				scoreDetail += "Q1(2): 0\n";
		} catch (Exception e) {

		}

		try {
			GeneralTreeNode<Double> doubleTree = new GeneralTreeNode<Double>(
					0.05);
			GeneralTreeNode<Character> charTree = new GeneralTreeNode<Character>(
					'c');

			if (doubleTree.getData().equals(0.05)
					&& charTree.getData().equals('c')) {
				/** Q2(1): constructor & getData */
				totalScore += 0.8;
				scoreDetail += "Q2(1): constructor + getData(): 0.8\n";
			} else {
				scoreDetail += "Q2(1): constructor + getData(): 0\n";
			}

		} catch (Exception e) {

		}

		try {
			GeneralTreeNode<Student> stuTree = new GeneralTreeNode<Student>(
					new Student("Amy", "f"));
			stuTree.setLeftChild(new GeneralTreeNode<Student>(new Student(
					"Tom", "m")));
			if (stuTree.getLeftChild().getData()
					.equals(new Student("Tom", "m"))) {
				/** Q2(1): leftChild setter+getter */
				totalScore += 0.6;
				scoreDetail += "Q2(1): setLeftChild() + getLeftChild(): 0.6\n";
			} else {
				scoreDetail += "Q2(1): setLeftChild() + getLeftChild(): 0\n";
			}

		} catch (Exception e) {

		}

		try {
			GeneralTreeNode<Teacher> teacTree = new GeneralTreeNode<Teacher>(
					new Teacher("Tim", 3021));
			teacTree.setRightChild(new GeneralTreeNode<Teacher>(new Teacher(
					"Zhang", 0422)));
			if (teacTree.getRightChild().getData()
					.equals(new Teacher("Zhang", 0422))) {
				/** Q2(1): rightChild setter+getter */
				totalScore += 0.6;
				scoreDetail += "Q2(1): setRightChild() + getRightChild(): 0.6\n";
			} else {
				scoreDetail += "Q2(1): setRightChild() + getRightChild(): 0\n";
			}
		} catch (Exception e) {

		}


		GeneralTreeNode<Double> doubTree =null;
		GeneralTreeNode<String> strTree = null;
		GeneralTreeNode<Student> stuTree = null;
		GeneralTreeNode<Teacher> teacTree = null;
		
		try{
		doubTree = new GeneralTreeNode<Double>(0.05);
		doubTree.setLeftChild(new GeneralTreeNode<Double>(0.07));
		doubTree.setRightChild(new GeneralTreeNode<Double>(0.08));
		doubTree.getLeftChild().setLeftChild(new GeneralTreeNode<Double>(0.54));
		doubTree.getLeftChild()
				.setRightChild(new GeneralTreeNode<Double>(0.73));
		doubTree.getRightChild()
				.setLeftChild(new GeneralTreeNode<Double>(0.55));
		doubTree.getRightChild().setRightChild(
				new GeneralTreeNode<Double>(0.82));

		strTree = new GeneralTreeNode<String>(
				"Comp3021");
		strTree.setLeftChild(new GeneralTreeNode<String>("src"));
		strTree.setRightChild(new GeneralTreeNode<String>("lib"));
		strTree.getLeftChild()
				.setLeftChild(new GeneralTreeNode<String>("blog"));
		strTree.getLeftChild()
				.setRightChild(new GeneralTreeNode<String>("gui"));

		stuTree = new GeneralTreeNode<Student>(
				new Student("Amy", "m"));
		stuTree.setLeftChild(new GeneralTreeNode<Student>(new Student("Tom",
				"m")));
		stuTree.setRightChild(new GeneralTreeNode<Student>(new Student("Tom",
				"m")));
		stuTree.getLeftChild().setLeftChild(
				new GeneralTreeNode<Student>(new Student("Jack", "f")));
		stuTree.getLeftChild().setRightChild(
				new GeneralTreeNode<Student>(new Student("Kim", "f")));
		stuTree.getRightChild().setLeftChild(
				new GeneralTreeNode<Student>(new Student("Kim", "f")));
		stuTree.getRightChild().setRightChild(
				new GeneralTreeNode<Student>(new Student("Jack", "f")));

		teacTree = new GeneralTreeNode<Teacher>(
				new Teacher("Tim", 3021));
		teacTree.setLeftChild(new GeneralTreeNode<Teacher>(new Teacher("Zhang",
				0422)));
		teacTree.setRightChild(new GeneralTreeNode<Teacher>(new Teacher("Lee",
				2015)));
		teacTree.getLeftChild().setLeftChild(
				new GeneralTreeNode<Teacher>(new Teacher("Jack", 3111)));
		teacTree.getLeftChild().setRightChild(
				new GeneralTreeNode<Teacher>(new Teacher("Wang", 3512)));
		teacTree.getRightChild().setLeftChild(
				new GeneralTreeNode<Teacher>(new Teacher("Wang", 5512)));
		teacTree.getRightChild()
				.getLeftChild()
				.setRightChild(
						new GeneralTreeNode<Teacher>(new Teacher("Wang", 2222)));
		}
		catch(Exception e)
		{
		   System.err.println("");
		}
		
		
		
		try {
			/** Q2(2) */
			boolean doubExist = doubTree.search(0.01);
			boolean strExist = strTree.search("blog");
			boolean stuExist = stuTree.search(new Student("Kim", "m"));
			boolean teacExist = teacTree.search(new Teacher("Wang", 2222));
			if (!doubExist && strExist && !stuExist && teacExist) {
				totalScore += 2;
				scoreDetail += "Q2(2): 2\n";
			} else
				scoreDetail += "Q2(2): 0\n";
		} catch (Exception e) {

		}

		try {
			/** Q2(3) */
			boolean doubSymmetric = doubTree.isSymmetric();
			boolean strSymmetric = strTree.isSymmetric();
			boolean stuSymmetric = stuTree.isSymmetric();
			boolean teacSymmetric = teacTree.isSymmetric();

			if (!doubSymmetric && !strSymmetric && stuSymmetric
					&& !teacSymmetric) {
				totalScore += 2;
				scoreDetail += "Q2(3): 2\n";
			} else
				scoreDetail += "Q2(3): 0\n";
		} catch (Exception e) {

		}

		System.out.println("TotalScore:" + totalScore);
		System.out.println("Details:\n" + scoreDetail);
	}
}

class Student {
	String name;
	String gender;

	public Student(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	@Override
	public boolean equals(Object other) {
		return this.name.equals(((Student) other).name)
				&& this.gender.equals(((Student) other).gender);
	}
}

class Teacher {
	String name;
	int id;

	public Teacher(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object other) {
		return this.id == ((Teacher) other).id
				&& this.name.equals(((Teacher) other).name);
	}
}
