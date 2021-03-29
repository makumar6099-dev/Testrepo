
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1;//a1 is an integer array
		int []a2;
		int a3[];
		
		
		int[][] arr1;//arr1 is an integer array of arrays
		int [][]arr2;
		int arr3[][];
		int[] []arr4;
		int[] arr5[];
		int []arr6[];
		
		
		int[] t1[],t2,t3[];
		int[]t4,t5[];
		int[]t6[];
		
		int[] arr=new int[3];
		double[] ar1=new double[4];
		System.out.println(ar1);
		
			byte b=127;
			short s=10;
		int[] arr10=new int[10];
		double[] char1=new double[10];
		
		
		System.out.println(char1[0]);
		
		int x=400;
		
		int[] v1=new int[5];
		v1[0]=10;
		v1[1]=20;
		v1[2]=30;
		v1[3]=40;
		v1[4]=x;
		char[] ch1=new char[10];
		char[] ch2=ch1;
		
		int[] v2=v1;
		System.out.println(v1[0]);
		int[] arr20=new int[] {10,20,30,40,50};
		int[] arr21= {20,30,40,50};
		
		
		sum(new int[] {10,20,30});
		
		
		
	}
	public static void sum(int[] arr)
	{
		System.out.println(arr[2]);
	}

}
