import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream fout=new FileOutputStream("D:\\test2.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		
		String str="Welcome to java training...";
		
		byte[] b= str.getBytes();
		bout.write(b);
		
		bout.flush();
		
		
		bout.close();
		fout.close();
		
		
	}

}
