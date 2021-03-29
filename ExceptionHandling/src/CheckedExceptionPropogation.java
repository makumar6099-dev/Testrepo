import java.io.IOException;

public class CheckedExceptionPropogation {

	void m() throws IOException,Exception
	{
		throw new java.io.IOException("Device error");
	}
	
	
	void n() throws IOException, Exception
	{
		m();
	}
	void p()
	{
		try {
			n();
		}
		catch(Exception e)
		{
			System.out.println("Inside Exception");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedExceptionPropogation c = new CheckedExceptionPropogation();
		c.p();
		System.out.println("Normal flow");
	}

}
