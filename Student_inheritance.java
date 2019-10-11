/*Develop a Java program to create a class Student whose variables are usn, name and sem.
Derive a class Test from Student to include an array of cie marks of each course and their
corresponding credits in another array. Derive a class Exam from Test which includes an
array of see marks. Derive a class Result which calculates the grade for each course and
the SGPA. Create n student objects and displays all the above details.*/

import java.util.*;
class Student{
	String usn, name;
	int sem;
	Scanner sc = new Scanner(System.in);
	
	void get(){
		
		System.out.println("Enter usn, name and sem");
		usn = sc.next();
		name = sc.next();
		sem = sc.nextInt();
	}
	void display(){
		System.out.println("Usn:"+usn+"\nName:"+name+"\nSemester:"+sem);
	}
}
class Test extends Student{
	float cie_m[] = new float[6];
	int credits[] = new int[6];
	int totalc = 0;
	
	void get(){
		super.get();
		System.out.println("Enter cie marks with the corresponding subject credits");
		for(int i=0;i<6;i++){
			System.out.println("Subject "+(i+1)+" marks: ");
			cie_m[i] = sc.nextFloat();
			System.out.println("Subject "+(i+1)+" credits: ");
			credits[i] = sc.nextInt();
			totalc += credits[i];
		}
	}
	
	void display(){
		super.display();
		for(int i=0;i<6;i++){
			System.out.println("Subject "+(i+1)+" cie marks: "+cie_m[i]);
			System.out.println("Subject "+(i+1)+" credits: "+credits[i]);
		}
	}
}
class Exam extends Test{
	float see[] = new float[6];
	
	void get(){
		super.get();
		System.out.println("Enter see marks");
		for(int i=0;i<6;i++){
			System.out.println("Subject "+(i+1)+" marks: ");
			see[i] = sc.nextFloat();
		}
	}
	
	void display(){
		super.display();
		for(int i=0;i<6;i++){
			System.out.println("Subject "+(i+1)+" see marks: "+see[i]);
		}
	}
}
class Result extends Exam{
	char grade[] = new char[6];
	int gp[] = new int[6];
	double sgpa = 0;
	
	void get(){
		super.get();
	}
	
	void cal_grade(){
		
		for(int i=0;i<6;i++){
		
			float sum = (float)cie_m[i] + (float)(see[i]/2.0);
			
			
			if(sum >= 90){
				grade[i] = 'S';
				gp[i] = 10;
			}
			else if(sum < 90 && sum >= 75){
				grade[i] = 'A';
				gp[i] = 9;
			}
			else if(sum < 75 && sum >= 60){
				grade[i] = 'B';
				gp[i] = 8;
			}
			else if(sum < 60 && sum >= 40){
				grade[i] = 'C';
				gp[i] = 7;
			}
			else{
				grade[i] = 'D';
				gp[i] = 6;
			}
		}
	}
	
	void cal_sgpa(){
		double r = 0.0;
		for(int i=0;i<6;i++){
			r += (float)gp[i] * (float)credits[i];
		}
		
		sgpa = (double)r / (double)totalc;
	}
	
	void display(){
		super.display();
		for(int i=0;i<6;i++){
			System.out.println("grade for subject "+(i+1)+": "+grade[i]);
		}
		
		System.out.println("SGPA : "+sgpa);
	}
}

class main{
	public static void main(String args[]){
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		
		n = sc.nextInt();
		Result ob[] = new Result[n];
		
		for(int i=0;i<n;i++){
			ob[i] = new Result();
			ob[i].get();
			ob[i].cal_grade();
			ob[i].cal_sgpa();
			ob[i].display();
		}
	}
}
			
		
	
		
	
	

