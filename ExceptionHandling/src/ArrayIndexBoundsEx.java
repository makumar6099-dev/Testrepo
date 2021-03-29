
public class ArrayIndexBoundsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[5];
		
		try {
			a[10]=50;//ArrayIndexOUtofBoundsException
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("Inside finally");
		}
		catch(NullPointerException np)
		{
			System.out.println("Inside finally");
		}
		catch(Exception e)
		{
			
		}
		
	}

}
