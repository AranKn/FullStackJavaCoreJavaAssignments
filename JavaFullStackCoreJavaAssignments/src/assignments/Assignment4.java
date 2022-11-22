package assignments;

import java.util.Arrays;
public class Assignment4 
{
	@SuppressWarnings("unused")
	private static String countVowelsConsonantsAndSpecialCharacters(String string)
	{
		string=string.replace(" ","");
		int vowelCount=0,
			consonantCount=0,
			specialCharactersCount=0,
			codePoint=0;
		for(int t=0;t<string.length();t++)
		{
			if("aeiouAEIUO".contains(""+string.charAt(t)))
				vowelCount++;
			else if(65<=string.codePointAt(t) && string.codePointAt(t)<=90 || 97<=string.codePointAt(t) && string.codePointAt(t)<=122)
				consonantCount++;
			else
				specialCharactersCount++;
		}
		return "Count of vowels, special characters and consonants are as follows :\nVowels - "+vowelCount+"\nConsonants - "+consonantCount+"\nSpecial Characters - "+specialCharactersCount;
	}
	
	private static String verifyPalindrome(String string)
	{
		string=string.toLowerCase();
		boolean flag=true;
		for(int t=0;t<=string.length()/2;t++)
		{
			if(!(string.charAt(t)==string.charAt(string.length()-1-t)))
			{
				flag=false;
				break;
			}
		}
		return flag ? "Given string is a palindrome" : "Given string is not a plaindrome";
	}
	
	private static void  printDuplicates(String string) 
	{
		string=string.replace(" ","").toLowerCase();
		String temp="",duplicates="";
		for(String s:string.split(""))
			if(temp.contains(s))
				duplicates+=s;
			else
				temp+=s;
		System.out.println(duplicates=="" ? "There's no duplicate in the given string" : "Duplicates in the given string : "+Arrays.toString(duplicates.split("")));
	}
	
    private static void removeDuplicates(String string)
    {
        String tempString="";
        for(int t=0;t<string.length();t++)
            if(!tempString.contains(""+string.charAt(t)))
                tempString+=string.charAt(t);
        System.out.println(tempString.equals(string) ? "Given string doesn't have any duplicate characters" :"String without duplicates : "+tempString);
    }

    private static void findMaximumOccuringCharacters(String string)
    {
    	 string=string.toLowerCase();
         String temp= "",ss = "";
         int index;
         for(String st:string.split(""))
         {
        	 if(temp.contains(st))
        	 {
        		 index=temp.indexOf(st);
        		 temp=temp.replace(temp.substring(index,index+2),temp.substring(index,index+1)+(Integer.parseInt(temp.substring(index+1,index+2))+1));
        	 }
        	 else
        		 temp+=st+"1:";
         }
         temp=temp.substring(0,temp.length()-1);
         index=0;
         for(String s:temp.split(":"))
        	 if(index<Integer.parseInt(""+s.charAt(1)))
        		 index=Integer.parseInt(""+s.charAt(1));  
    
         if(index==1)
        	 System.out.println("String contains unique characters");
         else
         {
        	 for(String st1:temp.split(":"))
        		 ss+= (index==(Integer.parseInt(""+st1.charAt(1)))) ? st1.charAt(0):"";
        	 System.out.println(ss.length()==1 ? "Maximum occuring character in the given string is : "+ss:"Maximum occuring chracters in the given string are : "+Arrays.toString(ss.split("")));
         }
         
    }
    
    
    private static char[] sortArray(char c[])
    {
        char cc;
        for(int t1=0;t1<c.length;t1++)
            for(int t2=t1+1;t2<c.length;t2++)
                if((int)c[t1]>(int)c[t2])
                {
                    cc=c[t1];
                    c[t1]=c[t2];
                    c[t2]=cc;
                }
        return c;
    }
    private static String verifyAnagramString(String string1,String string2)
    {
        boolean flag=true;
        if(string1.length()==string2.length())
        {
            char[] c1 = sortArray(string1.toCharArray()),
                   c2 = sortArray(string2.toCharArray());
            for(int t=0;t<c1.length;t++)
                if(!(c1[t]==c2[t]))
                {
                    flag=false;
                    break;
                }
        }
        else
            flag=false;
        return flag? "Give strings are Anagram strings" : "Given strings are not Anagram strings";
    }

    private static String verifyStringUniqueCharacters(String string)
    {
        string=string.toLowerCase();
        String tempString="";
        for(String ss:string.split(""))
            if (tempString.contains(ss))
                break;
            else
                tempString +=ss;
        return string.equals(tempString) ? "Given string contains unique characters" : "Given string does not have unique characters";
    }

    private static String verifyPangramString(String string)
    {
        boolean flag=true;
        for(String s:"abcdefghijklmnopqrstuvwxyz".split(""))
            if(!string.contains(s))
            {
                flag=false;
                break;
            }
        return flag ? "Given string is Pangram":"Given string is not Pangram";
    }
	
	public static void main(String[] args)
	{
		//1.WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
		removeDuplicates("malayalam");
		
		  //2.WAP to print Duplicates characters from the String.
		  printDuplicates("NarendraModi");
		  
		  //3.WAP to check if “2552” is palindrome or not
		  System.out.println(verifyPalindrome("205676502"));
		  
		  //4.WAP to count the number of consonants, vowels, special characters in a String.
		  System.out.println(countVowelsConsonantsAndSpecialCharacters("Amarendar Singh is going to have his first ceremony #$&*"));
		  
		  //5. WAP to implement Anagram Checking least inbuilt methods being used.
		  System.out.println(verifyAnagramString("amar","rama")); 
		
		  //6. WAP to implement Pangram Checking with least inbuilt methods being used.		  
		  System.out.println(verifyPangramString("The quick brown fox jumps over the lazy dog"));
		  
		  //7.WAP to find if String contains all unique characters.
		  System.out.println(verifyStringUniqueCharacters("Hyderabad"));
		  
		  //8. WAP to find the maximum occurring character in a String.
		  findMaximumOccuringCharacters("Hyderabad");
		  
		 	}
}