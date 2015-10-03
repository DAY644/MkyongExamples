package ru.assetallocator.core.io;

import java.io.File;
import java.io.IOException;

public class FilePathExample1 {

	public static void main(String[] args) {
       try { 
    	   String fileName = "newFile.txt";
    	   String workingDirectory = System.getProperty("user.dir");
    	   String absoluteFilePath = "";
    	   
    	   absoluteFilePath = workingDirectory + File.separator + fileName;  
    	   
    	   System.out.println(workingDirectory);
    	   
    	   System.out.println(File.separator);
    	   System.out.println(System.getProperty("file.separator"));
    	   
    	   System.out.println("absoluteFilePath : " + absoluteFilePath);
    	   
    	   File file = new File(absoluteFilePath);
    	   
    	   if ( file.createNewFile() ) {
    		  System.out.println("File is created!");  
    	   } else {
    		   System.out.println("File is already exists!");  
    	   }	   
    	   
       } catch (IOException e) {
    	   e.printStackTrace(); ;
       }
	}
}
