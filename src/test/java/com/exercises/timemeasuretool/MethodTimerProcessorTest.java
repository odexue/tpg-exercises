package com.exercises.timemeasuretool;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class MethodTimerProcessorTest {
	
	//TEST METHODS EXIST IN com.exercises.sampleclass1 AND com.exercises.sampleclass2
	private final String methodName3 = "myMethod3";
	
	@Test
	public void timedMethodInNanoTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		long myMethod3Time = MethodTimerProcessor.timedMethodInMillis(methodName3);
		assertTrue(myMethod3Time == 1000l);
	}

}
