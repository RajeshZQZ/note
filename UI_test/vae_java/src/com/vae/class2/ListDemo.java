package com.vae.class2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		int i;
		//1.新建一个list
		List<String> list1=new ArrayList<String>();
		//2.往list插入数据
		list1.add("q");
		list1.add("s");
		list1.add("d");
		list1.add("f");
		list1.add("g");
		System.out.println(list1.toString());
		//3.求列表长度  
		System.out.println("列表长度为："+list1.size());
		
		//4.1 通过下标读取数据
		for (i=0;i<list1.size();i++)
		{
			System.out.print(list1.get(i));
		}
		System.out.print("\n");
		//4.2 使用for循环遍历
		for (String list:list1)
		{
			System.out.print("``"+list);
		}
		//5.移除数据 两种方法
		  
		    	list1.remove("s");
		    	list1.remove(list1.get(0));
		    	for (String list:list1)
				{
					System.out.print("~!@"+list);
				}
		//6.检查是否包含
			if (list1.contains("f"))
	    	{
				System.out.println("\n"+"f存在");
	    	}
			else {
				System.out.println("\n"+"f不存在");
			}
		//7.复制到一个新建的数组中
		String[] name =new String [list1.size()];
		list1.toArray(name);
		for (String sn:name)
		{
			System.out.print("-+-+-"+sn);
		}
		//8.清除数据
		list1.clear();
		System.out.println("\n"+list1.toString());
}

}
