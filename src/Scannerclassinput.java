import java.util.Scanner;

public class Scannerclassinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of student");
		String name=s.next();
		System.out.println("Enter the age of student");
		for(i=0;i<=5;i++)
		{
			int age=s.nextInt();
			System.out.println("the age of student  "  +age);
		}
		
		System.out.println("the name of student  " +name);
		
		
		s.close();
		
		
		

	}

}
