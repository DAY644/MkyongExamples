package ru.assetallocator.core.io;

import java.io.File;
import java.io.IOException;

public class FilePathExample2 {

	public static void main(String[] args) {
		try { 
	        String fileName = "newFile2.txt";
	        String workingDirectory = System.getProperty("user.dir");
	        
	        System.out.println("workingDirectory = "+ workingDirectory);
	        
	        
	        File file = new File( workingDirectory, fileName );
	        
	        System.out.println("Final filepath : " + file.getAbsolutePath());
	        
	        if (file.createNewFile()) {
	        	System.out.println("File is created!");
	        } else {
	        	System.out.println("File is already exists!");
	        }
	    
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
