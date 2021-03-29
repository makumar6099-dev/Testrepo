import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample1 {

	public static void main(String[] args) {
		Reader fileReader=null;
		try
		{
			fileReader=new FileReader("D:\\writer.txt");
			int i=0;
			while((i=fileReader.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
		finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
