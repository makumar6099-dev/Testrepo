import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//InputStream is = ClassLoaderEx.class.getClassLoader().getResourceAsStream("C:\\Users\\vinod\\eclipse-workspace\\FileIO\\File2.txt");
		//byte[] b= new byte[is.read()];
		FileInputStream fin=new FileInputStream("File2.txt");
		System.out.println("Succcess");
	}

}
