package matala0;

  import java.awt.*;
   import javax.swing.*;
    
   public class gui
   { 
      public static void main(String[] args)
      {
   	 JFrame f = new JFrame("wigle"); 
   	 JPanel MyPanel1 = new JPanel();
     MyPanel1.setBackground(Color.PINK);
 
    
   	 MyPanel1.setLayout( new GridLayout(4,4) );
    
   	 JLabel x1 = new JLabel("folder..");
   	 JTextField x2 = new JTextField();
   	JLabel x3 = new JLabel("file..");
  	 JTextField x4 = new JTextField();
   	 JButton x5 = new JButton("save as mergede csv");
   	 JButton y6 = new JButton("save as mergede KML");
   	 JButton y7 = new JButton("Clear data");
    
   	 MyPanel1.add(x1);
   	 MyPanel1.add(x2);
   	 MyPanel1.add(x3);
   	 MyPanel1.add(x4);
   	 MyPanel1.add(x5);
   	 MyPanel1.add(y6);
   	 MyPanel1.add(y7);
    
   	 f.getContentPane().add( MyPanel1, "North");   // Add MyPanel1 to North
    
   	 // -----------------------------------------------------------
   	 // Make another Panel with 5 button
   	 // -----------------------------------------------------------
   	 JPanel MyPanel2 = new JPanel();
   	MyPanel2.setBackground(Color.YELLOW);
    
   	 MyPanel2.setLayout( new GridLayout(6,6)  );
    
   	 JLabel x6 = new JLabel("Filters");
   	 JLabel y10 = new JLabel("    ");
   	 JCheckBox x7 = new JCheckBox("time");
   	 JCheckBox x8 = new JCheckBox("lat");
   	 JCheckBox x9 = new JCheckBox("lon");
   	 JCheckBox x10 = new JCheckBox("alt");
    
   	 MyPanel2.add(x6);
   	 MyPanel2.add(y10);
   	 MyPanel2.add(x7);
   	 MyPanel2.add(x8);
   	 MyPanel2.add(x9);
   	 MyPanel2.add(x10);
    
   	 f.getContentPane().add( MyPanel2, "Center");   // Paste MyPanel2 to South
   //    f.getContentPane().add(MyPanel2, "Center");  // Paste MyPanel2 to Center     
    
   	 f.setSize(400, 300);
   	 f.setVisible(true);

      
      JPanel MyPanel3 = new JPanel();
      MyPanel3.setBackground(Color.RED);
      
    	 MyPanel3.setLayout(new GridLayout(2,4) );
     
    	 JLabel y11 = new JLabel("Algo1");
    	 JLabel y12 = new JLabel("    ");
    	 JLabel y13 = new JLabel("    ");
    	 JLabel y14 = new JLabel("    ");
    	 JLabel y15 = new JLabel("mac");
    	 JTextField y16 = new JTextField();
    	 JButton y17 = new JButton("go");
    	 JLabel y18 = new JLabel("Algo2");
    	 JLabel y19 = new JLabel("    ");
    	 JLabel y20 = new JLabel("    ");
    	 JLabel y21 = new JLabel("    ");
    	 JLabel y22 = new JLabel("scan");
    	 JTextField y23 = new JTextField(20);
    	 JButton y24 = new JButton("go");
     
    	 MyPanel3.add(y11);
    	 MyPanel3.add(y12);
    	 MyPanel3.add(y13);
    	 MyPanel3.add(y14);
    	 MyPanel3.add(y15);
    	 MyPanel3.add(y16);
    	 MyPanel3.add(y17);
    	 MyPanel3.add(y18);
    	 MyPanel3.add(y19);
    	 MyPanel3.add(y20);
    	 MyPanel3.add(y21);
    	 MyPanel3.add(y22);
    	 MyPanel3.add(y23);
    	 MyPanel3.add(y24);
     	
    	
     
    	 f.getContentPane().add( MyPanel3, "South");   // Paste MyPanel2 to South
     
    	 f.setSize(600, 500);
    	 f.setVisible(true);
       }
   }
 