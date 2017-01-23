import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class pos_value_finder
{

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int value=0,nth=3,pos=0;
		int arr[]=new int[50],i=0;
		System.out.println("enter the pos nth finder");
		pos=scan.nextInt();
		System.out.println("enter the values");
		for( i=0;i<50;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("4th pos value"+arr[nth]+"\t");
		//if(nth!=pos&&pos!=0)
			System.out.print(pos+"th value"+arr[50-pos]);
		
       
	}
}
