
public class RuntimeClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rc=Runtime.getRuntime();
		
		long mb=1024*1024;
		System.out.println("Max Memory:"+rc.maxMemory()/mb);
		System.out.println("Free Memory:"+rc.freeMemory()/mb);
		System.out.println("Total Memory"+rc.totalMemory()/mb);
		
		
		
	}

}
