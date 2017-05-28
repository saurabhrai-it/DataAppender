package com.qait.report;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataChanger {

	static void dataChanger(String prodLoc, String pn) throws IOException{
		
		String prodName ="<title>"+ pn.toUpperCase() + " REPORT</title>";
		String oldProdName = "<title>Apache JMeter Dashboard</title>";
		String icon = "<link rel=\"icon\" type=\"image/png\" href=\"../../QAminiLogo.ico\" />";
		String iconInner = "<link rel=\"icon\" type=\"image/png\" href=\"../../../../QAminiLogo.ico\" />";
		String oldIcon = "<link rel=\"icon\" type=\"image/png\" href=\"content/pages/icon-apache.png\" />";
		String oldIconInner = "<link rel=\"icon\" type=\"image/png\" href=\"icon-apache.png\" />";
		String headingChange = "<a class=\"navbar-brand\" ><img src=\"../../qaLogo.jpg\" height=\"50px\"  style=\"margin-top:-15px;\"/></a>"
				+ "<a class=\"navbar-brand\" href=\"index.html\"><strong style=\"font-size:1.5em;\" >"+pn.toUpperCase()+" REPORT</strong></a>";
		String headingChangeInner = "<a class=\"navbar-brand\" ><img src=\"../../../../qaLogo.jpg\" height=\"50px\"  style=\"margin-top:-15px;\"/></a>"
				+ "<a class=\"navbar-brand\" href=\"../../index.html\"><strong style=\"font-size:1.5em;\" >"+pn.toUpperCase()+" REPORT</strong></a>";
		String oldHeadingChange = "<a class=\"navbar-brand\" href=\"index.html\">Apache JMeter Dashboard</a>";
		String oldHeadingChangeInner = "<a class=\"navbar-brand\" href=\"../../index.html\">Apache JMeter Dashboard</a>";
		
		String tempPath = prodLoc + "\\content\\pages";
		String[] pathsOfFile = {tempPath + "\\OverTime.html",tempPath + "\\ResponseTimes.html",tempPath + "\\Throughput.html",prodLoc +"\\index.html"};
		
		 // Open reader and writer
	    List<String> lines = null;
	    String line = null;
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        
		for(int temp=0; temp < pathsOfFile.length;temp++)
		{
			lines = new ArrayList<String>();
			file = new File(pathsOfFile[temp]);
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {

				if(temp<3){
					
					if (line.contains(oldProdName))
		                line = line.replace(oldProdName,prodName);
		            else if (line.contains(oldIconInner))
		                line = line.replace(oldIconInner,iconInner);
		            else if (line.contains(oldHeadingChangeInner))
		            	line = line.replace(oldHeadingChangeInner,headingChangeInner);
		            }
				
				else{
					
					if (line.contains(oldProdName))
		                	line = line.replace(oldProdName,prodName);
		            else if (line.contains(oldIcon))
			                line = line.replace(oldIcon,icon);
		            else if (line.contains(oldHeadingChange))
		            		line = line.replace(oldHeadingChange,headingChange);
		                
		            }

	             lines.add(line);
	             lines.add("\n");
				}
	            
			fileReader.close();
	        bufferedReader.close();
			
	        fileWriter =new FileWriter(file);
	        bufferedWriter = new BufferedWriter(fileWriter);
	        for(String s : lines)
	        	bufferedWriter.write(s);
	        bufferedWriter.flush();
	        bufferedWriter.close();
		}				
	}
	
}
