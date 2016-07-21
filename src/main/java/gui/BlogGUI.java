package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BlogGUI implements ActionListener{
	private JFrame mainFrame;
	private JTextArea postTextArea;
	private JTextField postContent;
	private JButton refresh;
	private JButton post;
	
	public BlogGUI() {
		
	}
	
	public void setWindow() {
		JFrame mainFrame = new JFrame("Your Name");
		mainFrame.setSize(600,600);
		mainFrame.setLayout(new GridLayout(4,1));
		postTextArea = new JTextArea("Type something...");
		postContent = new JTextField("Here is my blog?");
		refresh = new JButton("refresh");
		post = new JButton("post");
		mainFrame.add(postTextArea);
		mainFrame.add(refresh);
		mainFrame.add(post);
		mainFrame.add(postContent);
		mainFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		BlogGUI blogGUi = new BlogGUI();
		blogGUi.setWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
