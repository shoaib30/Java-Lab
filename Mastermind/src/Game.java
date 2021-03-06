import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private ArrayList<Integer> userSolution;
	Computer c;
	static Scanner sc = new Scanner(System.in) ;
	Game()	{
		System.out.println("Initiating new game");
		c = new Computer();
		//c.printSolution();
		System.out.println("\nGame started\n");
		
	}
	void takeInput()	{
		String inp  = sc.nextLine();
		userSolution = c.getUserSolution(inp);
	}
	void printWhiteBlack(){
		if(c.isCorrectSolution(userSolution)){
			System.out.println("Correct Solution");
			c.printSolution();
			System.exit(0);;
		}
		int whites = c.numberOfWhite(userSolution);
		int blacks = c.numberOfBlack(userSolution);
		System.out.println("\t\t\t" + (whites-blacks) +"W  " + blacks + "B");
		//c.printUserSolutions();
	}
	public static void main(String[]args)	{
		Game g = new Game();
		int numberOfTurns = 10;
		for(int i=0; i<numberOfTurns; i++){
			g.takeInput();
			g.printWhiteBlack();
		}
		System.out.println("Game over! Solution:");
		g.c.printSolution();
	}
}
