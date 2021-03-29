import java.io.File;

public class FileExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("/Users/vinod/Documents/java");
		if(dir.mkdir())
		{
			System.out.println("Creating new directory.");
		}
		File files[] = dir.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				
				System.out.println(file.getName() + " Can Write: " + file.canWrite() + "Is Hidden: " + file.isHidden()
						+ " Length: " + file.length() + " bytes");
				System.out.println(file.getAbsolutePath());
			}
		}
	}

}
