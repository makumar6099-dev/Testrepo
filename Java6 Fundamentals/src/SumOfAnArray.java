
public class SumOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={20,10,30,40,50,10,30};
		//		  arr[0], arr[1], arr[2]......arr[6]
		
		int sum=0;
		
		/*
		 * sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6];
		 * System.out.println(sum);
		 */
		
		//i++==> i=i+1; ==>i=6+1==>i=7
		
		//i=7
		//sum=190
		//arr.length=7
		
		//7<=7-->true
		//itr3=> 30+arr[2]==>30+30==>60==>sum=60
		//it4==> 60+arr[3]==>60+40==>100==>sum=100;
		//it5==> 100+arr[4]==>100+50==>150
		//it6==> 150+arr[5]==>150+10==>160
		//itr7==> 160+arr[6]==> 160+30==>190
		
		for(int i=0;i<arr.length;i++)
		{
			//logic
			sum=sum+arr[i];
			System.out.println(i+","+sum);
		}
		System.out.println(sum);
		
	}
	
}
