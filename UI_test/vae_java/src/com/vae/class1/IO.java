package com.vae.class1;

import java.io.BufferedReader;
import java.io.FileReader;


public class IO {

	public static void main(String[] args) 
	{
		FileReader f1=null;
		BufferedReader b1=null;
		
		try 
		{
			f1=new FileReader("F:\\vae_01");
			b1=new BufferedReader(f1);
			String line=null;
			while ((line =b1.readLine())!=null)
			{
				System.out.println(line);
			}
			System.out.println("文件读取成功！");
	    } 
		catch (Exception e) 
		{
			System.out.println("文件读取失败!"+e);
		}
		finally {
			try
			{
				b1.close();
				f1.close();
				System.out.println("文件关闭成功!");
			}
			catch(Exception e)
			{
				System.out.println("文件关闭失败!"+e);	
			}
		}

	}

}
