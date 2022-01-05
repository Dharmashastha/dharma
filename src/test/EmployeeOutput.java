package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class EmployeeOutput {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		try {
		System.out.println("Enter the Employee Name");
		String name=scan.nextLine();
		System.out.println("Enter the Employee Id");
		int id=Integer.parseInt(scan.nextLine());
		
		
		Class<?> objClass=Class.forName("pojo.Employee");
		
		Object stored=objClass.getDeclaredConstructor().newInstance();
		Constructor<?> constr=objClass.getDeclaredConstructor(String.class,int.class);
		
		Object stored1=constr.newInstance(name,id);
		System.out.println(stored1);
		
		Method[] conCall=objClass.getDeclaredMethods();
		for(Method dummy:conCall) 
		{
		System.out.println(dummy);
		}
		//scan.nextLine();
		
		System.out.println("Enter the Employee Name");
		String name1=scan.nextLine();
		System.out.println("Enter the Employee Id");
		int id1=Integer.parseInt(scan.nextLine());
		conCall[2].invoke(stored, name1);
		System.out.println(conCall[1].invoke(stored));
		conCall[4].invoke(stored, id1);
		System.out.println(conCall[3].invoke(stored));
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	scan.close();
	
	}

}
