import java.util.*;
public class Prog3 {
	public static void main(String Args[])
	{
		int i,n1=0,n2=1,n3;
		System.out.println("PLease enter the Limit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The Series of Fibonacci Series is :-");
		for(i=0;n1<=n;i++)
		{
			System.out.print(n1+" ");
			n3 = n1 + n2;
			n1=n2;
			n2=n3;
		}
	}
}
