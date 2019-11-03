import java.util.Scanner;

public class Factor {
	public static void main(String arc[])
	{
	Scanner sc = new Scanner(System.in);
	int fact=sc.nextInt();
	if(fact==0)
	{
	System.out.println("Can not find Factor ");	
	}
	else if(fact>=1)
	{
		for(int i=1;i<=fact;i++)
		{
			if(fact%i==0)
			System.out.println(i);
		}
	}
	else if(fact<1)
	{
		for(int i=-1;i>=fact;i--)
		{
			if(fact%i==0)
			System.out.println(-i);
		}
	}
	}
}
