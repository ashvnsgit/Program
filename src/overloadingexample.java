
public class overloadingexample {
	
	public static void main(int a)
	{
		System.out.println("Int a is " +a);
	}
	public static void main(int a,int b)
	{
		System.out.println("Int a and b  is " +a +" and " +b);
	}
	public static void main(String name)
	{
		System.out.println("name is  " +name);
	}
	public static void main(char j)
	{
		System.out.println("charname " +j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingexample.main(4);
		overloadingexample.main("Ashish");
		overloadingexample.main(4, 5);
		overloadingexample.main('y');
		

	}

}
