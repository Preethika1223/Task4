package Exception;
public class Management {
	public static void main(String[] args) {
		try {
			Voter v1=new Voter(12,"preethi",14);
			System.out.println(v1.getName());
		}
		catch(InvalidVoterAgeException e) {
			System.err.print(e.getMessage());
				
		}
	}
}
/*output
invalid age for voter*/