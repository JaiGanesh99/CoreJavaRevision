package com.java.coreJavaRevision;

public class ExampleConstr {
	
	void method() {
		System.err.println("Method");
	}
	
	ExampleConstr(String value){
		System.out.println("Parameterized");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ExampleConstr constr =  new ExampleConstr();
		ExampleConstr constr1 =  new ExampleConstr("vvyuvu");
		
	}

}
