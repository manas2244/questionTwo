package practice;

import java.io.EOFException;
import java.util.Scanner;

public class QuestionTwo 
{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		String arr[]=str.split("\\.|\\?|\\!"); //splitting by . ? !
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
	
		
		int len[]=new int[arr.length]; // this is to store the length of splitting string by space
		
		len[0]=arr[0].split(" ").length; 
		
		//System.out.println(len[0]);
		
		for(int i=1;i<arr.length;i++)
		{
		String[] b=arr[i].split(" ");
		
		len[i]=b.length-1;
		//System.out.println(len[i]);
		}
		
		int temp;
		
		for(int i=0;i<len.length-1;i++)
		{
			if(len[i] > len[i+1])
					{
						temp=len[i+1];
						len[i+1]=len[i];
						len[i]=temp;
					}
		}
		
		System.out.println("the maximum number of words in sentence is "+len[len.length-1]);
		
		
		
	}

}
