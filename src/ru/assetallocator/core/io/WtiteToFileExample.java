package ru.assetallocator.core.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WtiteToFileExample {

	public static void main(String[] args) {
		try {
			
			String content1 = "Строка 1, записываемая в файл. This is the content 1 to write into file.";
			String content2 = "Строка 2, записываемая в файл. This is the content 2 to write into file.";
			
			String directory = System.getProperty("user.dir");
			
			File  file = new File (directory + File.separator + "fileToWrite.txt");
			
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File is created!");
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bf = new BufferedWriter(fw);
			
			bf.write(content1);
			// Но перевод строки сам не произойдёт.
			bf.write(content2);
			
			bf.close();
			
			System.out.println("Done!");
			
		} catch (IOException e) {
		    e.printStackTrace();
		}

	}

}
