package test;

import pojo.PojoEx;
import java.util.Scanner;

public class PojoExOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		try
		{
    	System.out.println("Enter the Student Name");
		String name=scan.nextLine();
		System.out.println("Enter the Student Id");
		int id=Integer.parseInt(scan.nextLine());
		PojoEx pojoCall=new PojoEx(name,id);
		System.out.println(pojoCall);
		pojoCall.setStudentName(name);
		pojoCall.setStudentId(id);
		System.out.println("Name:"+pojoCall.getStudentName());
		System.out.println("Id:"+pojoCall.getStudentId());	
		}
		catch(Exception e)
		{
			System.out.println(e);
			//e.printStackTrace();
		}
		scan.close();
	}

}
