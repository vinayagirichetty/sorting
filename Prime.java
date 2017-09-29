import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Prime{
	public static void main(String args[]){
		int a,count=0;
		System.out.println("Enter any number");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<=a;i++){
			if(a%i==0){
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(a+"is a Prime Number");
		}
		else{
			System.out.println(a+"is not a Prime Number");
		}
		
	}
}