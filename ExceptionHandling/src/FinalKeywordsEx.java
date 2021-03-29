import java.util.ArrayList;

public class FinalKeywordsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// final, finally, finalize()
		
		final int x=10;
		
		final ArrayList<String> list = new ArrayList<String>();
		list.add("20");
		list.remove(0);
		
		
		try
		{
			int y=200;
		}
		catch(Exception e)
		{
			
		}
		finally {
			System.out.println("Finally");
		}

		
		
		FinalKeywordsEx f1= new FinalKeywordsEx();
		FinalKeywordsEx f2= new FinalKeywordsEx();
		
		f1=null;
		f2=null;
		System.gc();
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Finalize called");
	}

}
