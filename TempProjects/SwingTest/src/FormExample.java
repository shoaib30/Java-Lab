import javax.swing.JButton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormExample extends JPanel{
	JPanel pnlControls;
	JButton btnAdd;
	JLabel lblName;
	JTextField txtfName;
	JLabel lblUSN;
	JTextField txtfUSN;
	HashMap<JLabel,JLabel> studentList = new HashMap<>();
	JPanel details;
	FormExample()	{
		setElements();
		setActions();
	}
	void setElements()	{
		pnlControls = new JPanel();
		details = new JPanel();
		btnAdd = new JButton("Add Student");
		lblName = new JLabel("Name");
		txtfName = new JTextField();
		lblUSN = new JLabel("USN");
		txtfUSN = new JTextField("1MS");
		pnlControls.setLayout(new GridLayout(0,2));
		details.setLayout(new GridLayout(0,2));
		pnlControls.add(lblName);
		pnlControls.add(txtfName);
		pnlControls.add(lblUSN);
		pnlControls.add(txtfUSN);
		pnlControls.add(btnAdd);
		details.add(new JLabel("Name"));
		details.add(new JLabel("USN"));
		add(pnlControls);
		add(details);
		
	}
	void setActions()	{
		btnAdd.addActionListener(new ActionListener()	{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Name:" + txtfName.getText() + " USN: "+ txtfUSN.getText());
				details.add(new JLabel(txtfName.getText()));
				details.add(new JLabel(txtfUSN.getText()));
				txtfName.setText("");
				txtfUSN.setText("");
				revalidate();
			}
			
		});
	}
	public static void main(String[]args)	{
		JFrame jfm = new JFrame("Form");
		jfm.setContentPane(new FormExample());
		jfm.setSize(500,800);
		jfm.setVisible(true);
	}

}
