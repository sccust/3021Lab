package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;






import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
 
public class Framework {
    
   private JFrame mainFrame;
   private JPanel postPanel;
   private JPanel contentPanel;
   private JLabel statusLabel;
 

   public Framework(){
      prepareGUI();
   }

   public static void main(String[] args){
      Framework  Framework = new Framework();      
      Framework.showTextAreaDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Micro Blog Demo");
      mainFrame.setSize(600,600);
      
      mainFrame.setLayout(new GridLayout(3, 1));
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      
      JLabel text1 = new JLabel("You can still input 140 Characters");
      //text1.setPreferredSize(new Dimension(1,100));
      
      JTextArea postTextArea = new JTextArea("What's on your mind?");
      postTextArea.setBackground(new Color(255,255,224));
      JPanel postButton = new JPanel(new GridLayout(1,8));
      postTextArea.setBorder(BorderFactory.createLoweredSoftBevelBorder());
      //postTextArea.setPreferredSize(new Dimension(300,445));
      JButton moji = new JButton("Moji");
      moji.setBackground(new Color(176,196,222));
      postButton.add(moji);
      
      JButton Image = new JButton("Image");
      Image.setBackground(new Color(176,196,222));
      postButton.add(Image);
      
      JButton Video = new JButton("Vedio");
      Video.setBackground(new Color(176,196,222));
      postButton.add(Video);
      
      JButton Topic = new JButton("Topic");
      Topic.setBackground(new Color(176,196,222));
      postButton.add(Topic);
      
      JButton Long = new JButton("LongBlog");
      Long.setBackground(new Color(176,196,222));
      postButton.add(Long);
      
      JButton button1 = new JButton("Post");
      button1.setBackground(new Color(135,206,250));
      postButton.add(button1);
      
      //postButton.setPreferredSize(new Dimension(60,45));
      postPanel = new JPanel();
      postPanel.setLayout(new BorderLayout());
      postPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
      postPanel.add(text1,BorderLayout.PAGE_START);
      postPanel.add(postTextArea,BorderLayout.CENTER);
      postPanel.add(postButton,BorderLayout.PAGE_END);
      
      statusLabel = new JLabel("",JLabel.CENTER);    
      //statusLabel.setSize(20,700);
      statusLabel.setText("A Simple Micro Blog Demo For COMP3021 (HKUST)");
      
      contentPanel = new JPanel();
      contentPanel.setLayout(new FlowLayout());
      JPanel leftPanel = new JPanel();
      JPanel rightPanel = new JPanel();
      leftPanel.setLayout(new GridLayout(8,1));
      rightPanel.setLayout(new GridLayout(8,1));
      leftPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(0, 0, 0, 0), new EtchedBorder()));
      rightPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(0, 10, 0, 0), new EtchedBorder()));
      leftPanel.setSize(new Dimension(40, 100));
      leftPanel.setSize(new Dimension(150,100));
      //JLabel 
   
      //post1.add(new JLabel("2014-02-11,11:33:23"),BorderLayout.PAGE_START);
      //post1.add(new JTextArea("Select either the Left to Right or Right to Left option and click the Apply orientation button to set up the component's orientation. The following code snippet applies the Left to Right components orientation to the experimentLayout."),BorderLayout.CENTER);
      //rightPanel.add(post1);
      
      //contentPanel.add(leftPanel);
      //contentPanel.add(rightPanel);
      //contentPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(0, 10, 10, 10), new EtchedBorder()));
      
      
      mainFrame.add(postPanel);
      mainFrame.add(contentPanel);
      
      //mainFrame.add(statusLabel);
      mainFrame.setVisible(true); 
     
   }

   private void showTextAreaDemo(){
 //     headerLabel.setText("Control in action: JTextArea"); 

      
      


//      JScrollPane scrollPane = new JScrollPane(commentTextArea);    
//
//      JButton showButton = new JButton("Show");
//
//      showButton.addActionListener(new ActionListener() {
//         public void actionPerformed(ActionEvent e) {     
//            statusLabel.setText( commentTextArea.getText());        
//         }
//      }); 

      //controlPanel.add(commentlabel);
      //controlPanel.add(scrollPane);        
      //controlPanel.add(showButton);
      mainFrame.setVisible(true);  
   }
}
