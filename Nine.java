import java.util.*;
class Nine{
	public static void main(String[] args){
		int n,sum=0,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (i=0;i<n;i++){
			for(j=9;j>i;j--){
				System.out.println("j="+j);
				sum=i+j;
			}
		}
		System.out.println("The sum : "+sum);
	}
}