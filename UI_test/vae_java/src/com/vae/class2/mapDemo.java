package com.vae.class2;

import java.util.HashMap;
import java.util.Map;
public class mapDemo {

	public static void main(String[] args) {
		//1.����map
		Map<Integer, String> map=new HashMap<Integer, String>();
		//2.��������
		map.put(23,"james");
		map.put(24,"koby");
		map.put(3,"vade");
		map.put(11,"yao");
		
		System.out.println(map.toString());
		//3.���б���  
		System.out.println("�б���Ϊ��"+map.size());
		
		System.out.println(map.get(23));
		System.out.println("ͨ��map.keyset����key��vales");
		for(int key:map.keySet())
		{
			System.out.println("");
		}
	}

}
