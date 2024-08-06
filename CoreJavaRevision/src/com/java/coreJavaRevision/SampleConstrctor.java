package com.java.coreJavaRevision;

public class SampleConstrctor {
	
	SampleConstrctor(){
		System.out.println("Balaji");
	}
	
	SampleConstrctor(String jai){
		System.out.println(jai);
	}
	
	void sample() {
		System.out.println("Sample");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SampleConstrctor constructor = new SampleConstrctor();
     SampleConstrctor constructor1 = new SampleConstrctor("Jai");
     constructor1.sample();
	}

}
