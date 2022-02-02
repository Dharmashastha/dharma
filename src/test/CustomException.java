package test;

import java.io.IOException;

public class CustomException extends Exception 
{
public CustomException(String message)
{
	super(message);
}

public CustomException(IOException error) {
	super(error);
}
str=str.toLowerCase();
       boolean letter=true;
    for(char ch='a';ch <='z';ch++)
    {
    if(!str.contains(String.valueof(ch))
    {
        letter=false;
        break;
    }
    return letter;
    }
}
