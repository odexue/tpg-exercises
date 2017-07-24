package com.exercises.timemeasuretool;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use this annotation on a method to calculate the time consumed during execution of such method.
 * Methods annotated with Timed.class are processed by MethodTimerProcessor.java
 * @author odexue
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Timed {
	String value();
}
