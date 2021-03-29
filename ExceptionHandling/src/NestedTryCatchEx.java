
public class NestedTryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			try {
				int i = 10 / 0;
			} catch (ArithmeticException ae) {
					//.........
			} finally {

			}

			String str = null;

			try {
				str.length();
			} catch (NullPointerException nlp) {

			} finally {
				
			}

		} catch (Exception e) {

		} finally {

		}

	}

}
