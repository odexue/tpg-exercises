package com.exercises.sampleclass2; 

import com.exercises.timemeasuretool.Timed;

public class SampleClass2 {
	
	@Timed("myMethod2")
	public void timedMethod(String name) {
		System.out.println("this is a timed method. method name is myMethod2. parameter: " + name);
	}
	
	@Timed("myMethod3")
	public String timedMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("this is a timed method. method name is myMethod3.");
		return "hello";
	}
	
}
