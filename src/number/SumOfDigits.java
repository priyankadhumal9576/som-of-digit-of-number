package number;
import java.util.Scanner;
  public class SumOfDigits 
   {

	public static void main(String[] args)
	{
		int digit, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		while(number>0)
		{
		digit=number%10;
		sum=sum+digit;
		number=number/10;
		
		System.out.println("sum of digit"+sum);
		
		}
		
		

	}

   }