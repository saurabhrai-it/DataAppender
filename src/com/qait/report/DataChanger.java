package com.qait.report;

public class DataChanger{

	static void dataChanger(String prodLoc, String pn){
		
		String prodName = pn.toUpperCase() + "REPORT";
		String icon = "<link rel=\"icon\" type=\"image/png\" href=\"../../QAminiLogo.ico\" />";
		String headingChange = "<a class=\"navbar-brand\" ><img src=\"../../qaLogo.jpg\" height=\"50px\"  style=\"margin-top:-15px;\"/></a>"
				+ "<a class=\"navbar-brand\" href=\"index.html\"><strong style=\"font-size:1.5em;\" >GLS REPORT</strong></a>";
		
		
		String tempPath = prodLoc + "\\content\\pages";
//		String overTime = tempPath + "\\OverTime.html";
//		String responseTimes = tempPath + "\\ResponseTimes.html";
//		String throughput = tempPath + "\\Throughput.html";
//		String index = "\\index.html";
		String[] pathsOfFile = {tempPath + "\\OverTime.html",tempPath + "\\ResponseTimes.html",tempPath + "\\Throughput.html",prodLoc +"\\index.html"};
		
		for(int temp=0; temp < pathsOfFile.length;temp++)
		{
			
		}		
		
	}
	
}
