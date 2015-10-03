package ru.assetallocator.core.io;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {
	
	public static void main(String[] args ){
		try {
			File file = new File("d:\\Java\\#Work\\tmp\\newFile.txt");
					
			if (file.createNewFile() ) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
