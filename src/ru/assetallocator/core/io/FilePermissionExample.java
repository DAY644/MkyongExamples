package ru.assetallocator.core.io;

import java.io.File;
import java.io.IOException;

public class FilePermissionExample {

	/**
	 * Что-то тут файл не сохраняет заданные свойства!
	 * @param args
	 */
	public static void main(String[] args) {
        try {
		     String fileName = "permissionFile2.txt";
		     String workingDirectory = System.getProperty("user.dir");
		     String finalFilePath = workingDirectory + File.separator + fileName;
		
             System.out.println("workingDirectory = "+workingDirectory);

             File file = new File( finalFilePath );
             
             if (file.exists()) {
            	 System.out.println("File exists:");
            	 System.out.println("  Is read allow : "   + file.canRead());
            	 System.out.println("  Is write allow : "   + file.canWrite());
            	 System.out.println("  Is execute allow : "   + file.canExecute());
             }  else {
            	 System.out.println("File not exists.");
             }
		
             file.setExecutable(false);
             file.setReadable(false);
             file.setWritable(false);
                          
        	 System.out.println("  Is read allow : "   + file.canRead());
        	 System.out.println("  Is write allow : "   + file.canWrite());
        	 System.out.println("  Is execute allow : "   + file.canExecute());

        	 if (file.createNewFile()) {
        		 System.out.println("File is created.");
        		 
        	 } else {
        		 System.out.println("File is already created.");
        	 }
		
        } catch (IOException e) {
        	e.printStackTrace();
        }
		
	}

}
