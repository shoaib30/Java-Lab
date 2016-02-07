package studentPackage;

public class Subject {
	public int subjectCredits;
	public String subjectName;
	public String subjectCode;
	public char subjectGrade;
	public int semester;
	Subject(String SN, int SC, String SCD, int sem)	{
		subjectName = SN;
		subjectCredits = SC;
		subjectCode = SCD;
		subjectGrade = 'Z';
		semester = sem;
	}
}
