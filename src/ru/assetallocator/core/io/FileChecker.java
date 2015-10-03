package ru.assetallocator.core.io;

import java.io.FilenameFilter;
import java.io.File;


/** 
 * How to delete files with certain extension only
 * @author Alexander
 *
 */
public class FileChecker {

	private static final String FILE_DIR = System.getProperty("user.dir");
	private static final String FILE_TEXT_EXT = ".txt";
	
	public static void main(String[] args) {

        new FileChecker().deleteFile(FILE_DIR, FILE_TEXT_EXT); 
        
	}
	
	public void deleteFile(String folder, String ext) {
		
		GenericExtFilter filter = new GenericExtFilter(ext); 
		
		// Нацеливаемся на директорию:
		File dir = new File(folder);
		
		String[] listFiles = dir.list(filter);
		
		if (listFiles.length == 0) return;
		
		//============
		File fileDelete;
		
		for (String file : listFiles) {
			
			String temp  = new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
			fileDelete = new File(temp);
			
			boolean isDeleted = fileDelete.delete();
			System.out.println("file : "+fileDelete.getAbsolutePath() +" is deleted : "+ isDeleted);
		}
		
	}
	
	// Надо имплеменцировать интерфейс FilenameFilter, т.к  File.list( FilenameFilter ).
	public class GenericExtFilter implements FilenameFilter {
		
		private String ext;
		
		public GenericExtFilter(String ext) {
			this.ext = ext;
		}
		
		public boolean accept(File dir, String name){
			return (name.endsWith(ext));
			
		}
	}

}
