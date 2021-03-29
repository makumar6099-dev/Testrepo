
public class CommandLineArgs {

	int x=10;
	
	{
		System.out.println("Hi");
	}
	int add(int i, int j)
	{
		return 1;
	}
	public static void main(String[] args) {
		
		
		
		CommandLineArgs c1= new CommandLineArgs();
		c1.x=20;
		System.out.println(c1.x);///20
		
		CommandLineArgs c2= new CommandLineArgs();
		System.out.println(c2.x);//10
		
		CommandLineArgs c3= new CommandLineArgs();
		c3.x=40;
		System.out.println(c3.x);//40
	}

}
