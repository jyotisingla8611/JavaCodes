import java.util.Scanner;  
public class Replace_Char {
	@SuppressWarnings("unused")
	public static void main(String args[])
	{   String name;
		System.out.println("Enter a number ");
		@SuppressWarnings("resource")
		Scanner obj= new Scanner(System.in);
        name=obj.nextLine();
        System.out.println("My Name is "+name);
        String find;
        find=obj.next();
        String replace;
        replace=obj.next();
        System.out.println("Replace char in the above string  "+find+ " by " +replace );
        int n;
        n=name.length();
        System.out.println("Length the above string  "+n);
       	String result=name.replaceAll(find, replace);
        System.out.println("String after replacement is "+result); 
        
	}
	
}
