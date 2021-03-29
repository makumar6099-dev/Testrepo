import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputStreamExample1 {

	public static void main(String[] args) throws IOException {
		
			FileOutputStream fout = new FileOutputStream("D:\\test.txt");//D:\test.txt
			fout.write(65);
			fout.write(66);
			
			fout.close();
			System.out.println("Success..");
			
	}
}
