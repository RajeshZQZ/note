package com.vae.Utils;

import java.io.File;
import java.io.IOException;

public class test_File {

	public static void main(String[] args) 
	{
		test_File t1=new test_File();
		t1.creat_File("F:\\dyx is a pig.txt");
		t1.delete_File("F:\\dyx is a pig.txt");
	}
	public void creat_File(String File_name)
	{
		File myFile =new File (File_name);
		try
		{
			if (!myFile.exists())
			{
				myFile.createNewFile();
				System.out.println("文件创建成功!\n"+"文件名为："+myFile);
			}
			else
			{
				System.out.println("文件已经存在!");
			}
		}
			catch (IOException e) 
			{  
                System.out.println("文件创建失败!");
 			}   
     }
	
	public void delete_File(String File_name)
	{
		File myFile =new File (File_name);
		try
		{
			if (myFile.delete())
			{
				System.out.println("文件"+ myFile+"删除成功!\n");
			}
			else
			{
				System.out.println("文件删除失败!");
			}
		}
			catch (Exception e) 
			{  
                System.out.println("文件删除失败!");
 			}   
   }
}

	