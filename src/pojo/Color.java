package pojo;

import java.util.Scanner;

public enum Color {
	//VIOLET(1),INDIGO(2),BLUE(3),GREEN(4),YELLOW(5),ORANGE(6),RED(7);
	VIOLET,INDIGO,BLUE,GREEN,YELLOW,ORANGE,RED;
	public int getColorCode()
	{
	 return ordinal()+1;
	}
}


class ColorName
{
public static void main(String args[])
{

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Color Name");
	String colorCase=scan.nextLine().toUpperCase();
	try 
	{
		Color colorCall=Color.valueOf(colorCase);
	}
	catch(Exception e)
	{
		System.out.println("Invaild Color Code");
		System.exit(0);
	}
	
	Color colorCall=Color.valueOf(colorCase);
	/*Color[] colorArray=Color.values();
	for(Color color:colorArray)
	{
		System.out.println("Color code of "+ color +" is "+color.getColorCode());
	}
	System.out.println("Enter the colorcode");
	int select=scan.nextInt();
	if(select<7&&select<=0)
	{
		System.out.println("Select the code "+select+" Color code of "+colorArray[select] +" is "+colorArray[select].getColorCode());
	}
	else
	{
		System.out.println("Invaild Color Code");
	}*/
	switch(colorCall)
	{
	case VIOLET:
		System.out.println("Color code of "+ colorCase +" is "+ colorCall.getColorCode());
		break;
	case INDIGO:
		System.out.println("Color code of "+ colorCase + "is "+colorCall.getColorCode());
		break;
	case BLUE:
		System.out.println("Color code of "+ colorCase + " is "+colorCall.getColorCode());
		break;
	case GREEN:
		System.out.println("Color code of "+ colorCase + " is "+colorCall.getColorCode());
		break;
	case YELLOW:
		System.out.println("Color code of "+ colorCase + " is "+colorCall.getColorCode());
		break;
	case ORANGE:
		System.out.println("Color code of "+ colorCase + " is "+colorCall.getColorCode());
		break;
	case RED:
		System.out.println("Color code of "+ colorCase + " is "+colorCall.getColorCode());
		break;
	default:
		System.out.println("Invaild Color Code");
		break;
	}
	scan.close();
}
}
