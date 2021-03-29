import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. byte[] b={65,66,67};
		   byte[] b= {65, 66, 67};
		//FileInputStream fint;
		   //fint.getByte()
		ByteArrayInputStream baInput= new ByteArrayInputStream(b);
		int i=0;
		while((i=baInput.read())!=-1)
		{
			System.out.print((char)i);
		}
		baInput.close();
	}

}
