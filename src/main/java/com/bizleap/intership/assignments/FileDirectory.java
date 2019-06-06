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
package com.bizleap.intership.assignments;

import java.io.File;

public class FileDirectory {
	
    public void findDirectory(File directoryName, String indent) {
    	
        indent+="--";
        if(directoryName==null) {
        	System.out.println("");
        	return;
        }
        for (File file : directoryName.listFiles()) {
        	if (file.isFile()) {
        		System.out.println(indent +file.getName());
        	}
        	else {
        		System.out.println(indent+file.getName());
        		findDirectory(file, indent);
        	}
        }
        
    }
   
    public static void main (String[] args) {
    	File directoryName=new File("D:\\oca");
    	System.out.println(directoryName.toString());
        new FileDirectory().findDirectory(directoryName," ");     
    }
}