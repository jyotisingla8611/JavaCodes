import java.util.Scanner;

public class DivisibiltyTest {

	public static void main(String args[])
	{   int num;
		System.out.println("Enter a number ");
		@SuppressWarnings("resource")
		Scanner obj= new Scanner(System.in);
		num=obj.nextInt();
		if(num%3==0 && num%5==0)
			System.out.println("Acadview Learning ");
		else if(num%5==0)
			System.out.println("Learning");
		else if(num%3==0)
			System.out.println("Acadview");
	}

}
