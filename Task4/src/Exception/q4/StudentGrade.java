package Collections;
import java.util.*;
public class StudentGrade {
	private Map<String,Integer> Studentgrade;
	public StudentGrade() {
		Studentgrade=new HashMap<>();
	}
	
	public static void main(String args[]) {
		StudentGrade g=new StudentGrade();
		g.addstudent("alice",10);
		g.addstudent("ram", 12);
		g.addstudent("Saji", 32);
		
		g.removestudent("alice");
		g.displayGrade("ram");
		g.displayGrade("alice");
		g.displayGrade("Saji");
		
	}

	private void displayGrade(String name) {
		Integer grade=Studentgrade.get(name);
		if(grade!=null) {
			System.out.println("Grade of " + name+ " is "+ grade);
		}
		else {
			System.out.println("Student " + name+ " not found");
		}
		
		
	}

	private void removestudent(String name) {
		if(Studentgrade.containsKey(name)) {
			Studentgrade.remove(name);
			System.out.println("Removed Student :" + name);
		}
		else {
			System.out.println("Student " + name+ " not found");
		}	
	}

	private void addstudent(String name, int Grade) {
		Studentgrade.put(name,Grade);
		System.out.println("Added student "+ name +" with grade "+Grade );
		
	}
}
/*Added student alice with grade 10
Added student ram with grade 12
Added student Saji with grade 32
Removed Student :alice
Grade of ram is 12
Student alice not found
Grade of Saji is 32
*/
