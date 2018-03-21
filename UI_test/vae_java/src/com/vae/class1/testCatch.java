package com.vae.class1;

public class testCatch {

	public static void main(String[] args) throws Exception 
	{
	testCatch t1=new testCatch();
    System.out.println(t1.getName1());
    System.out.println(t1.getName2());
    System.out.println(t1.getName3());
    
	}

	public String getName1 ()
	{
		String name ="vae";
		String ss=name.substring(2);
		return ss;
	}
	
	public String getName2()
	{
		String ss=null;
		try 
		{
			String name ="vae";
			ss=name.substring(5);
			
		}catch (Exception e)
		{
			System.out.println("±¨´í"+e);
		}finally{
		}
		return ss;
	}

public String getName3() throws Exception
{
	    String ss=null;
		String name ="vae";
		ss=name.substring(1);
		return ss;
}

}
