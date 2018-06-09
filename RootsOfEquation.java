import java.util.Scanner;
public class RootsOfEquation {
	@SuppressWarnings({ "resource" })
	public static void main(String ar[])
	{
		float a,b,c,d;
		double d1,r1,r2,i1,i2;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter value of a,b,c");
		a=obj.nextFloat();
		b=obj.nextFloat();
		c=obj.nextFloat();
		d=b*b-(4*a*c);
		d1=Math.sqrt(d);
		if(d>0)
		{
			r1=(-b+d1)/(2*a);
			r2=(-b-d1)/(2*a);
			System.out.println("ROOTS ARE AS \n"+r1+"AND"+r2);
		}
		else if(d==0)
		{
			r1=r2=(-b)/(2*a);
			System.out.println("ROOTS ARE AS \n"+r1+"AND"+r2);
		}
		else
		{
			r1=r2=(-b)/(2*a);
			i1=d1/(2*a);
			//i1=0;
			i2=(-i1);
			System.out.println("ROOTS ARE AS \n"+String.format("%.2f",r1)+"+i"+i1+"  And  "+String.format("%.2f",r2)+"-i"+i2);
		}
	}
}
