import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fout= new FileOutputStream("D:\\test1.txt");
		String str="Hi How are you?";
		
		byte[] b=str.getBytes();
		
		fout.write(b);
		
		fout.close();
		
		System.out.println("Success..");
	}

}
