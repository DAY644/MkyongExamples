package ru.assetallocator.core.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * try-with-resources   JDK7
 * @author Alexander
 *
 */
public class BufferedReaderExampleJDK7 {

	public static void main(String[] args) {
        // try-with-resources   JDK7:
		try (BufferedReader br = new BufferedReader(new FileReader( "d:\\Java\\eclipse\\workspace\\MKyong\\bufferedInputStreamTest.txt" ) )) 
		{
			
			String sCurrentLine;
			
			while ( ( sCurrentLine = br.readLine() ) != null) {
				System.out.println( sCurrentLine );
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
