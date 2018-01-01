package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

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

	   	 JFrame f = new JFrame("wigle"); 
	   	 JPanel MyPanel1 = new JPanel();
	     MyPanel1.setBackground(Color.LIGHT_GRAY);
	    
	   	 JLabel x1 = new JLabel("folder..");
	   	 x1.setFont(new Font("Tahoma", Font.BOLD, 13));
	   	 x1.setBackground(Color.LIGHT_GRAY);
	   	 JTextField x2 = new JTextField();
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
	   	 y7.addActionListener(new ActionListener()
	   	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			 System.out.println("Clear data");
	         	 }
	   	 });
	   	 GroupLayout gl_MyPanel1 = new GroupLayout(MyPanel1);
	   	 gl_MyPanel1.setHorizontalGroup(
	   	 	gl_MyPanel1.createParallelGroup(Alignment.LEADING)
	   	 		.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 			.addContainerGap()
	   	 			.addComponent(x1)
	   	 			.addGap(18)
	   	 			.addGroup(gl_MyPanel1.createParallelGroup(Alignment.LEADING)
	   	 				.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 					.addComponent(x2, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
	   	 					.addGap(18)
	   	 					.addComponent(x3)
	   	 					.addGap(18))
	   	 				.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 					.addComponent(x5)
	   	 					.addGap(97)))
	   	 			.addGroup(gl_MyPanel1.createParallelGroup(Alignment.LEADING)
	   	 				.addComponent(y6)
	   	 				.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 					.addComponent(x4, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
	   	 					.addPreferredGap(ComponentPlacement.RELATED)
	   	 					.addComponent(y7)))
	   	 			.addGap(28))
	   	 );
	   	 gl_MyPanel1.setVerticalGroup(
	   	 	gl_MyPanel1.createParallelGroup(Alignment.LEADING)
	   	 		.addGroup(gl_MyPanel1.createSequentialGroup()
	   	 			.addContainerGap()
	   	 			.addGroup(gl_MyPanel1.createParallelGroup(Alignment.BASELINE)
	   	 				.addComponent(x4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	   	 				.addComponent(x3)
	   	 				.addComponent(x2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	   	 				.addComponent(x1)
	   	 				.addComponent(y7, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
	   	 			.addGap(18)
	   	 			.addGroup(gl_MyPanel1.createParallelGroup(Alignment.BASELINE)
	   	 				.addComponent(x5)
	   	 				.addComponent(y6))
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
	   	 JTextField y32 = new JTextField(10);
		 JLabel y33 = new JLabel("to");
	  	 JTextField y34 = new JTextField(10);
	     final JCheckBox x9 = new JCheckBox("lon");
	   	 JLabel lonfrom = new JLabel("from");
	   	 JTextField TF = new JTextField(10);
		 JLabel lonto = new JLabel("to");
	  	 JTextField TF1 = new JTextField(10);
	   	 final JCheckBox x10 = new JCheckBox("alt");
	   	 JLabel altfrom = new JLabel("from");
	   	 JTextField TF2 = new JTextField(10);
		 JLabel altto = new JLabel("to");
	  	 JTextField TF3 = new JTextField(10);
	   	 
	    
	   	 f.getContentPane().add( MyPanel2, BorderLayout.CENTER);
	   	 
	   	 textField = new JTextField(10);
	   	 
	   	 JLabel label = new JLabel("to");
	   	 
	   	 textField_1 = new JTextField(10);
	   	 
	   	 textField_2 = new JTextField(10);
	   	 
	   	 textField_3 = new JTextField(10);
	   	 
	   	 textField_4 = new JTextField(10);
	   	 
	   	 JLabel label_1 = new JLabel("to");
	   	 
	   	 textField_5 = new JTextField(10);
	   	 
	   	 JLabel label_2 = new JLabel("from");
	   	 
	   	 JLabel label_3 = new JLabel("to");
	   	 
	   	 textField_6 = new JTextField(10);
	   	 
	   	 textField_7 = new JTextField(10);
	   	 
	   	 textField_8 = new JTextField(10);
	   	 
	   	 textField_9 = new JTextField(10);
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
	   	 								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addGap(18)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 								.addComponent(y33, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
	   	 								.addComponent(label, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
	   	 							.addPreferredGap(ComponentPlacement.RELATED)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 								.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))))
	   	 					.addGap(145)
	   	 					.addGroup(gl_MyPanel2.createParallelGroup(Alignment.TRAILING)
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addComponent(SP2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 							.addComponent(SP3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 							.addComponent(SP4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
	   	 						.addComponent(TF3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addComponent(altfrom, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	   	 							.addPreferredGap(ComponentPlacement.RELATED)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.TRAILING)
	   	 								.addComponent(TF, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 								.addComponent(TF2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
	   	 							.addGap(18)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.TRAILING)
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 										.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 											.addGap(38)
	   	 											.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 												.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 													.addComponent(textField, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 													.addGap(10)
	   	 													.addComponent(y10, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
	   	 												.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 												.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 													.addGap(9)
	   	 													.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))))
	   	 										.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 											.addComponent(altto)
	   	 											.addGap(30)
	   	 											.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
	   	 									.addGap(122))
	   	 								.addComponent(lonto, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
	   	 							.addGap(244)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.TRAILING)
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addComponent(y27, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	   	 									.addGap(162))
	   	 								.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 									.addComponent(y34, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
	   	 									.addComponent(TF1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))))))
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
	   	 					.addGap(175)
	   	 					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
	   	 					.addGap(25))
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
	   	 										.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addGap(9)
	   	 									.addComponent(y27)
	   	 									.addGap(30)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
	   	 										.addComponent(y34, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
	   	 								.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 									.addGap(7)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.BASELINE)
	   	 										.addComponent(y31, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
	   	 										.addComponent(y32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 										.addComponent(y33, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
	   	 										.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	   	 									.addGap(6)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 										.addComponent(x9, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
	   	 										.addGroup(gl_MyPanel2.createParallelGroup(Alignment.BASELINE)
	   	 											.addComponent(lonfrom, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(label_1)
	   	 											.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	   	 									.addPreferredGap(ComponentPlacement.RELATED)
	   	 									.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING, false)
	   	 										.addGroup(gl_MyPanel2.createParallelGroup(Alignment.BASELINE)
	   	 											.addComponent(label_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	   	 											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	   	 											.addComponent(label_3)
	   	 											.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	   	 										.addComponent(x10, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
	   	 									.addGap(21))))
	   	 						.addGroup(gl_MyPanel2.createSequentialGroup()
	   	 							.addGap(42)
	   	 							.addGroup(gl_MyPanel2.createParallelGroup(Alignment.BASELINE)
	   	 								.addComponent(y10, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))))
	   	 					.addPreferredGap(ComponentPlacement.RELATED)
	   	 					.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
	   	 						.addComponent(TF, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
	   	 						.addComponent(TF1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 						.addComponent(lonto, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
	   	 					.addPreferredGap(ComponentPlacement.RELATED)
	   	 					.addGroup(gl_MyPanel2.createParallelGroup(Alignment.LEADING)
	   	 						.addComponent(TF3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 						.addComponent(altfrom, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 						.addComponent(altto, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
	   	 						.addComponent(TF2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
	   	 					.addGap(0))))
	   	 );
	   	 MyPanel2.setLayout(gl_MyPanel2);
	   //    f.getContentPane().add(MyPanel2, "Center");  // Paste MyPanel2 to Center     
	    
	   
	      
	      JPanel MyPanel3 = new JPanel();
	      MyPanel3.setBackground(Color.LIGHT_GRAY);
	     
	    	 JLabel y11 = new JLabel("Algo1:");
	    	 y11.setFont(new Font("Tahoma", Font.BOLD, 13));
	    	 JLabel y12 = new JLabel("    ");
	    	 JLabel y15 = new JLabel("mac");
	    	
	    	 JButton y17 = new JButton("go");
	    	 y17.setFont(new Font("Tahoma", Font.BOLD, 11));
	    	 y17.setBackground(new Color(102, 102, 102));
	   
	    	 JLabel y18 = new JLabel("Algo2");
	    	 y18.setFont(new Font("Tahoma", Font.BOLD, 13));
	    	 JLabel y22 = new JLabel("scan");
	    	
	    	 JButton y24 = new JButton("go");
	    	 y24.setFont(new Font("Tahoma", Font.BOLD, 11));
	    	 y24.setBackground(Color.GRAY);
	    	
	    	  	
	     
	    	 f.getContentPane().add( MyPanel3, "South");
	    	 
	    	 textField_10 = new JTextField();
	    	 textField_10.setColumns(10);
	    	 
	    	 textField_11 = new JTextField();
	    	 textField_11.setColumns(10);
	    	 GroupLayout gl_MyPanel3 = new GroupLayout(MyPanel3);
	    	 gl_MyPanel3.setHorizontalGroup(
	    	 	gl_MyPanel3.createParallelGroup(Alignment.LEADING)
	    	 		.addGroup(gl_MyPanel3.createSequentialGroup()
	    	 			.addContainerGap()
	    	 			.addGroup(gl_MyPanel3.createParallelGroup(Alignment.LEADING, false)
	    	 				.addGroup(gl_MyPanel3.createSequentialGroup()
	    	 					.addComponent(y11, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
	    	 					.addPreferredGap(ComponentPlacement.RELATED)
	    	 					.addComponent(y15, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
	    	 					.addPreferredGap(ComponentPlacement.UNRELATED)
	    	 					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
	    	 					.addGap(18)
	    	 					.addComponent(y17))
	    	 				.addGroup(gl_MyPanel3.createSequentialGroup()
	    	 					.addComponent(y18, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
	    	 					.addPreferredGap(ComponentPlacement.RELATED)
	    	 					.addComponent(y22, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
	    	 					.addPreferredGap(ComponentPlacement.RELATED)
	    	 					.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
	    	 					.addGap(18)
	    	 					.addComponent(y24, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	    	 			.addGap(779)
	    	 			.addComponent(y12, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
	    	 );
	    	 gl_MyPanel3.setVerticalGroup(
	    	 	gl_MyPanel3.createParallelGroup(Alignment.LEADING)
	    	 		.addGroup(gl_MyPanel3.createSequentialGroup()
	    	 			.addContainerGap()
	    	 			.addGroup(gl_MyPanel3.createParallelGroup(Alignment.LEADING)
	    	 				.addGroup(gl_MyPanel3.createParallelGroup(Alignment.BASELINE)
	    	 					.addComponent(y11, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    	 					.addComponent(y15, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    	 					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
	    	 					.addComponent(y17, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
	    	 				.addComponent(y12, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
	    	 			.addGap(24)
	    	 			.addGroup(gl_MyPanel3.createParallelGroup(Alignment.BASELINE)
	    	 				.addComponent(y18, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
	    	 				.addComponent(y22, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
	    	 				.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
	    	 				.addComponent(y24, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
	    	 			.addContainerGap(70, Short.MAX_VALUE))
	    	 );
	    	 MyPanel3.setLayout(gl_MyPanel3);
	     
	    	 f.setSize(641, 585);
	    	 f.setVisible(true);
	    	 
	    	 x5.addActionListener(new ActionListener()
	    	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			 System.out.println("SAVE AS CSV");
	         	 }
	    	 });
	    	 
	    	 y6.addActionListener(new ActionListener()
	    	 {
	    		 public void actionPerformed(ActionEvent evt)
	    		 {
	    			 System.out.println("save as kml");
	         	 }
	    	 });
	    	 x7.addItemListener(new ItemListener() { //time filter
	    	      public void itemStateChanged(ItemEvent e) {
	    	    	  if(x7.isSelected())
	    	    	  {
	    	    		  System.out.println("true");
	    	    	  }
	    	       
	    	      }
	    	    });
	    	 
	    	 x8.addItemListener(new ItemListener() { //lat filter
	    	      public void itemStateChanged(ItemEvent e) {
	    	    	  if(x8.isSelected())
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
	    	 
	    	 

	    	 
	    	 
	      }
	}
