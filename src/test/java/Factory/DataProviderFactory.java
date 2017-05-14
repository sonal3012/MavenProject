package Factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;

public  class DataProviderFactory{
	 
	 public static ConfigDataProvider getConfig(){
		 
	ConfigDataProvider configdata = new ConfigDataProvider();
	return configdata;
		 
	 }
	 
	 public static ExcelDataProvider getexcel(){
		 
		 ExcelDataProvider exceldata =new ExcelDataProvider();
		 return exceldata ;
	 }
 }