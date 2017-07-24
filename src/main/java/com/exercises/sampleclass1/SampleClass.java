package com.exercises.sampleclass1;

import com.exercises.timemeasuretool.Timed;

public class SampleClass {
	
	@Timed("myMethod1")
	public void timedMethod() {
		System.out.println("this is a timed method1");
	}
	
}
