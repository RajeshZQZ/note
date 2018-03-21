package com.zentao.uiframework;

public class Locator {
 
	public enum ByType {
		xpath,id,linkText,name,className,cssSelector,partialLinkText,TagName
	}
	private String elementName;
	private String LocatorInfo;
	private int timeOut;
	private ByType byType;
	
	public Locator (String element,int waitSec,ByType byType,String name){
		this.elementName = name;
		this.LocatorInfo = element;
		this.timeOut = waitSec;
		this.byType = byType;
	}

	public String getElementName() {
		return elementName;
	}

	public String getLocatorInfo() {
		return LocatorInfo;
	}

	public int getTimeOut() {
		return timeOut;
	}

	public ByType getBytype() {
		return byType;
	}	
}
