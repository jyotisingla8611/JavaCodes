import java.util.Scanner;
public class PositiveNegative {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("Enter a number ");
        num=obj.nextInt();
        if(num>=0)
        	System.out.println("Number is Positive");
        else
        	System.out.println("Number is Negative");
	}

}
