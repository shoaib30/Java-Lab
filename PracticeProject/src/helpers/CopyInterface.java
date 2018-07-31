package helpers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class CopyInterface extends JPanel{
	JTextField tf1,tf2;
	JLabel lb1,lb2;
	JButton btncopy,btnback;
	JProgressBar pb;
	FileIOHelper fi;
	CopyInterface()	{
		setLayout();
		setActions();
	}
	void setLayout()	{
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		lb1= new JLabel("InputFile:");
		lb2 = new JLabel("OutputFile:");
		btncopy = new JButton("Copy");
		btnback = new JButton("Bacl");
		pb = new JProgressBar();
		add(lb1);add(tf1);
		add(lb2);add(tf2);
		add(pb);add(btncopy);
		add(btnback);
	}
	void setActions()	{
		btncopy.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String in = tf1.getText();
				String out = tf2.getText();
				fi = new FileIOHelper(in,out,pb);
				Runnable runner = new Runnable()	{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						
						try {
							fi.copyFile();
							fi.ReadOutput();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				};
				Thread t = new Thread(runner,"CopyThread");
				t.start();
			}
			
		});
		btnback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MainFrame.setDefault();
			}
			
		});
	}

}
