package studentPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterStudent implements Student{

	String studentName;
	String studentBranch;
	static Scanner inp = new Scanner(System.in);
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	ArrayList<Integer> totalCreditsRegistered = new ArrayList<Integer>();
	int totalSemestersRegistered;
	RegisterStudent()	{
		studentName = "";
		studentBranch = "";
		totalSemestersRegistered = 0;
	}
	@Override
	public void getStudentName() {
		// TODO Auto-generated method stub
		System.out.print("Enter Student Name: ");
		studentName = inp.next();
	}

	@Override
	public void getStudentBranch() {
		// TODO Auto-generated method stub
		while(true)	{
			System.out.print("Enter Student's branch: ");
			String temp = inp.next();
			if(temp == "CSE" || temp == "ISE" || temp == "EC" || temp == "EEE" || temp == "ME")	{
				studentBranch = temp;
				return;
			}
			System.out.println("Invalid Branch!");
		}
	}
	void registration()	{
		getStudentName();
		getStudentBranch();
		int tempSem;
		while(true)	{
			System.out.println("Enter Semester : ");
			tempSem = inp.nextInt();
			totalSemestersRegistered++;
			totalCreditsRegistered.add(tempSem, 0);
			System.out.println("Enter Details of subjects of semester: " + tempSem);
			String tempSubName,tempSubCode;
			int tempSubCredit;
			try	{
				while(true)	{
					System.out.print("Enter Subject code: ");
					tempSubCode = inp.next();
					System.out.print("Enter Name of " + tempSubCode +": ");
					tempSubName = inp.next();
					System.out.print("Enter Credits for " +tempSubName+ ": ");
					tempSubCredit = inp.nextInt();
					if(totalCreditsRegistered.get(tempSem) + tempSubCredit > 30){
						throw new CreditLimit(""+ totalCreditsRegistered.get(tempSem) + tempSubCredit );
					}
					totalCreditsRegistered.set(tempSem,totalCreditsRegistered.get(tempSem) + tempSubCredit) ;
					subjectList.add(new Subject(tempSubName,tempSubCredit,tempSubCode,tempSem));
					System.out.println("Enter 1 to insert another subject 0 to end semester");
					if(!inp.nextBoolean())	{
						break;
					}
				}
			}catch(CreditLimit e)	{
				System.out.println("Credit limit exceeded ("+e+")");
			}finally	{
				System.out.println("Total Credits Registered: " + totalCreditsRegistered);
				System.out.println("Enter 1 to insert another semester 0 to finish");
				if(!inp.nextBoolean())	{
					break;
				}
			}
		}
		System.out.println("Successfully Registered for " + totalSemestersRegistered );	
	}
}

class CreditLimit extends Exception
{
	CreditLimit(String s)	{
		super(s);
	}
	
}
