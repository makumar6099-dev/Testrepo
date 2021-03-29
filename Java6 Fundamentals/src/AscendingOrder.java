
public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={20,10,30,40,50,10,30} ; //Unique elements: 10, 20 30 40 50
		String[] str= {"Hello","World","Hello","World"};//Occurance--> hello, world count ++
		//arr[]={10  20 30 40 10 30 50}
		//asscending
		//Bubble sort 100
		//two element pair, compare, interchange those element
		
		System.out.println("Given Array");
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		//For Search (Linear Search)
				for(int k=0;k<(arr.length);k++)
				{
					if(arr[k]==50)
					{
						System.out.println("Index of element 50:"+k);
					}
				}
		for(int i=0;i<(arr.length-1);i++)      //1<6  (T)
		{
			for(int j=0;j<(arr.length-1);j++)  //3<6
			{
				//logic/exchange
				if(arr[j]<arr[j+1])  //arr[3]>arr[4]-->40>10 (T)
				{
					int temp=arr[j]; //temp=40
					arr[j]=arr[j+1];//arr[3]=10
					arr[j+1]=temp;//arr[4]=40
					
				}
			}
		}
		
		
		
		System.out.println();
		System.out.println("Sorted array");
		//print array elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
