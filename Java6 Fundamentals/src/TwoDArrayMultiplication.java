
public class TwoDArrayMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2}, {2,1}};
		int[][] b= {{1,3},{3,1}};
		
		int[][] c=new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)//j=1
			{
				c[i][j]=0;//i=0,j=1  c[0][1]=0
				for(int k=0;k<2;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];//     c[0][0]=7,c[0][1]=0
					
				}
			}
		}
		
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
