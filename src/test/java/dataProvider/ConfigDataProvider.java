package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider{
	
	Properties prop;
	
	public ConfigDataProvider(){
		
		try{
		
		File cfg = new File("./Configuration/config.properties");
		FileInputStream fsi = new FileInputStream(cfg);
		prop = new Properties();
		prop.load(fsi);
	}
	
	catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	   public String getChromePath(){
	    	String path = prop.getProperty("ChromeDriver");
	    	
	    	return path;
	    }
	    
	    public String getApplicationUrl(){
	    	String url = prop.getProperty("URL");
	    	
	    	return url;
	    }
		
	}