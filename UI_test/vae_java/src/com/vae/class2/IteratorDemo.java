package com.vae.class2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection schools =new HashSet<>();
		schools.add("���ϴ�ѧ");
		schools.add("���ϴ�ѧ");
		schools.add("��̶��ѧ");
		schools.add("��һʦ��");

    Iterator IT=schools.iterator();
    while (IT.hasNext())
    {
    	String school =(String)IT.next();
    	System.out.println(school);
    	if (school.contains("��̶��ѧ"))
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
