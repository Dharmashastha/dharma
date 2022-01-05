package test;

import file.Sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

public class OutputEx {
	Sample sampleCall=new Sample("");
	Scanner scan=new Scanner(System.in);
	
	
private void createFiles()
{
  try
  {
	BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
	String fileName=read.readLine();
	System.out.println(fileName);
	String filePath=read.readLine();
	System.out.println(filePath);
	int length=Integer.parseInt(read.readLine());
	String[] fileStored=new String[length];
	String stored="";
	for(int iter=0;iter < length;iter++) 
		{
			fileStored[iter]=read.readLine();	
		}
	for(String dummy:fileStored) 
		{
			//System.out.println(dummy);
			stored=stored+"\n"+dummy;
		}
	sampleCall.createFile(filePath, fileName, stored);
  }
  catch(Exception ex)
  {
	  System.out.println("File Not Found");
  }
}


private void properties() 
{
	try
	{
		//scan.nextLine();
		Properties prop=new Properties();
		System.out.println("Enter the properties");
		String filePath=scan.nextLine();
		int length=Integer.parseInt(scan.nextLine());
		for(int iter=0;iter < length;iter++)
		{
			System.out.println("Enter the key");
			String key=scan.nextLine();
			System.out.println("Enter the value");
			String value=scan.nextLine();
			prop=sampleCall.properties(prop,filePath,key,value);
		}
	}
	catch(Exception ex)
	{
		System.out.println("File error");
		ex.printStackTrace();
	}
}


private void load()
{
	try {
	//scan.nextLine();
	Properties prop=new Properties();
	String filePath=scan.nextLine();
	System.out.println(sampleCall.load(prop, filePath));
	}
	catch(Exception ex)
	{
		System.out.println("File error");
		ex.printStackTrace();
	}
}


	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		Sample sampleCall=new Sample("dharma");
		OutputEx outputCall=new OutputEx();
		System.out.println("Enter the case ");
		int number=scan.nextInt();
	
switch(number)
{
case 1:
	
		outputCall.createFiles();
		break;
case 2:
		outputCall.properties();
		break;
case 3:
		outputCall.load();
		break;
case 4:
	try
	{
		//scan.nextLine();
		String filePath=scan.nextLine();
		sampleCall.directory(filePath);
		outputCall.createFiles();
		outputCall.properties();
		outputCall.load();
	}
	catch(Exception ex)
	{
		System.out.println(ex);
		ex.printStackTrace();
	}
	break;
case 5:
	System.out.println(sampleCall);
	break;
}
scan.close();
}
}