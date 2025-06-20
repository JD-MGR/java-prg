import java.util.*;
import java.math.*;
public class Lollipop{
	public static void main(String[] args){
		
		int a,b;
		char choice;
		boolean dtr;
		if(a>b){
			dtr=true;
		}
		else{
			dtr=false;
		}
		System.out.println("Enter two numbers");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		
		System.out.println("Enter your Choice");
		String input=sc.next();
		choice=input.charAt(0);
	
		switch(choice){
			case 'a':
			
			
				System.out.println("Sum of two numbers"+add);
				break;
			
			case 'b':
			
				System.out.println("Difference of two numbers"+sub);
				break;
			
			case 'c':
	
			
				System.out.println("Product of two numbers"+mul);
				break;
			
			case 'd':
			
				System.out.println("Division of two numbers"+div);
				break;
				
			
			default:
			
				System.out.println("Invalid optiion");
				break;
			
		}
		if (div==0)
		{
			if (dtr==true){
			int mod=a%b;
			System.out.println("Remaider :"+mod);
			}
			else{
				int mod1=b%a;
				System.out.println("Remaider :"+mod1);
			}
		
				
			}
		}
	}
}
}
			
		
		
		
		