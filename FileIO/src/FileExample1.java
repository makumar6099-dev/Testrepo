import java.io.File;
import java.io.IOException;

public class FileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {  
            File file = new File("File1.txt");  
            
            if(file.exists())
            	System.out.println("File is already available");
            else
            {
            	if (file.createNewFile()) {  
                    System.out.println("New File is created!");  
                } else {  
                    System.out.println("File already exists.");  
                }  
            }
            
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
	}

}
