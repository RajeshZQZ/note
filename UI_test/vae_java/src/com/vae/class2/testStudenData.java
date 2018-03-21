package com.vae.class2;

import java.util.ArrayList;
import java.util.List;

public class testStudenData {

	public static void main(String[] args) {
		student stu1=new student(23,"詹姆斯");
		student stu2=new student(24,"科比");
		student stu3=new student(11,"姚明");
		
		List<student> stulist=new ArrayList<student>(); 
        stulist.add(stu1);
        stulist.add(stu2);
        stulist.add(stu3);
        System.out.println();
        for(student s:stulist)
        {
        	System.out.println();
        }
	}

}
