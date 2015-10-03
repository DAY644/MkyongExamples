package ru.assetallocator.core.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** 
 * 
 *
 * FileWritter, a character stream to write characters to file. By default, it will replace all the existing content with new content, however, when you specified a true (boolean) value as the second argument in FileWritter constructor, it will keep the existing content and append the new content in the end of the file.

1. Replace all existing content with new content.
new FileWriter(file);

2. Keep the existing content and append the new content in the end of the file.
new FileWriter(file,true);

 * 
 * @author Alexander
 *
 */

public class AppendToFileExample {

	public static void main(String[] args) {
        try {
        	String content = "This content will appent to the end of the file";
        	
        	// ≈сли не указана директори€, то создастс€ в user.dir:
        	File file = new File("tmpFileToAppend.txt");
        	
        	if (!file.exists()) {
        		file.createNewFile();
        		System.out.println("File is created.");
        	}
        	
        	// true = append file
        	FileWriter fw = new FileWriter(file.getName(), true );
        	
        	BufferedWriter bw = new BufferedWriter(fw);
        	
        	bw.write(content);
        	bw.close();
        	
        	System.out.println("Done!");
        	
        } catch (IOException e) {
        	e.printStackTrace();
        }

	}

}
