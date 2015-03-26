package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
 
public class Framework implements ActionListener {
    
	private JFrame mainFrame;
	private JPanel postPanel;
	private JTextField postContent;
	private JButton refresh;
	private JButton post;

   public Framework(){

   }

   public void setGUI() {
	   	mainFrame = new JFrame("Micro Blog Demo");
	   	mainFrame.setSize(600,600);
	   	mainFrame.setLayout(new GridLayout(2, 1));
	   	
	   	
	   	/*
	   	 * New text areas
	   	 * 
	   	 * */
	   	JLabel text1 = new JLabel("You can still input 140 Characters");
	   	JTextArea postTextArea = new JTextArea("What's on your mind?");
	   	postTextArea.setBackground(new Color(255,255,224));
	   	postTextArea.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	   	
	   	/*
	   	 * New Post Panel and 
	   	 * */
	   	postPanel = new JPanel();
	   	postPanel.setLayout(new BorderLayout());
	   	postPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 0, 10), new EtchedBorder()));
	   	postPanel.add(text1,BorderLayout.PAGE_START);
	   	postPanel.add(postTextArea,BorderLayout.CENTER);
	   	JPanel buttonPanel = new JPanel(new GridLayout(1,2));
	   	
	   	/*
	   	 * New post and refresh button
	   	 * and add these buttons to post Panel
	   	 * */
	   	refresh = new JButton("refresh");
	   	refresh.setBackground(new Color(176,196,222));
	   	refresh.addActionListener(this);
	   	post = new JButton("post");
	   	post.setBackground(new Color(135,206,250));
	   	post.addActionListener(this);
	   	buttonPanel.add(refresh);
	   	buttonPanel.add(post);
	   	postPanel.add(buttonPanel,BorderLayout.PAGE_END);
	   	mainFrame.add(postPanel);
	   	
	   	/*
	   	 * New post content and add this to the main frame
	   	 * */
	   	postContent = new JTextField(20);
	   	postContent.setText("Here is put my posts!");
	   	postContent.setEditable(false);
	   	postContent.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(0, 10, 10, 10), new EtchedBorder()));
	   	postContent.setHorizontalAlignment(JTextField.CENTER);
 
	   	mainFrame.add(postContent);
	   	mainFrame.setVisible(true); 
   }
   
   public static void main(String[] args){
	   Framework framework = new Framework(); 
	   framework.setGUI();
   }

   @Override
   public void actionPerformed(ActionEvent e) {
	   if (e.getSource() == post) {
		   postContent.setText("You click POST!");
	   } else if (e.getSource() == refresh) {
		   postContent.setText("You click REFRESH!");
	   }
	   
	   // TODO Auto-generated method stub
		
   }
}
