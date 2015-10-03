package ru.assetallocator.core.io;

import java.io.File;

public class DeleteFileExample {

	public static void main(String[] args) {
        try {
        	String dir = System.getProperty("user.dir");
        	
        	File file = new File(dir+ File.separator + "fileToDelete.txt");
        	
        	if (file.delete()) {
        		System.out.println("File "+ file.getAbsolutePath() + " is deleted!");
        	} else {
        		System.out.println("Delete operation is failed!");
        	}
        	
        } catch (Exception e) {
        	e.printStackTrace();
        }

	}

}
