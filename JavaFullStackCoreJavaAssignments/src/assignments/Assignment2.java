package assignments;

import java.util.Arrays;

public class Assignment2 
{	
	private static String[] duplicateElements(int array[])
	{
		String s1="",
			   s2="";
		for(int i:array)
			if(!(s1.contains(i+":")) && !(s2.contains(i+":")))
				s2+=i+":";
			else if(!s1.contains(i+":"))
				s1+=i+":";	
		return s1.split(":");
	}
	
	private static int[] bubbleSort(int array[])
	{
		int temp=0;
		for(int pass=0;pass<array.length-1;pass++)
			for(int i=0;i<(array.length-1)-pass;i++)
				if(array[i]>array[i+1])
				{
					temp=array[i+1];
					array[i+1]=array[i]; 
					array[i]=temp;
				}
		return array;
	}
	
	private static int[] selectionSort(int array[])
	{
		int minimumPosition=0,temp=0;
	    for(int i=0;i<array.length;i++)
	    {
	        minimumPosition=i;
	        for (int j = i + 1; j < array.length; j++)
	            if(array[minimumPosition]>array[j])
	              minimumPosition=j;
	        if(i!=minimumPosition) {
	            temp = array[i];
	            array[i] = array[minimumPosition];
	            array[minimumPosition] = temp;
	        }
	    }
	    return array;
	}
	
	
	private static  void merge(int array[], int lowerBound, int mid, int upperBound) {

	    int n1 = mid - lowerBound + 1;
	    int n2 = upperBound - mid;

	    int left[] = new int[n1],
	    	right[] = new int[n2];

	  
	    for (int i = 0; i < n1; i++)
	      left[i] = array[lowerBound + i];
	    for (int j = 0; j < n2; j++)
	      right[j] = array[mid + 1 + j];

	    int i=0,j=0,k = lowerBound;

	    while (i < n1 && j < n2) {
	      if (left[i] <= right[j]) {
	        array[k] = left[i];
	        i++;
	      } else {
	        array[k] = right[j];
	        j++;
	      }
	      k++;
	    }
	    
	    while (i < n1) {
	      array[k] = left[i];
	      i++;
	      k++;
	    }

	    while (j < n2) {
	      array[k] = right[j];
	      j++;
	      k++;
	    }
	  }
	
	
	static void mergeSort(int array[],int lowerBound,int upperBound)
	{
		if(lowerBound<upperBound)
		{
			int mid=(lowerBound+upperBound)/2;
		mergeSort(array,lowerBound,mid);
		mergeSort(array,mid+1,upperBound);
		merge(array,lowerBound,mid,upperBound);
		}
		
	}
	
	static int divide(int[] array,int lowerBound,int upperBound)
	{
	        int pivot = array[upperBound];
	        int i = (lowerBound-1);
	        for (int j=lowerBound; j<upperBound; j++)
	        	if (array[j] <= pivot)
	            {
	                i++;
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        
	        int temp = array[i+1];
	        array[i+1] = array[upperBound];
	        array[upperBound] = temp;
	 
	        return i+1;
	}
	
	public static void quickSort(int array[], int lowerBound,int upperBound)
	{
		if(lowerBound<upperBound)
		{
			int index=divide(array,lowerBound,upperBound);
			quickSort(array,lowerBound,index-1);
			quickSort(array,index+1,upperBound);
		}
	}
	
	 static String verifySubArray(int [] array1,int [] array2) 
		{
			int flag=0;
			for(int i=0;i<array2.length;i++)
				for(int j=0;j<array1.length;j++)
					if(array2[i]==array1[j])
					{
						flag++;
						break;
					}
			return flag==array2.length ? "Array 2 is a subset of Array1" : "Array 2 is not a subset of Array1";
		}

	public static void main(String[] args) 
	{
		//1.Program to find the duplicates present in an array
		int [] array=new int [] {23,45,49,23,49,12,23,49,23};
		System.out.println("Duplicate elements are : "+Arrays.toString(duplicateElements(array)));
		
		//2.Program to sort array using Quick sort
		array=new int[] {10,8,21,11,7,3,18,17,1};
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
		
		//3.Program to sort array using Bubble sort
		array=new int[] {10,2,45,39,17,45,61,20,13,6};
		System.out.println(Arrays.toString(bubbleSort(array)));
		
		//4.Program to sort array using Merge sort
		int [] mergeArray=new int[] {9,16,4,17,2,16,11,9,2};
		mergeSort(mergeArray,0,mergeArray.length-1);
		System.out.println(Arrays.toString(mergeArray));
		
		//5.Program to sort array using selection sort
		array=new int[] {12,9,17,34,8,56,1,19,12,4};
		System.out.println(Arrays.toString(selectionSort(array)));
		
		//6.Program to check whether an array is a subset of another array 
		System.out.println(verifySubArray(new int[] {3,12,17,9,6,1,11,16,7},new int[] {6,3,7,11}));
	}
}
