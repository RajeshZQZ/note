package com.vae.class2;

import java.util.HashMap;
import java.util.Map;
public class mapDemo {

	public static void main(String[] args) {
		//1.定义map
		Map<Integer, String> map=new HashMap<Integer, String>();
		//2.插入数据
		map.put(23,"james");
		map.put(24,"koby");
		map.put(3,"vade");
		map.put(11,"yao");
		
		System.out.println(map.toString());
		//3.求列表长度  
		System.out.println("列表长度为："+map.size());
		
		System.out.println(map.get(23));
		System.out.println("通过map.keyset遍历key和vales");
		for(int key:map.keySet())
		{
			System.out.println("");
		}
	}

}
