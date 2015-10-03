package ru.assetallocator.core.io;

import java.io.File;
import java.io.IOException;

public class FilePathExample3 {

	
	/**  !!! Not recommend !!! Just for fun !!!
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		try {
			String fileName = "newFile3.txt";
			String workDir = System.getProperty("user.dir");
			String absolutFilePath = "";
			
			String your_os = System.getProperty("os.name");
			System.out.println("your_os = "+ your_os);
			your_os = your_os.toLowerCase();
			System.out.println("your_os.toLowerCase() = "+ your_os);
			
			if (your_os.indexOf("win") >= 0 ) {
				absolutFilePath = workDir + "\\" + fileName;  
			} else if (your_os.indexOf("nix") >= 0) {
				absolutFilePath = workDir + "/" + fileName;
			} else {
				System.out.println("Unknow os!");
				absolutFilePath = workDir + "/" + fileName;		
			}
			
			System.out.println("Final filepath : " + absolutFilePath);
			
			File file = new File(absolutFilePath);
			
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File is already exists!");	
			}
		} catch (IOException e ){
			e.printStackTrace();
		}
	}
}
