import java.util.Scanner;

class result{
	int java;
	int php;
	int database;
	int dataStructure;
	int ruby;
	int total;
	double percentage;
	float average;
	char grade;
	
	void insert(int j, int p, int d, int ds, int r) {
		java =j;
		php = p;
		database = d;
		dataStructure = ds;
		ruby = r;
	}
	
	
	void total() {
		total = java+php+database+dataStructure+ruby;
		System.out.println("Total Marks of Each Subjects: " +  total);
	}
	
	void avg() {
		average = (java+php+database+dataStructure+ruby)/5;
		System.out.println("average of total subjects: " + average);
		
	}
	
	void percentage() {
		percentage = ((double)total/500*100);
		System.out.println("percentages of average: " + percentage);
	}
	
	void grade() {
		
		System.out.println("The students grade: ");
		if(percentage>= 80) {
			System.out.println("Grade is A");
		}
		else if(percentage >= 60 && percentage < 80) {
			System.out.println("Grade is B");
		}
		else if(percentage <=40) {
			System.out.println("Grade is C");
		}
		else  {
			System.out.println("You are fail");
		}
	}
}
public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		result res = new result();
		
		int j, p, d, ds, r;
		System.out.println("Enter marks of java: ");
		j = sc.nextInt();
		
		System.out.println("Enter marks of php: ");
		p = sc.nextInt();
		
		System.out.println("Enter marks of database: ");
		d = sc.nextInt();
		
		System.out.println("Enter marks of dataStructure: ");
		ds = sc.nextInt();
		
		System.out.println("Enter marks of ruby: ");
		r = sc.nextInt();
		res.insert(j,p,d,ds,r);
		
		res.total();
		res.avg();
		res.percentage();
		res.grade();
		
	}

}
