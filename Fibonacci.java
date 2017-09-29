import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Fibonacci{
	public static void main(String args[]){
		int n,c,n1;
		System.out.println("Enter no of terms");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+b);
		n1=n-2;
		for(int i=1;i<=n1;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}