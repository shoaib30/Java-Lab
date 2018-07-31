package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JProgressBar;

public class FileIOHelper {
	File f1,f2;
	JProgressBar pb;
	FileIOHelper(String file1, String file2, JProgressBar p){
		pb = p;
		f1 = new File(file1);
		f2 = new File(file2);
		pb.setMinimum(0);
		pb.setMaximum(100);
		pb.setStringPainted(true);
	}
	void copyFile() throws IOException{
		FileInputStream in = new FileInputStream(f1);
		FileOutputStream out = new FileOutputStream(f2);
		long size = f1.length();
		System.out.println("Total Size: "+size);
		int c;
		int read = 0;
		while((c = in.read()) != -1)	{
			read++;
			double per = read * 100.0 / size;
			pb.setValue((int) per);
			pb.setString((int)per+"/100");
			out.write(c);
			System.out.print((char)c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("\nCopy Complete");
		in.close();
		out.close();
		
	}
	void ReadOutput() throws FileNotFoundException	{
		Scanner in = new Scanner(new FileReader(f2));
		while(in.hasNext())	{
			System.out.print(in.next()+ " ");
		}
		
	}

}
