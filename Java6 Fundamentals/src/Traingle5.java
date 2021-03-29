
public class Traingle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=6;
    for(int i=1;i<=n;i++)
    {
    	for(int j=1;j<=i;j++)
    	{
    		System.out.print(j+" ");
    	}
    	
    	//2 nd inner loop spaces
    	for(int sp1=1;sp1<=(n-i);sp1++)
    	{
    		System.out.print("  ");
    	}
    	//3rd inner loop spaces
    	for(int sp2=((n-i)-1);sp2>=1;sp2--)//sp=5 --> 1
    	{
    		System.out.print("  ");
    	}
    	for(int k=i;k>=1;k--)
		{
    		if(k==n)
    		{
    			continue;
    		}
			System.out.print(" "+k);
		}
    	
    	
    	
    	
    	System.out.println();
    	
    }
	}

}
