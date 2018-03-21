package com.vae.class2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection schools =new HashSet<>();
		schools.add("中南大学");
		schools.add("湖南大学");
		schools.add("湘潭大学");
		schools.add("第一师范");

    Iterator IT=schools.iterator();
    while (IT.hasNext())
    {
    	String school =(String)IT.next();
    	System.out.println(school);
    	if (school.contains("湘潭大学"))
    	{
    		IT.remove();
    	}
    }
    System.out.println(schools.toString());
    
    String[] S1=(String[])schools.toArray(new String[0]);
    for (String s:S1)
    {
    	System.out.println(s);
    }
	}

}
