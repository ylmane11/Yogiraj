import java.util.Scanner;

public class LuckyNum {
	public static void main(String arc[])
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the car no:");
		int carno=sc.nextInt();
		if(carno>999 && carno<=9999)
		{
			int sum=0,n;
			while(carno!=0)
			{
				sum+=(carno%10);
				carno/=10;
			}
			if(sum%3==0 ||sum%5==0 || sum%7==0)
			{
				System.out.println("Lucky Number");
			}
			else
			{
				System.out.println("Sorry its not lucky number");
			}
				
		}
		else
		{
			System.out.println(carno+"is not valid number");
		}
	}

}
