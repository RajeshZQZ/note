package com.vae.class2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		int i;
		//1.�½�һ��list
		List<String> list1=new ArrayList<String>();
		//2.��list��������
		list1.add("q");
		list1.add("s");
		list1.add("d");
		list1.add("f");
		list1.add("g");
		System.out.println(list1.toString());
		//3.���б���  
		System.out.println("�б���Ϊ��"+list1.size());
		
		//4.1 ͨ���±��ȡ����
		for (i=0;i<list1.size();i++)
		{
			System.out.print(list1.get(i));
		}
		System.out.print("\n");
		//4.2 ʹ��forѭ������
		for (String list:list1)
		{
			System.out.print("``"+list);
		}
		//5.�Ƴ����� ���ַ���
		  
		    	list1.remove("s");
		    	list1.remove(list1.get(0));
		    	for (String list:list1)
				{
					System.out.print("~!@"+list);
				}
		//6.����Ƿ����
			if (list1.contains("f"))
	    	{
				System.out.println("\n"+"f����");
	    	}
			else {
				System.out.println("\n"+"f������");
			}
		//7.���Ƶ�һ���½���������
		String[] name =new String [list1.size()];
		list1.toArray(name);
		for (String sn:name)
		{
			System.out.print("-+-+-"+sn);
		}
		//8.�������
		list1.clear();
		System.out.println("\n"+list1.toString());
}

}
