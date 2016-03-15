import java.util.Scanner;

public class MainClass {
	public static void main(String[]args)	{
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter Size of stack: ");
		Stack s1 = new Stack(inp.nextInt());
		while(true)	{
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\n");
			switch(inp.nextInt())	{
			case 1:
				System.out.print("Enter Number: ");
				try{
				s1.push(inp.nextInt());
				}catch(OverFlowException e)	{
					System.out.println("Exception: " + e);
				}
				break;
			case 2:
				try{
					System.out.println("Popped: "+ s1.pop());
				}catch(UnderFlowException e)	{
					System.out.println("Exception : " + e);
				}
				break;
			case 3:
				s1.showStack();
				break;
			case 4:
				return;
			default:
					System.out.println("Wrong chocie");
			}
		}
	}
}
