package Mastery;

public class GradeBook {
	private int[][] grades;
	
	//Constructor method
	public GradeBook(int numStudents, int numGrades) 
	{
		grades = new int[numStudents][numGrades];
	}
	
	//Access method
	public void getGrades() 
	{
		//test number labels
		for(int i=0; i < grades[0].length; i++)
		{
			System.out.println(i + 1);
		}
		System.out.println();
		
		//Display student numbers and grades
		for(int stu=0; stu < grades.length; stu++)
		{
			System.out.println( stu + 1);
			for(int grd=0; grd < grades[0].length; grd++)
			{
				System.out.println( grades[stu][grd]);
			}
		}
		System.out.println();
		
	}
	
	/*
	//Modifier method
	public void setGrades(int test,int score) {
		grades = new int[test][score];
	}
	
	//Inputs grade data
	public int[][] getGrades(int input[][]) {
		int[][] grades = ;
		
	}
	*/
	
	
	
	//Student average
	public double stuAvg(int stu)
	{
		int sum = 0;
		double avg = 0;
		for(int grd=0; grd < grades[0].length; grd++)
		{
			sum += grades[stu -1][grd];
		}
		avg = (double)sum / grades[0].length;
		
		return avg;
		
		
	}
	
	//Test average
	public double testAvg(int grd)
	{
		int sum = 0; 
		double avg = 0;;
		for (int stu = 0; stu < grades.length; stu++) {
			sum += grades[stu][grd -1];
		}
		avg = (double)sum / grades.length;
		
		return avg;
	}
	
	
}
