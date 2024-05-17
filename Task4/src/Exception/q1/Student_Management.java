package Exception;
public class Student_Management {

	public static void main(String[] args) {
		try {
            // Creating a student object with valid parameters
            Student student1 = new Student(1, "John Doe", 18, "Computer Science");
            System.out.println("Student created: " + student1.getName());

            // Creating a student object with invalid age
            Student student2 = new Student(2, "Jane Smith", 22, "Electrical Engineering");
            System.out.println("Student created: " + student2.getName());
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Error occurring student: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Error occurring student: " + e.getMessage());
        }

	}

}

/* Output
 * Error occurring student: Name should not contain numbers or special symbols.
*/
