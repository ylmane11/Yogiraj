import java.util.Scanner;

public class MovieTicket {
	public static void main(String arc[]) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no of ticket:");
		int t=sc.nextInt();
		System.out.println("Do you want refreshment:");
		String re=sc.next();
		sc.nextLine();
		System.out.println("Do you have any coupon:");
		String c=sc.next();
		sc.hasNextLine();
		System.out.println("Enter thr circle:");
		String circle= sc.next();
		if(t>=5 && t<=40)
		{
			if(!circle.equalsIgnoreCase("K")&& circle.equalsIgnoreCase("q") )
			{
				System.out.println("Invalid");
			}
			else
			{
				float total=0,cost,ref=0,a;
				
				if(circle.equalsIgnoreCase("k"))
					cost=t*75;
				else
					cost=t*150;
				if (re.equalsIgnoreCase("y"))
					ref=t*50;
				if(t>=20)
				{
					a=(10/100)*cost;
					cost=a;
				}
				if(c.equalsIgnoreCase("y"))
				{
					a=(2/100)*cost;
					cost=a;
				}
				total=cost+ref;
				String cc=String.format("%.2f", total);
				System.out.println("Total cost:"+cc);
				
			}
			
		}
		else
		{
			System.out.println("Minimum of 5 and Maximum of 40 tickets");
		}
	}

}
