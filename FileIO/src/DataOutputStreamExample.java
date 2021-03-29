import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("D:\\test3.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		
		//DataOutputStream dout1= new DataOutputStream(new FileOutputStream("D:\\test.txt"));
		dout.writeChar(65);
		dout.flush();
		dout.close();
		fout.close();
		System.out.println("Success");
	}

}
