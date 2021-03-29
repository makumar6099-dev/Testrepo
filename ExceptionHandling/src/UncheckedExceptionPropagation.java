
public class UncheckedExceptionPropagation {
	
	
	void m()
	{
		int i=50/0;
	}
	
	void n()
	{
		m();
	}
	
	void p()
	{
		try
		{
			n();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside AE exception..");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UncheckedExceptionPropagation u = new UncheckedExceptionPropagation();
		u.p();
		System.out.println("Normal flow....");
	}

}
