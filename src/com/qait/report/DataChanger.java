package com.qait.report;

import java.io.*;

public class DataChanger {

	static void dataChanger(String prodLoc, String pn) throws IOException{
		
		String prodName = pn.toUpperCase() + "REPORT";
		String oldProdName = "<title>Apache JMeter Dashboard</title>";
		String icon = "<link rel=\"icon\" type=\"image/png\" href=\"../../QAminiLogo.ico\" />";
		String oldIcon = "<link rel=\"icon\" type=\"image/png\" href=\"content/pages/icon-apache.png\" />";
		String headingChange = "<a class=\"navbar-brand\" ><img src=\"../../qaLogo.jpg\" height=\"50px\"  style=\"margin-top:-15px;\"/></a>"
				+ "<a class=\"navbar-brand\" href=\"index.html\"><strong style=\"font-size:1.5em;\" >GLS REPORT</strong></a>";
		String oldHeadingChange = "<a class=\"navbar-brand\" href=\"index.html\">Apache JMeter Dashboard</a>";
		
		String s;
		String tempPath = prodLoc + "\\content\\pages";
//		String overTime = tempPath + "\\OverTime.html";
//		String responseTimes = tempPath + "\\ResponseTimes.html";
//		String throughput = tempPath + "\\Throughput.html";
//		String index = "\\index.html";
		String[] pathsOfFile = {tempPath + "\\OverTime.html",tempPath + "\\ResponseTimes.html",tempPath + "\\Throughput.html",prodLoc +"\\index.html"};
		
		 // Open reader and writer
	    FileWriter writer = null;
	    FileReader fileReader = null;
	    BufferedReader bufferedReader = null;
		
		for(int temp=0; temp < pathsOfFile.length;temp++)
		{
			writer = new FileWriter(pathsOfFile[temp]);
			fileReader = new FileReader(pathsOfFile[temp]);
			bufferedReader = new BufferedReader(fileReader);
			while((s=bufferedReader.readLine())!=null)
			{
				if(s.contains(oldProdName))
					s = s.replace(oldProdName, prodName);
				else if(s.contains(oldIcon))
					s = s.replace(oldIcon, icon);
				else if(s.contains(oldHeadingChange))
					s = s.replace(oldHeadingChange, headingChange);
				writer.write(s);
				bufferedReader.close();
			}
			fileReader.close();
			writer.close();
			
		}		
		
	}
	
}
