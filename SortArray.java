import java.util.Scanner;
public class SortArray {
	@SuppressWarnings("resource")
	public static void main(String ar[])
	{
		@SuppressWarnings("unused")
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size;
		size=obj.nextInt();
		int arr[];
		arr =new int[size];
		for(int i=0;i<size;i++)
		{
		   arr[i]=obj.nextInt();	
		}
		System.out.println("THE ARRAY IS : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nTHE ARRAY AFTER SORTING IS AS : ");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int swap;
					swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
				}
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
