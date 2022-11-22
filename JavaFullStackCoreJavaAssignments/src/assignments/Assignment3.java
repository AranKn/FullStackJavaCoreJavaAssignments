package assignments;

import java.util.Arrays;
import java.util.Scanner;
public class Assignment3 
{
	static String result(int[] playerGuess,int guess)
	{
		String result="";
		for(int i=0;i<playerGuess.length;i++)
			result+= playerGuess[i]==guess ? "Player "+(i+1)+"-" : "";
		return result=="" ? "None of the players made right guess!" : 
			                result.split("-").length==playerGuess.length ? "All the "+result.split("-").length+" players won the game" : 
				            "Winners of the game are :"+Arrays.toString(result.split("-")).replace("[","").replace("]", "");
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
    {
		Scanner scanner=new Scanner(System.in);
		int guesserGuess,n;
		System.out.print("Enter the number of players in game: ");
		n=scanner.nextInt();
		System.out.println("Umpire : Hello Guesser what's the number?");
		System.out.print("Guesser : ");
		guesserGuess=scanner.nextInt();
		int [] playerGuess = new int[n];	
		for(int t=0;t<n;t++)
		{
			System.out.print("Hello Player "+(t+1)+" what's your guess ?");
			playerGuess[t]=scanner.nextInt();
		}
		System.out.println(result(playerGuess,guesserGuess));
    }
}