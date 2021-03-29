/**
 * THis is sample TypesofVariables Example
 * @author vinod
 *
 */
public class TypesOfVariables {
	int var1;
	int var2;

	static int var3;
	static int var4;
	/**
	 * This is a main method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=10; //Local Variable (Scope: inside the method, not a shared memory location)
		int y=20; //Local Variable

				
		//add(x,y);
		
		
		TypesOfVariables obj1=new TypesOfVariables();
		obj1.var1=20;
		obj1.var2=30;
		obj1.var3=100;
		obj1.var4=200;
		System.out.println(obj1.var1+" "+obj1.var2);//20 30
		System.out.println(obj1.var3+" "+obj1.var4);//100 200
		
		TypesOfVariables obj2=new TypesOfVariables();
		obj2.var1=50;
		obj2.var2=60;
		obj2.var3=300;
		obj2.var4=400;
		System.out.println(obj2.var1+" "+obj2.var2);//50 60
		System.out.println(obj2.var3+" "+obj2.var4); // 300 400
		
		System.out.println(obj1.var3+" "+obj1.var4); // 300 400
		
		obj2.add(10,20, obj1);
		obj1.add(30, 40, obj2);
		
		info();
		/*
		 * obj1.var1=40; obj1.var2=50; System.out.println(obj1.var1+" "+obj1.var2);//40
		 * 50 System.out.println(obj2.var1+" "+obj2.var2);//50 60
		 */		
		
	}
	public void add(int a,int b, TypesOfVariables obj)
	{
		
		obj.var1=2000;
		
		System.out.println(a+" "+b); // 10 20
		var1=200;
		TypesOfVariables.var3=200;
		info();
	}
	
	static void info()
	{
		
	}

}
