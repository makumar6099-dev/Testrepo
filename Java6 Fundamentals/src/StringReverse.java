
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java"; //nariK
		//1. use pre defined function (reverse("Java")),
		//2. custom logic
		//3. arrycopy()
		
		
		// cconvert from string to array "Java"--> [J],[a], [v],[a]
		// get the length of the array             [0].[1], [2],[3]
		//decrement from length-1 to 0
		char[] chArray=str.toCharArray();
		
		System.out.println(chArray.length);
		
		for(int i=(chArray.length-1);i>=0;i--)//i=, 4>=0
		{
			System.out.print(chArray[i]);
		}
		
		
		
	}

}
