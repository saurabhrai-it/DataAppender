package com.qait.report;

import java.io.File;
import java.io.IOException;
import java.util.regex.*;

import javax.swing.JOptionPane;

public class AlterHtml {

	public static void main(String[] args) {
		
		String regEx = "LoadTestResults_" + args[0] + ".*";
		String tempFile = "";
		Pattern resultFolder = Pattern.compile(regEx);
		Matcher resultFolderFound = null;
		String currDir = System.getProperty("user.dir").toString();
		File baseFolder = new File(currDir);
		File[] fileList = baseFolder.listFiles();
		for(int i =0; i < fileList.length;i++)
		{
			tempFile = fileList[i].getName();
			if(fileList[i].isDirectory())
            resultFolderFound = resultFolder.matcher(tempFile);
            if(resultFolderFound.find()) {
            	JOptionPane.showMessageDialog(null, tempFile);
            	try {
					GetFiles.getFiles(currDir+"\\"+tempFile);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e);;
				}
            	
            }
		}
	}

}
