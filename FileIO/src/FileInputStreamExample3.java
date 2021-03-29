import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("D:\\test1.txt");
		
		System.out.println(fin.read());
		
		int i=0;
		
		while((i=fin.read())!=-1)  //EOF-MAKER (End of File)
		{
			System.out.print((char)i);
		}
		
		fin.close();
		fin=new FileInputStream("D:\\test1.txt");
		System.out.println(fin.read());
		
		
	}

}
