import java.util.ArrayList;
import java.util.Random;

public class Computer {
	private ArrayList<Integer> solution;
	public ArrayList<String> colors;
	private Random r;
	private int numberOfColors;
	public int solutionSize;
	private ArrayList<ArrayList<Integer>> userSolutions;
	Computer()	{
		colors = new ArrayList<>();
		solution = new ArrayList<>();
		userSolutions = new ArrayList<>();
		r = new Random();
		colors.add("RED");
		colors.add("BLUE");
		colors.add("GREEN");
		colors.add("YELLOW");
		solutionSize = 4;
		numberOfColors = colors.size();
		for(int i=0; i<solutionSize; i++){
			solution.add(r.nextInt(numberOfColors));
		}
	}
	boolean isCorrectSolution(ArrayList<Integer> userSolution){
		//System.out.print(userSolution + "    " + solution);
		return userSolution.toString().equals(solution.toString());
	}
	ArrayList<Integer> getUserSolution(String userInput)	{
		ArrayList<Integer> userSolution = new ArrayList<Integer>();
		for(String s: userInput.toUpperCase().split(" ")){
			userSolution.add(colors.indexOf(s));
		}
		userSolutions.add(userSolution);
		return userSolution;
	}
	void printSolution(){
		for(int i:solution)	{
			System.out.print(colors.get(i) + "\t");
		}
	}
	int numberOfWhite(ArrayList<Integer> userSolution){
		int whites = 0;
		boolean [] checked = new boolean[this.solutionSize];
		for(int soln: userSolution){
			for(int i=0; i<this.solutionSize; i++)	{
				if(!checked[i] && soln == solution.get(i)){
					whites++;
					checked[i] = true;
					break;
				}
			}
		}
		return whites;
	}
	int numberOfBlack(ArrayList<Integer> userSolution){
		int blacks = 0;
		for(int i=0; i<this.solutionSize; i++)	{
			if(userSolution.get(i) == solution.get(i))
				blacks++;
		}
		return blacks;
	}
	void printUserSolutions(){		//not really using this function
		for(ArrayList<Integer> solutions: userSolutions){
			for(int i: solutions){
				System.out.print(colors.get(i) + "\t");
			}
			System.out.println();
		}
	}
}
