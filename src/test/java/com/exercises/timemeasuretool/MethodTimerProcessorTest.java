package com.exercises.timemeasuretool;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class MethodTimerProcessorTest {
	
	//TEST METHODS EXIST IN com.exercises.sampleclass1 AND com.exercises.sampleclass2
	private final String methodName3 = "myMethod3";
	
	@Test
	public void annotatedTimedMethodInMillisTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		long myMethod3Time = MethodTimerProcessor.annotatedTimedMethodInMillis(methodName3);
		assertTrue(myMethod3Time == 1000l || myMethod3Time < 2000l);
		
	}
	
	@Test
	public void timedMethodInMillisTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, ClassNotFoundException {
		long myMethod3Time = MethodTimerProcessor.timedMethodInMillis("com.exercises.sampleclass1.SampleClass", "timedMethodNoAnnotation");
		assertTrue(myMethod3Time == 1000l || myMethod3Time < 2000l);
	}

}
