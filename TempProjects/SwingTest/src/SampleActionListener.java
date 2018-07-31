import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SampleActionListener extends JPanel implements ActionListener{
	
	JLabel lblbtn,lblAction;
	JButton btn1,btn2;
	static int actionCount = 0;
	SampleActionListener()	{
		lblbtn = new JLabel("");
		lblAction = new JLabel("Action : " + actionCount);
		btn1 = new JButton("Add text");
		btn2 = new JButton("Clear Text");
		btn2.addActionListener(this);
		btn1.addActionListener(this);
		setLayout(new GridLayout(0,2));
		add(lblAction);
		add(lblbtn);
		add(btn1);
		add(btn2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jfm = new JFrame("Sample Action Listener");
		jfm.setSize(400, 400);
		jfm.setContentPane(new SampleActionListener());
		jfm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		actionCount++;
		lblAction.setText("Action : " + actionCount);
		if(e.getSource() == btn1 )	{
			lblbtn.setText("Button 1 pressed");
		}
		else if(e.getSource() == btn2)	{
			lblbtn.setText("");
		}
	}

}
