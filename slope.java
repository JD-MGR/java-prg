import java.util.Scanner;
public class slopetest
{
	public static void main(String[] args)
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter x1:");
	int x1=scanner.nextInt();
	System.out.println("Enter y1:");
	int y1=scanner.nextInt();
	System.out.println("Enter x2:");
	int x2=scanner.nextInt();
	System.out.println("Enter y2:");
	int y2=scanner.nextInt();
	int slope=(x2-x1)/(y2-y1);
	System.out.println("The Slope is:"+slope);
	Scanner.close();
	}
}
