package ru.assetallocator.core.io;

import java.io.File;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;


/** !!! deprecated!!!
 *   
 * @author Alexander
 *
 */

public class BufferedInputStreamExample {

	public static void main(String[] args) {

		File file = new File("d:\\Java\\eclipse\\workspace\\MKyong\\bufferedInputStreamTest.txt");
          FileInputStream     fis = null; // раз
            BufferedInputStream bis = null; // два
              DataInputStream     dis = null; // три
		
		try {
			
			fis = new FileInputStream(file);
			  bis = new BufferedInputStream(fis);
			    dis = new DataInputStream(bis); 
			
			while ( dis.available() != 0 ) {   
				System.out.println("dis.readLine() = "+dis.readLine());  // deprecated!!!
			}
		} catch (IOException e1){
			e1.printStackTrace();
		} finally {
			try {
				fis.close();
				bis.close();
				dis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}
