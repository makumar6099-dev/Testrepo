
public class FirstArithmetic {

	public static void main(String[] args) throws NullPointerException, Exception {
		// TODO Auto-generated method stub
		// int i=10/0;
		// System.out.println(i);

		try {
			String s = null;
			s.length();
		} catch (Exception n) {
			throw n;
		}

		finally {
			System.out.println("I am in finally");
		}
		// 1.Intertacting Database/Files
		// 2. =====================
	}

}
