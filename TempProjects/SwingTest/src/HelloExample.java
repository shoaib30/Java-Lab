import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloExample {
	public static void main(String[]args)	{
		JFrame jfm = new JFrame("Hello Example");
		Container container = jfm.getContentPane();
		container.add(new JLabel("Hellow World"),JLabel.CENTER);
		jfm.setSize(400, 400);
		jfm.setVisible(true);
		jfm.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	 	        System.exit(0);
	          }        
	       });    
	}

}
