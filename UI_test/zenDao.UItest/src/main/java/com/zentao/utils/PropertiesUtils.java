package com.zentao.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
      private static Properties properties = null;
      private static String propertiesFileName ;
      
    @SuppressWarnings("static-access")
    
	public PropertiesUtils (String path){
    	  this.propertiesFileName = path;
      }
       
      public String getPropertiesValue(String keyName){
    	  properties = new Properties();
    	  InputStream in = PropertiesUtils.class.getClassLoader().getResourceAsStream("config/"+propertiesFileName);
    	  String value = null;
    	  try {
			properties.load(in);
			value =properties.getProperty(keyName);
		} catch (IOException e) {
			e.printStackTrace();
		}    
    	  return value;
      }    
}
