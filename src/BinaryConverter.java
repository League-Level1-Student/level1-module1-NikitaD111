import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener  {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	JTextField answer = new JTextField(20);
	
public static void main(String[] args) {
	new BinaryConverter().binary();
	
}
void binary() {
	
	frame.setVisible(true);
	frame.setSize(612, 112);
	button.setText("convert");
 	button.addMouseListener(this);
	panel.add(answer);
	panel.add(button);
	panel.add(label);
	frame.add(panel);
	frame.pack();
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

 }



@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	String variable;
	String character;
variable = answer.getText();
character = convert(variable);
System.out.println(variable);
System.out.println(character);
   }
String convert(String input) {
          if(input.length() != 8){
               JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
               return "-";
          }
          String binary = "[0-1]+";    //must contain numbers in the given range
          if (!input.matches(binary)) {
               JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
               return "-";
          }
          try {
               int asciiValue = Integer.parseInt(input, 2);
               char theLetter = (char) asciiValue;
               return "" + theLetter;
          } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
               return "-";
          }
}


@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



}
