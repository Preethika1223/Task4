package Exception;

public class Student {

	 private int rollNo;
	    private String name;
	    private int age;
	    private String course;

	    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
	        this.rollNo = rollNo;
	        if (age < 15 || age > 21) {
	            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
	        }
	        this.age = age;
	        if (!name.matches("[a-zA-Z]+")) {
	            throw new NameNotValidException("Name should not contain numbers or special symbols.");
	        }
	        this.name = name;
	        this.course = course;
	    }

	    public int getRollNo() {
	        return rollNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getCourse() {
	        return course;
	    }

}
