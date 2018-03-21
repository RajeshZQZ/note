package com.Utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class read_properties {

	public static void main(String[] args) throws IOException {
    
   InputStream in = read_properties.class.getClassLoader().getResourceAsStream("local.properties");
   Properties p = new Properties();
   p.load(in);
   String name =p.getProperty("stu_name");
   System.out.println(name);
   in.close();
   String age =p.getProperty("stu_age");
   System.out.println(age);
	}
}
