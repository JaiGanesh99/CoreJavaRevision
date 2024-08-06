package com.java.coreJavaRevision;

public class ReturnExample {

	int a=10;
	ReturnExample(){
		
	}
	
	public int returningValue() {
		System.out.println(a);
		return a;
	}
	
	public static void main(String args[]) {
		ReturnExample constructor = new ReturnExample();
		int a = constructor.returningValue();
		System.err.println(a);
		
	}
	
	
}

