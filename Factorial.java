import java.util.Scanner;

public class Factorial
{
  public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter a Number:");
	 int n=sc.nextInt();
	 int result=1;
	 for(int i=n;i>0;i--)
	 {
          result=result*i;			 
     }
	 System.out.println("factorial of "+n+" is "+result);
}
}