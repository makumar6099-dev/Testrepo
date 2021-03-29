import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

public class FileInputStreamExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		long startTime=Calendar.getInstance().getTimeInMillis();
		FileInputStream fin=new FileInputStream("D:\\test1.txt");
		
		int i=0;
		
		while((i=fin.read())!=-1)  //EOF-MAKER (End of File)
		{
			System.out.print((char)i);
		}
		System.out.println("End Time:"+ ((Calendar.getInstance().getTimeInMillis())-startTime));
		fin.close();
	}

}
