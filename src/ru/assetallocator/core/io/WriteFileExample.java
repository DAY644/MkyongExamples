package ru.assetallocator.core.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		File file;
		String content = "This is the next content";
		
		try {
			
			file = new File("d:\\Java\\eclipse\\workspace\\MKyong\\testOutputFile.txt");
			fos = new FileOutputStream(file);
			
			// If file doesnt exists, then create if:
			if ( !file.exists() ) {
				file.createNewFile();
				System.out.println("File is created!");
			} else {
				System.out.println("File is already created!");
			}
			
			byte[] contentInBytes = content.getBytes();
			
			fos.write(contentInBytes);
			fos.flush(); // Не понял зачем.
			fos.close();
			
			System.out.println("Done!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
               if ( fos != null)  {
            	   fos.close();
               }
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}

}
