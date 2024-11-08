package com.tnsif.daysix.staticblockmethod;

public class MyClass {
	private int section ; //non-static or instance variable
	private static int srNo;
	static
	{
		System.out.println("-----------Within Static Block---------");
		srNo=1000;
	}
	
	//default constructor
	MyClass()
	{
		System.out.println("--------------Within Default Constructor-----------");
		srNo++;
		section++;		
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
	static void display() 
	{
	//	System.out.println("Section : "+section); //can't access non static members	
		System.out.println("Serial No. "+srNo); 
	}
}

