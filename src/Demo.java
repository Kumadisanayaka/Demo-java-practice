import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	JButton setButton;
	JTextField txtDisplay;
	MyFrame(){
		setSize(300,300);
		setTitle("MyFrame");
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());	
		
		txtDisplay=new JTextField(12);
		txtDisplay.setFont(new Font("",1,25));
		add(txtDisplay);
		
		setButton=new JButton("Set Title");
		setButton.setFont(new Font("",1,25));
		setButton.addActionListener(new SetButtonActionListener());
		add(setButton);
	}
        class SetButtonActionListener implements ActionListener{
	public void actionPerformed(ActionEvent evt){
		String title=txtDisplay.getText();
		setTitle(title);
	}
}
}

class Demo{
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}
