package com.uiStudy.testPro;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class readXML {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
	  File xmlfile = new File("F:\\java_dev\\testPro\\test_files\\stu.xml");
	  SAXReader sr = new SAXReader();
	  Document doc = sr.read(xmlfile);
	  
	  Element root = doc.getRootElement();
	  String rootName=root.getName();
	  String root_value =root.attributeValue("name");
	  System.out.println(rootName);
	  System.out.println(root_value);
	  
	  List<Element>  childlist =root.elements();
	  System.out.println(childlist.get(0).getName()+" and "+childlist.get(2).attributeValue("age"));
	  System.out.println(childlist.get(1).getText()+" and "+childlist.get(3).attributeValue("name"));
	  
	  List<Element> stus =root.elements("stub");
	  for(Element stu:stus)
	  {
		  System.out.println(stu.getName());
		  System.out.println(stu.getText());	
		  System.out.println(stu.attributeValue("name"));
		  System.out.println(stu.attributeValue("age"));
	  }
	}
}
