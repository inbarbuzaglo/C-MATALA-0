package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class Source extends JFrame {

	private JPanel contentPane;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Source frame = new Source();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Source() {
		
	   	 final wrapper w= new wrapper(); //מעטפת

	   	 JFrame f = new JFrame("wigle"); 
	   	 JPanel MyPanel1 = new JPanel();
	     MyPanel1.setBackground(Color.LIGHT_GRAY);
	    
	   	 JLabel x1 = new JLabel("folder..");
	   	 x1.setFont(new Font("Tahoma", Font.BOLD, 13));
	   	 x1.setBackground(Color.LIGHT_GRAY);
	   	 final JTextField x2 = new JTextField();
	   	JLabel x3 = new JLabel("file..");
	   	x3.setFont(new Font("Tahoma", Font.BOLD, 13));
	  	 JTextField x4 = new JTextField();
	   	 JButton x5 = new JButton("save as merged csv");
	   	 x5.setBackground(Color.GRAY);
	   	 x5.setForeground(Color.BLACK);
	   	 JButton y6 = new JButton("save as merged KML");
	   	 y6.setBackground(Color.GRAY);
	    
	   	 f.getContentPane().add( MyPanel1, "North");   // Add MyPanel1 to North
	   	 JButton y7 = new JButton("Clear data");
	   	 GroupLayout gl_MyPanel1 = new GroupLayout(MyPanel1);
	   	 gl_MyPanel1.setHorizontalGroup(
	   	 	gl_MyPanel1.createParallelGroup(Alignment.LEADING)
	   	 		.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 			.addContainerGap()
	   	 			.addComponent(x1)
	   	 			.addGap(18)
	   	 			.addGroup(gl_MyPanel1.createParallelGroup(Alignment.LEADING)
	   	 				.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 					.addComponent(x2, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
	   	 					.addGap(63))
	   	 				.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 					.addComponent(x5)
	   	 					.addGap(97)))
	   	 			.addComponent(x3)
	   	 			.addPreferredGap(ComponentPlacement.RELATED)
	   	 			.addGroup(gl_MyPanel1.createParallelGroup(Alignment.TRAILING)
	   	 				.addGroup(Alignment.LEADING, gl_MyPanel1.createSequentialGroup()
	   	 					.addComponent(y6)
	   	 					.addGap(52)
	   	 					.addComponent(y7)
	   	 					.addContainerGap())
	   	 				.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 					.addComponent(x4, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
	   	 					.addGap(182))))
	   	 );
	   	 gl_MyPanel1.setVerticalGroup(
	   	 	gl_MyPanel1.createParallelGroup(Alignment.LEADING)
	   	 		.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 			.addContainerGap()
	   	 			.addGroup(gl_MyPanel1.createParallelGroup(Alignment.BASELINE)
	   	 				.addComponent(x2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	   	 				.addComponent(x1)
	   	 				.addComponent(x3)
	   	 				.addComponent(x4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
	   	 			.addPreferredGap(ComponentPlacement.RELATED)
	   	 			.addGroup(gl_MyPanel1.createParallelGroup(Alignment.BASELINE)
	   	 				.addComponent(x5)
	   	 				.addComponent(y6)
	   	 				.addComponent(y7, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
	   	 			.addContainerGap())
	   	 );
	   	 MyPanel1.setLayout(gl_MyPanel1);
	    
	   	 // -----------------------------------------------------------
	   	 // Make another Panel with 5 button
	   	 // -----------------------------------------------------------
	   	 JPanel MyPanel2 = new JPanel();
	   	MyPanel2.setBackground(Color.LIGHT_GRAY);
	    
	   	 JLabel x6 = new JLabel("Filters");
	   	 x6.setFont(new Font("Tahoma", Font.BOLD, 13));
	   	 JLabel SP2 = new JLabel("    ");
	   	JLabel SP3 = new JLabel("    ");
	   	JLabel SP4 = new JLabel("    ");
	   
	   	 JLabel y10 = new JLabel("    ");
	   	 final JCheckBox x7 = new JCheckBox("time");
	   	 JLabel y25 = new JLabel("from");
	   	 JTextField y26 = new JTextField(10);
		 JLabel y27 = new JLabel("to");
	   	 final JCheckBox x8 = new JCheckBox("lat");
	  
	   	 JLabel y31 = new JLabel("from");
	   	 final JTextField y32 = new JTextField(10);
		 JLabel y33 = new JLabel("to");
	  	 final JTextField y34 = new JTextField(10);
	     final JCheckBox x9 = new JCheckBox("lon");
	   	 JLabel lonfrom = new JLabel("from");
	  	 JTextField TF1 = new JTextField(10);
	   	 final JCheckBox x10 = new JCheckBox("alt");
	   	 JLabel altfrom = new JLabel("from");
		 JLabel altto = new JLabel("to");
	  	 JTextField TF3 = new JTextField(10);
	   	 
	    
	   	 f.getContentPane().add( MyPanel2, BorderLayout.CENTER);
	   	 
	   	 JLabel label = new JLabel("to");
	   	 
	   	 textField_4 = new JTextField(10);
	   	 
	   	 JLabel label_1 = new JLabel("to");
	   	 
	   	 textField_5 = new JTextField(10);
	   	 
	   	 JLabel label_2 = new JLabel("from");
	   	 
	   	 JLabel label_3 = new JLabel("to");
	   	 
	   	 textField_6 = new JTextField(10);
	   	 
	   	 textField_7 = new JTextField(10);
	   	 
	   	 textField_8 = new JTextField(10);
	   	 
	   	 textField_9 = new JTextField(10);
	   	 
	   	 JButton btnGo = new JButton("go");
	   	 
	   	 JButton button = new JButton("go");
	   	 
	   	 JButton button_1 = new JButton("go");
	   	 
	   	 JButton button_2 = new JButton("go");
	   	 GroupLayout gl_MyPanel2 = new GroupLayout(MyPanel2);
	   	 gl_MyPanel2.setHorizontalGroup(
	   	 	gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 		.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 			.addContainerGap()
	   	 			.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 				.addComponent(x6, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 				.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 					.addGroup(gl_MyPanel2.createParallelGroup(Alignment.TRAILING)
	   	 						.addComponent(x9, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 						.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 							.addComponent(x10, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 							.addComponent(x7, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 							.addComponent(x8, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
	   	 					.addGap(18)
	   	 					.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addComponent(y25, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
	   	 							.addPreferredGap(ComponentPlacement.UNRELATED)
	   	 							.addComponent(y26, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING, false)
	   	 								.addComponent(lonfrom, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	   	 								.addComponent(y31, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addPreferredGap(ComponentPlacement.RELATED)
	   	 									.addComponent(label_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	   	 							.addGap(18)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
	   	 								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
	   	 								.addComponent(y32, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))))
	   	 					.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addGap(23)
	   	 							.addComponent(label_3, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
	   	 							.addPreferredGap(ComponentPlacement.RELATED)
	   	 							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addGap(18)
	   	 							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
	   	 							.addPreferredGap(ComponentPlacement.RELATED)
	   	 							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addGap(18)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 								.addComponent(y33, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
	   	 								.addComponent(label, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
	   	 							.addPreferredGap(ComponentPlacement.RELATED)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))))
	   	 					.addPreferredGap(ComponentPlacement.UNRELATED)
	   	 					.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 								.addComponent(btnGo)
	   	 								.addComponent(button, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
	   	 								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
	   	 							.addGap(81)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.TRAILING)
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addComponent(SP2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 									.addComponent(SP3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 									.addComponent(SP4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
	   	 								.addComponent(TF3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addComponent(altfrom, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	   	 									.addGap(140)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 										.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 											.addGap(166)
	   	 											.addComponent(y10, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
	   	 										.addComponent(altto))
	   	 									.addGap(366)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.TRAILING)
	   	 										.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 											.addComponent(y27, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	   	 											.addGap(162))
	   	 										.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 											.addComponent(y34, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(TF1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))))))
	   	 						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
	   	 			.addContainerGap())
	   	 );
	   	 gl_MyPanel2.setVerticalGroup(
	   	 	gl_MyPanel2.createParallelGroup(Alignment.TRAILING)
	   	 		.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 			.addComponent(x6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
	   	 			.addPreferredGap(ComponentPlacement.RELATED)
	   	 			.addGroup(gl_MyPanel2.createParallelGroup(Alignment.TRAILING)
	   	 				.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 					.addComponent(x8, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
	   	 					.addGap(237))
	   	 				.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 					.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addGap(1)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 										.addGroup(gl_MyPanel2.createParallelGroup(Alignment.BASELINE)
	   	 											.addComponent(SP2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(x7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(y25, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
	   	 										.addComponent(SP3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 										.addComponent(SP4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addGap(15)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.BASELINE)
	   	 										.addComponent(y26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 										.addComponent(label)
	   	 										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 										.addComponent(btnGo))))
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addGap(9)
	   	 									.addComponent(y27)
	   	 									.addGap(30)
	   	 									.addComponent(y34, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
	   	 									.addGap(5))
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addGap(7)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.BASELINE)
	   	 										.addComponent(y31, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
	   	 										.addComponent(y32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 										.addComponent(y33, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
	   	 										.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 										.addComponent(button))
	   	 									.addGap(6)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 										.addComponent(x9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	   	 										.addGroup(gl_MyPanel2.createParallelGroup(Alignment.BASELINE)
	   	 											.addComponent(lonfrom, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(label_1)
	   	 											.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(button_1)))
	   	 									.addPreferredGap(ComponentPlacement.RELATED)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING, false)
	   	 										.addGroup(gl_MyPanel2.createParallelGroup(Alignment.BASELINE)
	   	 											.addComponent(label_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	   	 											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(label_3)
	   	 											.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(button_2))
	   	 										.addComponent(x10, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
	   	 									.addGap(21))))
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addGap(42)
	   	 							.addComponent(y10, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
	   	 					.addPreferredGap(ComponentPlacement.RELATED)
	   	 					.addComponent(TF1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 					.addPreferredGap(ComponentPlacement.RELATED)
	   	 					.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 						.addComponent(TF3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 						.addComponent(altfrom, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 						.addComponent(altto, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
	   	 					.addGap(0))))
	   	 );
	   	 MyPanel2.setLayout(gl_MyPanel2);
	   //    f.getContentPane().add(MyPanel2, "Center");  // Paste MyPanel2 to Center     
	    
	   
	      
	      JPanel MyPanel3 = new JPanel();
	      MyPanel3.setBackground(Color.LIGHT_GRAY);
	    	 JLabel y12 = new JLabel("    ");
	    	
	    	 JButton y17 = new JButton("Algo1");
	    	 y17.setToolTipText("Location per network");
	    	 y17.setFont(new Font("Tahoma", Font.BOLD, 11));
	    	 y17.setBackground(new Color(102, 102, 102));
	    	
	    	 JButton y24 = new JButton("Algo2");
	    	 y24.setFont(new Font("Tahoma", Font.BOLD, 11));
	    	 y24.setBackground(Color.GRAY);
	    		    	  	
	     
	    	 f.getContentPane().add( MyPanel3, "South");
	    	 GroupLayout gl_MyPanel3 = new GroupLayout(MyPanel3);
	    	 gl_MyPanel3.setHorizontalGroup(
	    	 	gl_MyPanel3.createParallelGroup(Alignment.LEADING)
	    	 		.addGroup(gl_MyPanel3.createSequentialGroup()
	    	 			.addGap(131)
	    	 			.addComponent(y17, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
	    	 			.addGap(42)
	    	 			.addComponent(y24, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
	    	 			.addPreferredGap(ComponentPlacement.RELATED)
	    	 			.addComponent(y12, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
	    	 			.addContainerGap(117, Short.MAX_VALUE))
	    	 );
	    	 gl_MyPanel3.setVerticalGroup(
	    	 	gl_MyPanel3.createParallelGroup(Alignment.LEADING)
	    	 		.addGroup(gl_MyPanel3.createSequentialGroup()
	    	 			.addGroup(gl_MyPanel3.createParallelGroup(Alignment.LEADING)
	    	 				.addGroup(gl_MyPanel3.createSequentialGroup()
	    	 					.addContainerGap()
	    	 					.addComponent(y12, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
	    	 				.addGroup(gl_MyPanel3.createSequentialGroup()
	    	 					.addGap(21)
	    	 					.addGroup(gl_MyPanel3.createParallelGroup(Alignment.BASELINE)
	    	 						.addComponent(y17, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	    	 						.addComponent(y24, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))))
	    	 			.addContainerGap(86, Short.MAX_VALUE))
	    	 );
	    	 MyPanel3.setLayout(gl_MyPanel3);
	     
	    	 f.setSize(872, 595);
	    	 f.setVisible(true);
	    	 
	    	
	    	 
	    	
	    	 x7.addItemListener(new ItemListener() { //time filter
	    	      public void itemStateChanged(ItemEvent e) {
	    	    	  if(x7.isSelected())
	    	    	  {
	    	    		  System.out.println("true");
	    	    	  }
	    	       
	    	      }
	    	    });
	    	 
	    	
	    	 x9.addItemListener(new ItemListener() { //lon filter
	    	      public void itemStateChanged(ItemEvent e) {
	    	    	  if(x9.isSelected())
	    	    	  {
	    	    		  System.out.println("true");
	    	    	  }
	    	       
	    	      }
	    	    });
	    	 
	    	 x10.addItemListener(new ItemListener() { //alt filter
	    	      public void itemStateChanged(ItemEvent e) {
	    	    	  if(x10.isSelected())
	    	    	  {
	    	    		  System.out.println("true");
	    	    	  }
	    	       
	    	      }
	    	    });
	    	 
	    	 btnGo.addActionListener(new ActionListener()
	    	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			 System.out.println("go time filter");
	         	 }
	    	 });
	    	 
	    	 button.addActionListener(new ActionListener()
	    	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			 String latfrom=y32.getText();
	    			 String latto=y34.getText();	    			
	    		
	         	 }
	    	 });
	    	 
	    	 button_1.addActionListener(new ActionListener()
	    	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			 System.out.println("go lon filter");
	         	 }
	    	 });
	    	 
	    	 button_2.addActionListener(new ActionListener()
	    	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			 System.out.println("go alt filter");
	         	 }
	    	 });
	    	 
	    	 y17.addActionListener(new ActionListener() //ALGO1 BUTTON
	    	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			 w.Algo1();
	         	 }
	    	 });
	    	 
	    	 y24.addActionListener(new ActionListener()  //ALGO2 BUTTON
	    	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			 w.Algo2();
	         	 }
	    	 });
	    	 
	    	 x5.addActionListener(new ActionListener()  //ALGO2 BUTTON
	    	 {
	    		 String s=x2.getText();
	    		 public void actionPerformed(ActionEvent evt) 
	    		 {
	    			 
	    			 String s=x2.getText();
	    			 File folder = new File(s);
	    			  w.listfromfolder(folder);
	    		
	         	 }
	    	 });
	    	 y6.addActionListener(new ActionListener()  //kml BUTTON
	    	    	 {
	    	    		 String s=x2.getText();
	    	    		 public void actionPerformed(ActionEvent evt) 
	    	    		 {
	    	    			 if(x8.isSelected())
	    	    			 {
	    	    				 String from=y32.getText();
	    	    				 String to=textField_7.getText();
	    	    				 File folder = new File(s);
		    	    			 w.tokmllat(folder,from,to);
	    	    			 }
	    	    			 else
	    	    			 {
	    	    			 String s=x2.getText();
	    	    			 File folder = new File(s);
	    	    			  w.tokmlnone(folder);
	    	    			 }
	    	    		
	    	         	 }
	    	    	 });
	    	 
	    	 
	    	y7.addActionListener(new ActionListener()
	    	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			
	    			 try {
	    				 w.cleardata();
		    			 System.out.println("data cleard");
	 				} catch (Exception e) {
	 					 System.out.println("arraylist is already empty");
	 				}
	         	 }
	    	 });
	    	 

	    	 
	    	 
	      }
	}
