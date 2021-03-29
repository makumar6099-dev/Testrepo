import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UncheckedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("abc.txt"));
		} catch (FileNotFoundException e) {
			System.exit(0);
			e.printStackTrace();
		} finally {
			System.out.println("Before br not null");
			if (br != null) {
				try {
					System.out.println("in Finally block");
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Hello");

	}

}
