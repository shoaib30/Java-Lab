package resultPackage;
import studentPackage.RegisterStudent;
import studentPackage.Subject;
public class SubjectGrades extends RegisterStudent{

	SubjectGrades() {
		super();
		registration();
		setSubjectGrades();
		// TODO Auto-generated constructor stub
	}
	void setSubjectGrades()	{
		System.out.println("\n\nEnter Grades of each subject: ");
		System.out.println("\nSubCode\tSubName\tSem\tCredits\tGrade");
		for(Subject S: subjectList)	{
			System.out.print(S.subjectCode + "\t" + S.subjectName + "\t" +S.semester + "\t" + S.subjectCredits + "\t");
			try	{	
				S.subjectGrade = inp.next().charAt(0);
			}catch (NumberFormatException e)	{
				System.out.println("Invalid Number Format");
			}
		}
	}
}
