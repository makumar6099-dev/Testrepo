import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double d=23.101000;
		DecimalFormat df=new DecimalFormat("##.000000");
		System.out.println(df.format(d));
		
			
		final List<String> list = new CopyOnWriteArrayList<String>();
		list.add("abc");
		list.add("def");
		for(String str:list) {
			list.add("ghi");
			list.remove(0);
			System.out.println(str);
		}
		
		
		
		
	}

}
