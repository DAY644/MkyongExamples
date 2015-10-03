package ru.assetallocator.core.io;

import java.io.File;

/**
 * 
 * Работает на аинде, но:
 * 
 * Java comes with renameTo() method to rename a file. 
 * However , this method is really platform-dependent: you may successfully rename a file in *nix 
 * but failed in Windows. 
 * So, the return value (true if the file rename successful, false if failed) should always be checked 
 * to make sure the file is rename successful.
 * @author Alexander
 *
 */

public class RenameFileExample {

	public static void main(String[] args) {

		File oldFile = new File("newFile.txt"); 
		File newFile = new File("oldFile.txt");
		
		if ( oldFile.renameTo(newFile) ) {
			System.out.println("Rename succesful!");
		} else {
			System.out.println("Rename failed!");
		}

	}

}
