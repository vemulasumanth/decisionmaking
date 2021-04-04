package DecisionMaking;
import java.util.Scanner;
public class DecisionMaking {

	public static void main(String[] args) {
		int choice;
		System.out.println("enter choice:\t1:If Else\t2:loop\t");
		Scanner s=new Scanner(System.in);
		choice=s.nextInt();
		switch(choice)
		{
		case 1:
		
		{int age;
			System.out.println("enter the age:");
			Scanner p=new Scanner(System.in);
			age=p.nextInt();
			if(age>=18)
			{
				System.out.println("eligible for vote.");
			}
			else
			{
				System.out.println("not eligible to vote.");
			}
			break;
		}
		case 2:
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);	
			}
		break;	
		}
		default:
			{System.out.println("enter valid choice.");
			break;
			}
	}
	}
}

