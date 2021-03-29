
public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345; //output: 54321
		int original=num;
		
		//1. Divide the number %10 --> remainder-->5,4,3,2,1
		//2. logic
		//3. Get the quotionet /10-->5
		
		int rev=0;
		while(num>0)//12>0 (T)
		{
		  int rem=num%10;//1%10-->1
		  rev=rev*10+rem;//5432*10+1==>54321
		  num=num/10;//1/10==>0
		}
		
		System.out.println("Reverse number:"+rev);
		
		
		//Palindrome --> if you reverse a number/string and the original numners are same then that palidrame
		
		if(original==rev)
		{
			System.out.println("Given number is palindrome");
		}
		else
			System.out.println("Not a palindrome");
		
		
		
	}

}
