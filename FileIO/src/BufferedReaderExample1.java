import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class BufferedReaderExample1 {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\dummy.txt"))) {
			while (br.ready()) {
				String line=br.readLine();
				String[] strArray=line.split(" ");
				for(String str:strArray)
				{
					set.add(str);
				}
			}
		} catch (IOException io) {
			io.printStackTrace();
		}
		
		System.out.println(set);//unique elements
	}

}
