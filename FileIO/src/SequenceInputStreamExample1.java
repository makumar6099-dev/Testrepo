import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input1=new FileInputStream("D:\\test1.txt");
		FileInputStream input2=new FileInputStream("D:\\test2.txt");
		
		SequenceInputStream seqInputStream = new SequenceInputStream(input2, input1);
		int i=0;
		while((i=seqInputStream.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		seqInputStream.close();
		input1.close();
		input2.close();
		
	}

}
