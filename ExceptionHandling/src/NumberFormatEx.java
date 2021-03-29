
public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		String s="abc";
		int i=Integer.parseInt(s);//NumberFormatException
		}
		catch(NumberFormatException nf)
		{
			//System.out.println("NumberFomatExcception");
			
			System.out.println(nf.getMessage());
			
			System.out.println(nf.getCause());
			
			System.out.println(nf.getStackTrace());
			nf.printStackTrace();
		}
		
		try
		{
			
		}
		finally {
			
		}
		
	}

}
