package com.vae.class1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class IO_Write 
{

	public static <FileWrite> void main(String[] args)
	{
	String data="pqpqpqp";
	BufferedWriter bw1=null;
	FileWriter f1=null;
	BufferedReader br1=null;
	try
	{
	    f1= new FileWriter("F:\\vae_02.txt");
		bw1=new BufferedWriter(f1);
	    br1=new BufferedReader(new StringReader(data));
	 	String line =null;
		while ((line=br1.readLine())!=null)
		{
			bw1.write(line);
			bw1.flush();
			System.out.println(line);
		}
		System.out.println("文件写入成功！");
	} 
	
	catch (IOException e) 
	{
		System.out.println("文件写入失败"+e);
		e.printStackTrace();
	}

	finally 
	{
		try
		{
			br1.close();
			bw1.close();
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