import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fin= new FileInputStream("D:\\test.txt");
		int i=fin.read();
		
		System.out.println(i);//A-->65, B-->66
		System.out.println((char)i);
		
		int j=fin.read();
		System.out.println(j);//66
		System.out.println((char)j);
		
		fin.close();
		System.out.println("Success..");
		//

	}

}
