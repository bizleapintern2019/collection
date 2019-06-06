
/*Write a program that would input a file or a directory and prints its name. If it is a directory, all the contents in the directory should be printed.

e.g.
If it is a file, the output should be:
<FileName>
If it is a directory, the out put should be
<DirName>
--<FileName1>
--<FileName2>
--<DirName2 >
----<FileName3>
----<FileName4>
--<DirName3>*/

package com.bizleap.intern.assignment;
import java.io.File;
public class DirectoryContents {
	
	public void listDirectoryContents(File directory,String indent){
		String[] fileDirectory=directory.list();
		System.out.println(indent+" "+directory.getName());
		if(fileDirectory==null)
			return;
		for(String fileName : fileDirectory){
			File file=new  File(directory,fileName);
			if(file.isDirectory()){
				listDirectoryContents(file,indent+"--");
			}
			else
		        System.out.println(indent+fileName);
		}
	}
	public static void main(String[] args) {
		File directory =new File("E:\\AIDM5\\orderedlist.txt");
		DirectoryContents directorypath=new DirectoryContents();
	    directorypath.listDirectoryContents(directory," ");
	    
	}
}
