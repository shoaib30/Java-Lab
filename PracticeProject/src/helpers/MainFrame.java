package helpers;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	static CopyInterface cp;
	static Container ct;
	MainFrame(String s)	{
		super(s);
		cp = new CopyInterface();
		ct = getContentPane();
		setSize(300,400);
		setDefault();
		setVisible(true);
	}
	static void setDefault()	{
		ct.removeAll();
		JButton btn =  new JButton("Copy");
		JPanel jp = new JPanel();
		jp.add(btn);
		ct.add(jp);
		ct.repaint();
		ct.revalidate();
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ct.removeAll();
				ct.add(cp);
				ct.repaint();
				ct.revalidate();
			}
			
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame m = new MainFrame("CopyApp");
	}

}
