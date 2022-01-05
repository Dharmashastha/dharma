package file;

import java.io.*;
import java.util.*;

import test.CustomException;

public class Sample 
{
public void nullCheck(Object objFile) throws CustomException
{
if(objFile == null)
{
	throw new CustomException("File can't be null");
}
}
	
public void createFile(String filePath,String fileName,String fileStored) throws CustomException
  { 	
	
	try(FileWriter myWrite=new FileWriter(filePath+fileName,true)) {
		/*File objFile=new File(filePath,fileName);
		nullCheck(objFile);
		if (objFile.createNewFile()) {
	        System.out.println("File created: " + objFile.getName());
	      } else {
	        System.out.println("File already exists");
	      }*/
		nullCheck(myWrite);
		myWrite.append(fileStored);
		//myWrite.write(fileStored);
	}
	catch(IOException ex)
	{
		throw new CustomException(ex); 
	}
	
  }

public Properties properties(Properties objPro,String filePath,String key,String value) throws CustomException
{
	try (FileOutputStream file=new FileOutputStream(filePath))
	{
		nullCheck(file);
		objPro.setProperty(key,value);
		objPro.store(file, "hello");
	}
	catch(IOException ex)
	{
		throw new CustomException(ex); 
	}
	return objPro;
}
public Properties load(Properties objPro,String filePath) throws CustomException
{
	try (FileInputStream file=new FileInputStream(filePath))
	{
		nullCheck(file);
		objPro.load(file);
	}
	catch(IOException ex)
	{
		throw new CustomException(ex); 
	}
	return objPro;
}

public void  directory(String filePath) throws CustomException
{
	
		File objFile=new File(filePath);
		nullCheck(objFile);
		objFile.mkdirs();

}
private String name;
public Sample(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Sample [name=" + name + "]";
}

}
