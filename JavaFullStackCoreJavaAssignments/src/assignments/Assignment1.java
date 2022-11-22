package assignments;

import java.util.Scanner;

public class Assignment1 {

	static void solution1(int size)
	{
		int number=size;
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number;j++)
				if(i==0 || i==number-1 || j==number/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.print("   ");
			
			for(int j=0;j<number;j++)
			{
				if(j==0 || j==number-1 || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			
			for(int j=0;j<number;j++)
			{
				if(i==0  || i==number-1 || i==number/2 || j==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			for(int j=0;j<number;j++)
			{
				if(((j==0  || j==number-1) && i!=number-1) || i==number-1 && j>0 && j<number-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			for(int j=0;j<number;j++)
			{
				if(((i==0 || i==number/2)&&j!=number-1)|| j==0 || (j==number-1) && i<number/2 && i!=0 || (i>number/2 && j==2*(i-(number/2))))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			for(int j=0;j<number;j++)
			{
				if((i==0 &&(j>0 && j<number-1)) || (i==number-1 &&(j>0 && j<number-1)) || (j==0 &&(i>0 && i<number-1))  || (j==number-1 && (i>0 && i<number-1)))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			
			for(int j=0;j<number;j++)
			{
				if(j==0 || j==number-1 || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("    ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int number=0,mid=0;
		
		//Solution 1
		System.out.println("Enter the size : ");
		solution1(scanner.nextInt());
		
		//Solution 2
		System.out.println("Enter the size : ");
		number=scanner.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=number;j++)
				System.out.print(i+" ");
			System.out.println();
		}
		
		//Solution 3
		System.out.println("Enter the size : ");
		number=scanner.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number;j++)
				if(i==0||i==number-1||j==0||j==number-1 || ((i<(number/2)-1)&&(j<(number/2)-1-(i-1)) ||(j>(number/2)-1+(i-1))))
					System.out.print("* ");
				else
					System.out.print("  ");
		     System.out.println();
		}
		
		//Solution 4
		System.out.println("Enter the size : ");
		number=scanner.nextInt();
		mid=number/2;
		for(int i=0;i<(number/2)+1;i++)
		{
			for(int j=0;j<number;j++)
				if(i>(mid-2) || j<=i || j>=number-1-i)
					System.out.print("* ");
			    else
			    	System.out.print("  ");
		System.out.println();
		}
		
		//Solution 5
		System.out.println("Enter the size : ");
		number=scanner.nextInt();
		mid=(number-1)/2;
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number;j++)
				if(i==0 || i==number-1 || (i<=mid && j<=mid-i) || (i>mid && j<=i-mid))
						System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}
	}

}