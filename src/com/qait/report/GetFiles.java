package com.qait.report;

import java.io.File;

public class GetFiles{

	
	static void getFiles(String fileLoc){
		
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
