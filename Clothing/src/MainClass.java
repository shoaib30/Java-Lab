import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		double tempSize;
		char tempGender;
		
		//Creating formal shirt object
		System.out.println("Formal Shirt:-");
		System.out.println("Enter Size & gender: ");
		tempSize = inp.nextDouble();
		tempGender = inp.next().charAt(0);
		FormalShirt FS = new FormalShirt(tempSize, tempGender);
		FS.getColor();
		FS.putColor();
		FS.putGender();
		FS.putSize();
		
		//Creating pull over object
		System.out.println("\n\nPull Over:- ");
		System.out.println("Enter Size: ");
		tempSize = inp.nextDouble();
		PullOver PO = new PullOver(tempSize);
		PO.getColor();
		PO.putColor();
		PO.putSize();
		PO.putGender();
		
		//Creating party wear object
		System.out.println("\n\nPart Wear:- ");
		System.out.println("Enter Size & gender: ");
		tempSize = inp.nextDouble();
		tempGender = inp.next().charAt(0);
		PartyWear PW = new PartyWear(tempSize,tempGender);
		PW.getColor();
		PW.putColor();
		PW.putSize();
		PW.putGender();
		
		inp.close(); //Closing Scanner
	}

}
