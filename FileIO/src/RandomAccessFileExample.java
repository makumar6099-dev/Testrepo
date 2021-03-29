import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	static final String FILEPATH ="myFile.TXT";  
    public static void main(String[] args) {  
        try {  
        	File file=new File(FILEPATH);
        file.createNewFile();
        
            System.out.println(new String(readFromFile(FILEPATH, 0, 72)));  
            writeToFile(FILEPATH, "I love my country and my people", 73);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    private static byte[] readFromFile(String filePath, int position, int size)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  // r--> read mode
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  

}
