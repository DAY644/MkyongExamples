package ru.assetallocator.core.io;

import java.io.File;
import java.io.FilenameFilter;

/**
 * How to find files with certain extension only.
 * @author Alexander
 *
 */
public class FindCertainExtension {

	private static final String FILE_DIR = System.getProperty("user.dir");
	private static final String FILE_TEXT_EXT = ".jpg";
	
	public static void main(String[] args) {
		new FindCertainExtension().listFile(FILE_DIR, FILE_TEXT_EXT);
		
	}

	public void listFile( String folder, String ext){
		
		GenericExtFilter filter = new GenericExtFilter(ext);
		
		File dir = new File(folder);
		
		if(dir.isDirectory()==false){
			System.out.println("Directory does not exists : " + FILE_DIR);
			return;
		}
		
		// list out all the file name and filter by the extension
		String[] list = dir.list(filter);

		if (list.length == 0) {
			System.out.println("no files end with : " + ext);
			return;
		}

		for (String file : list) {
			String temp = new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
			System.out.println("file : " + temp);
		}		
		
	}
	
	// ���� ���������������� ��������� FilenameFilter, �.�  File.list( FilenameFilter ).
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
