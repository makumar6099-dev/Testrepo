
public class ConsoleExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Text");
		String text=System.console().readLine();
		System.out.println("Text is:"+text);
		
		System.out.println("Enter Password..");
		char[] password=System.console().readPassword();
		String pass=String.valueOf(password);
		System.out.println("Given Password is:"+pass);
	
		
	}

}
