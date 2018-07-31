import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrimeCombo extends JPanel implements ActionListener{
	JLabel lbl1,lbl2;
	JComboBox<Integer> cb1;
	JTextField tfInput;
	JButton btnGenerate;
	PrimeCombo()	{
		lbl1 = new JLabel("Enter N");
		lbl2 = new JLabel("Prime Numbers");
		cb1 = new JComboBox<Integer>();
		tfInput = new JTextField(10);
		btnGenerate = new JButton("Generate");
		
		btnGenerate.addActionListener(this);
		add(lbl1);add(tfInput);
		add(lbl2);add(cb1);
		add(btnGenerate);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		cb1.removeAllItems();
		int n = 0;
		outerLoop:
		for(int i = 2; n < Integer.parseInt(tfInput.getText()) ; i++)	{
			for(int j = 2; j < i ; j++)	{
				if(i%j == 0)
					continue outerLoop;
			}
			n++;
			cb1.addItem(i);
		}
	}
	public static void main(String[]args)	{
		JFrame jfm = new JFrame("PrimeCombo");
		jfm.setSize(200, 200);
		jfm.setContentPane(new PrimeCombo());
		jfm.setVisible(true);
	}
}
