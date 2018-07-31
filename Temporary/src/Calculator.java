import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<JButton> btnNumber;
	JLabel lblEqn;
	JTextField tbInputBox;
	JButton btnResult,btnAdd,btnSubtract,btnClear,btnMul,btnDiv;
	float num1,num2,result;
	int prevSign = 0;
	
	Calculator()	{
		tbInputBox = new JTextField(25);
		lblEqn = new JLabel("");
		btnResult = new JButton("=");
		btnAdd = new JButton("+");
		btnSubtract = new JButton("-");
		btnMul = new JButton("*");
		btnDiv = new JButton("/");
		btnClear = new JButton("CE");
		btnNumber = new ArrayList<>();
		num1=0; num2=0; result=0;
		setPanelLayout();
		setActions();
	}
	private void setPanelLayout() {
		// TODO Auto-generated method stub
		add(lblEqn);
		add(tbInputBox);
		add(btnAdd);
		add(btnSubtract);
		add(btnMul);
		add(btnDiv);
		add(btnResult);
		add(btnClear);
		for(int i = 0; i < 10; i++)	{
			btnNumber.add(new JButton(String.valueOf(i)));;
			add(btnNumber.get(i));
			btnNumber.get(i).addActionListener(this);
			btnNumber.get(i).setMnemonic((char) i);
		}
	}
	void setActions()	{
		btnAdd.addActionListener(new ActionListener()	{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(prevSign == 1)
					result += Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 2)
					result -= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 3)
					result *= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 4)
					result /= Float.parseFloat(tbInputBox.getText());
				else
					result = Float.parseFloat(tbInputBox.getText());
				prevSign = 1;
				lblEqn.setText( lblEqn.getText() + tbInputBox.getText() + "+");
				tbInputBox.setText("");
			}
			
		});
		btnSubtract.addActionListener(new ActionListener()	{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(prevSign == 1)
					result += Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 2)
					result -= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 3)
					result *= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 4)
					result /= Float.parseFloat(tbInputBox.getText());
				else
					result = Float.parseFloat(tbInputBox.getText());
				prevSign = 2;
				lblEqn.setText( lblEqn.getText() + tbInputBox.getText() + "-");
				tbInputBox.setText("");
			}
		});
		btnMul.addActionListener(new ActionListener()	{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(prevSign == 1)
					result += Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 2)
					result -= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 3)
					result *= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 4)
					result /= Float.parseFloat(tbInputBox.getText());
				else
					result = Float.parseFloat(tbInputBox.getText());
				prevSign = 3;
				lblEqn.setText( lblEqn.getText() + tbInputBox.getText() + "*");
				tbInputBox.setText("");
			}
		});
		btnDiv.addActionListener(new ActionListener()	{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(prevSign == 1)
					result += Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 2)
					result -= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 3)
					result *= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 4)
					result /= Float.parseFloat(tbInputBox.getText());
				else
					result = Float.parseFloat(tbInputBox.getText());
				prevSign = 4;
				lblEqn.setText( lblEqn.getText() + tbInputBox.getText() + "/");
				tbInputBox.setText("");
			}
		});
		btnResult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(prevSign == 1)
					result += Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 2)
					result -= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 3)
					result *= Float.parseFloat(tbInputBox.getText());
				else if(prevSign == 4)
					result /= Float.parseFloat(tbInputBox.getText());
				else
					result = Float.parseFloat(tbInputBox.getText());
				lblEqn.setText( lblEqn.getText() + tbInputBox.getText() + "=");
				prevSign = 0;
				tbInputBox.setText(String.valueOf(result));
			}
		});
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tbInputBox.setText("");
				lblEqn.setText("");
				prevSign = 0;
				result = 0;
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++)	{
			if(e.getSource() == btnNumber.get(i))	{
				tbInputBox.setText(tbInputBox.getText() + String.valueOf(i));
			}
		}
	}
	public static void main(String[]args)	{
		JFrame jfm = new JFrame("Calculator");
		jfm.setSize(300, 150);
		jfm.setContentPane(new Calculator());
		jfm.setVisible(true);
	}
}