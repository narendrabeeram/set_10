/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int n=s.nextInt();
		int sum=0;
		for(int i=a;n!=0;i=i+b)
		{
			sum=sum+i;
 
			n=n-1;
		}
		System.out.println(sum);
	}
}
