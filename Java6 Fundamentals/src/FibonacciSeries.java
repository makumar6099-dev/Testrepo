
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<10;i++)//0, 1 ,2 ,3 ,4 ,5, 6 ,7, 8,9
		{
			c=a+b; //1+1==>2
			if(c>10)
			{
			 break;
			}
			else
			{
				System.out.println(c+" ");
				
				a=b;//1
				b=c;//2
			}
		}
		
		
	}

}
