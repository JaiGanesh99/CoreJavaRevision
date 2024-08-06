package com.java.coreJavaRevision;

public class ConstructorExample {
	
	String name = "Jai";
	
	// No Argument
//	ConstructorExample(){
//		String name1=name;
//		System.out.println(name1);
//	}
//	
	//parameterized
	ConstructorExample(String employee){
		System.out.println(employee);
	}
	
	public static void main(String args[]) {
		ConstructorExample example1 =  new ConstructorExample("Ganesh");
//		ConstructorExample example =  new ConstructorExample();
//		System.err.println(example.name);
		
	}

}
