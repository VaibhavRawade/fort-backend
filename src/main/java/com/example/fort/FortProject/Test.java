package com.example.fort.FortProject;

public class Test 
{

	public static void main(String[] args) 
	{
		getData();
		int a[]= {11, 18, 20, 24, 85, 66, 13 ,401,104};
		
		
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int finalVarible=0;
			while(num>0)
			{
				int temp=num%10;
				finalVarible=temp;
				num/=10;
			}
			if(finalVarible==1)
			{
				System.out.println(a[i]);
			}
		}
		

	}
	
	public static void getData()
	{
		//Convert first half of string to lowercase and second half to uppercase
		
		String str="VaibhavRawade";
		int half=str.length()/2;
		
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(i<half)
			{
				buffer.append(Character.toUpperCase(str.charAt(i)));
			}
			else
			{
				buffer.append(Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("Final String Is->"+buffer);
		
		
		
	}

}
