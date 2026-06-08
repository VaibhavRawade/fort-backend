package com.example.fort.FortProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FortProjectApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(FortProjectApplication.class, args);
		FortProjectApplication.getData();
		
	}
	
	public static void getData()
	{
		int a[]= {11, 18, 20, 24, 85, 66, 13 };
		
		
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

}
