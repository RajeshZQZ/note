package com.vae.class2;

import java.util.ArrayList;
import java.util.List;

public class testStudenData {

	public static void main(String[] args) {
		student stu1=new student(23,"ղķ˹");
		student stu2=new student(24,"�Ʊ�");
		student stu3=new student(11,"Ҧ��");
		
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
