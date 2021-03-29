
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int[] arr={10, 20 ,30, 1, 2 ,3, 40, 50 ,60}; // 1 ,2 ,3 ,  10 ,20 ,30,40,50,60
		         //0    1   2  3  4  5  6   7   8  9
		int[] arr={10, 20 ,30, 1, 2 ,3, 40, 12 ,60,5};
		//System.out.println(arr.length);//9-1=8
		
		//System.out.println(arr[4]);
		
		int startIndex=0;
		int endIndex=0;
		for(int i=0;i<(arr.length-1);i++)
		{
			
			if(arr[i]>arr[i+1]) //40>50
			{
				//start index logic
				if(startIndex>1)
					continue;
				startIndex=(i+1); //3
			}
		 if(startIndex>1)//3>1
			{
				//
				if(arr[startIndex-1]<arr[i])//30<40
				{
					continue;
				}
				endIndex=i+1;  //5
			}
			
			
		}
		
		System.out.println(startIndex);
		
		System.out.println(endIndex);
	}

}
