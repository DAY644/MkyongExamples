package ru.assetallocator.core.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			String sCurrentLine;
			
			br = new BufferedReader( new FileReader("d:\\Java\\eclipse\\workspace\\MKyong\\bufferedInputStreamTest.txt") );
			
			while (  (sCurrentLine = br.readLine()) != null  ) {
				System.out.println( sCurrentLine );
			}
				
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				
				if ( br != null )  br.close();
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
			
		}

	}

}
