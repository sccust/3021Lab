package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import base.*;
import blog.*;

public class Framework{
    
	private JFrame mainFrame;
	private JPanel postPanel;
	private JTextArea postContent;
	private JTextArea postTextArea;
	private JButton refresh;
	private JButton post;
	private JLabel text1;
	private Blog myBlog;
	private String blogPath;
	
   public Framework(String path, User user){
	   myBlog = new Blog(user);
	   blogPath = path;
	   File blogFile = new File(path);
	   if(blogFile.exists()){
		   myBlog.load(path);
	}	   
   }

   public void setGUI() {
	   	mainFrame = new JFrame("Micro Blog Demo");
	   	mainFrame.setSize(600,600);
	   	mainFrame.setLayout(new GridLayout(2,1));
	   	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   	
	   	/*
	   	 * New postTextArea
	   	 * PostTextArea is used to edit posts
	   	 * */
	   	text1 = new JLabel("You can still input 140 Characters");
	   	postTextArea = new JTextArea();
	   	postTextArea.setBackground(new Color(255,255,224));
	   	postTextArea.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	   	postTextArea.addKeyListener(new lengthListener());
	   	postTextArea.setLineWrap(true);
	   	postTextArea.setWrapStyleWord(true);
	   	
	   	/*
	   	 * New Post Panel
	   	 * */
	   	postPanel = new JPanel();
	   	postPanel.setLayout(new BorderLayout());
	   	postPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 0, 10), new EtchedBorder()));
	   	postPanel.add(text1,BorderLayout.PAGE_START);
	   	postPanel.add(postTextArea,BorderLayout.CENTER);
	   	JPanel buttonPanel = new JPanel(new GridLayout(1,2));
	   	
	   	/*
	   	 * New post button,list button and refresh button
	   	 * and add these buttons to post Panel
	   	 * */
	   	refresh = new JButton("refresh");
	   	refresh.setBackground(new Color(176,196,222));
	   	refresh.addActionListener(new refreshListener());
	   	
	   	post = new JButton("post");
	   	post.setBackground(new Color(135,206,250));
	   	post.addActionListener(new postListener());
	   	
	   	
	   	buttonPanel.add(refresh);
	   	buttonPanel.add(post);
	   	postPanel.add(buttonPanel,BorderLayout.PAGE_END);
	   	mainFrame.add(postPanel);
	   	
	   	/*
	   	 * New postContent and add this to the main frame
	   	 * postContent is used to display all posts
	   	 * */
	   	postContent = new JTextArea();
	   	postContent.setEditable(false);
	   	postContent.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(0, 10, 10, 10), new EtchedBorder()));
	   	postContent.setLineWrap(true);
	   	postContent.setWrapStyleWord(true);
	   	
	   	
	   	mainFrame.add(new JScrollPane(postContent));
	   	mainFrame.setVisible(true); 
   }
   
   /*
    * Inner class
    * KeyListener for recording current length of posts. 
    */
   class lengthListener implements KeyListener{
	public void keyPressed(KeyEvent e) {	
	}

	public void keyReleased(KeyEvent e) {
		int lengthRemain = 140-postTextArea.getText().length();
		String lengthInfo;
		if(lengthRemain>=0){
			lengthInfo = "You can still input "+lengthRemain+" Characters";			
		}else{
			lengthInfo = "Your post length has exceeded 140!";
		}
		text1.setText(lengthInfo);	
	}

	public void keyTyped(KeyEvent e) {
	}
   }
   
   
   /*
    * Inner class
    * ActionListener for post button
    * Display the new post in postContent and add it to the blogfile.
    */
   class postListener implements ActionListener{
	   public void actionPerformed(ActionEvent e){		   
		   String content = postTextArea.getText();
		   
		   if(content.length()>140){
			   postContent.setText("Length exceeded 140!");
		   }
		   else if (content.length()==0){
			   postContent.setText("Empty Post!");
		   }
		   else{
			   Date date = new Date();
			   Post post = new Post(date,content);
			   myBlog.post(post);
			   myBlog.save(blogPath);
			   postContent.setText(post+"\n");
			   postTextArea.setText("");
			   text1.setText("You can still input 140 Characters");
			   postTextArea.requestFocus();
		   }
		  
	   }
	   
   }
   
   /*
    * Inner class
    * ActionListener for refresh button
    * Read all posts in the blogfile and display them in the postContent
    */
   class refreshListener implements ActionListener{
	   public void actionPerformed(ActionEvent e){
		   postContent.setText("");
		   myBlog.load(blogPath);
		   for(Post p: myBlog.getPost()){
			   postContent.append(p+"\n");
		   }
	   }
   }
   
   public static void main(String[] args){
	   String blogPath = "/set blog file path/";
	   User user = new User(1, "A", "a@cse.ust.hk");
	   Framework framework = new Framework(blogPath, user); 
	   framework.setGUI();
 }
  
}
