package resultPackage;

import studentPackage.Subject;

public class DisplayGrade extends GradeCalculation{
	
	DisplayGrade()	{
		super();
		calculateSGPA();
		calculateCGPA();
	}
	void showMarksCard()	{
		System.out.println("\nSubCode\tSubName\tSem\tCredits\tGrade");
		for(Subject S: subjectList)	
				System.out.print(S.subjectCode + "\t" + S.subjectName + "\t" +S.semester + "\t" + S.subjectCredits + "\t" + S.subjectGrade);			
	}
	void showGrade()	{
		System.out.println("\n\nSGPA of each semester:- ");
		for(int i = 0; i < 8; i++){
			if(SGPA.get(i) != 0)
				System.out.println("Semester: " + (i+1) + " : " + SGPA.get(i));
		}
		System.out.println("\nCGPA : " + CGPA);
	}
	public static void main(String args[])
	{
		DisplayGrade student1 = new DisplayGrade();
		student1.showGrade();
		student1.showGrade();
	}
}
