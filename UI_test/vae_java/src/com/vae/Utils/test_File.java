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
				System.out.println("�ļ������ɹ�!\n"+"�ļ���Ϊ��"+myFile);
			}
			else
			{
				System.out.println("�ļ��Ѿ�����!");
			}
		}
			catch (IOException e) 
			{  
                System.out.println("�ļ�����ʧ��!");
 			}   
     }
	
	public void delete_File(String File_name)
	{
		File myFile =new File (File_name);
		try
		{
			if (myFile.delete())
			{
				System.out.println("�ļ�"+ myFile+"ɾ���ɹ�!\n");
			}
			else
			{
				System.out.println("�ļ�ɾ��ʧ��!");
			}
		}
			catch (Exception e) 
			{  
                System.out.println("�ļ�ɾ��ʧ��!");
 			}   
   }
}

	