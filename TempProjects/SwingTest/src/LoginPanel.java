import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel{
	JButton btnLogin;
	JLabel lblUser,lblPass;
	JTextField tfUser;
	JPasswordField pass;
	String password;
	LoginPanel(String password)	{
		this.password = password;
		btnLogin = new JButton("Login");
		lblUser = new JLabel("UserName: ");
		lblPass = new JLabel("Password: ");
		tfUser = new JTextField(10);
		pass = new JPasswordField(10);
		setPanelLayout();
		setAction();
	}
	void setPanelLayout()	{
		add(lblUser);
		add(tfUser);
		add(lblPass);
		add(pass);
		add(btnLogin);
	}
	void setAction()	{
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String ps = new String(pass.getPassword());
				if(ps.equals(password))	{
					JOptionPane.showMessageDialog(null,"Successfully Logged in","Logged in",JOptionPane.INFORMATION_MESSAGE);
				}else{
					int res = JOptionPane.showConfirmDialog(null,"Wrong Password, Re-enter?","Error",JOptionPane.YES_NO_CANCEL_OPTION,r u);
					if(res == 0)	{
						tfUser.setText("");
						tfUser.grabFocus();
						pass.setText("");
					}
				}
			}
			
		});
	}
	public static void main(String[]args)	{
		JFrame jfm = new JFrame("Login");
		jfm.setSize(250, 200);
		jfm.setContentPane(new LoginPanel("Hello"));
		jfm.setVisible(true);
	}

}
