package studentPackage;

public class Subject {
	int subjectCredits;
	String subjectName;
	String subjectCode;
	double subjectGrade;
	int semester;
	Subject(String SN, int SC, String SCD, int sem)	{
		subjectName = SN;
		subjectCredits = SC;
		subjectCode = SCD;
		subjectGrade = 0;
		semester = sem;
	}
}
