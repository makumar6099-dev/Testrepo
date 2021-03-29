import java.io.IOException;

public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validate(13);
		System.out.println("rest of code here...");
	}
	
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible to vote");
		}
		else
			System.out.println("Eligible to vote..");
	}

}
