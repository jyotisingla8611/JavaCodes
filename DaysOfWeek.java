import java.util.Scanner;

public class DaysOfWeek {
	@SuppressWarnings("resource")
	public static void main(String ar[])
	{
		Scanner obj=new Scanner(System.in);
		int day;
		System.out.println("Enter a number ");
		day=obj.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Day is Sunday ");
			break;
		case 2:
			System.out.println("Day is Monday ");
			break;
		case 3:
			System.out.println("Day is Tuesday ");
			break;
		case 4:
			System.out.println("Day is Wednesday ");
			break;
		case 5:
			System.out.println("Day is Thursday ");
			break;
		case 6:
			System.out.println("Day is Friday ");
			break;
		case 7:
			System.out.println("Day is Saturday ");
			break;
		default:
			System.out.println("Not a Valid Day");
			break;
		}
	}
}
