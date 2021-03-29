import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;

		for (int j = 0; j < args.length; j++) {
			System.out.println(args[j]);
		}

		Scanner in = new Scanner(System.in);
		int k = 1;
		while (k <= 4) {
			System.out.print("Enter your name: ");
			String name = in.nextLine();
			System.out.println("Name is: " + name);
			k++;
		}
		in.close();
	}

}
