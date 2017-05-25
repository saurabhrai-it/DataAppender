package com.qait.report;

import java.io.File;
import java.io.IOException;

public class GetFiles{

	
	static void getFiles(String fileLoc) throws IOException{
		
		String tempFileName ="";
		File productFolderLoc = new File(fileLoc);
		File[] productFolders = productFolderLoc.listFiles();
		for(int i =0; i < productFolders.length;i++)
		{
			tempFileName = productFolders[i].getName();
			DataChanger.dataChanger(fileLoc+"\\"+tempFileName,tempFileName);
		}
	}
}
