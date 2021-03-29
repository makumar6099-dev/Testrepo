import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

public class BufferedInputStreamExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long startTime=Calendar.getInstance().getTimeInMillis();
		BufferedInputStream bin=new BufferedInputStream(new FileInputStream("D:\\test1.txt"));
		
		int i=0;
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		System.out.println("End Time:"+ ((Calendar.getInstance().getTimeInMillis())-startTime));
		bin.close();
	}

}
