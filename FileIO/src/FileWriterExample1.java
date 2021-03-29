import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw=new FileWriter("D:\\writer.txt");
		String string="Java Programming";
		fw.write(string);
		
		fw.close();
		System.out.println("Success");
	}

}
