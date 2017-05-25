package com.qait.report;

public class DataChanger implements AppendData {

	static void dataChanger(String prodLoc){
		
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
