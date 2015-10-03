package ru.assetallocator.core.io;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileWriteExampleJDK7 {

	public static void main(String[] args) {

	   File file = new File ("d:/Java/eclipse/workspace/MKyong/testOutputFileJDK7_4.txt");	
	
	   String content = "This is next content JDK7";

	   
       try ( FileOutputStream fos = new FileOutputStream( file )  ) {
    	 
    	   // Эксперимент показал, что new FileOutputStream( file ) автоматически закрейтит и файл!
    	   // Т.е. скорее всего крейтит и не надо.
    	   if ( !file.exists() ) {
    		   file.createNewFile();
    		   System.out.println("File is created!");
    	   } else {
    		   System.out.println("File is already created!");
    	   }
    	  
    	   byte[] contentInBytes = content.getBytes();
    	   
    	   fos.write(contentInBytes);
    	   fos.flush();
    	   fos.close();
    	   
    	   System.out.println("Done!");
    	  
       } catch (IOException e) {
    	   e.printStackTrace();
       }

	}

}
