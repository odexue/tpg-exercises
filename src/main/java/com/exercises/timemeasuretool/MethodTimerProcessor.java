package com.exercises.timemeasuretool;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;

/**
 * 
 * @author odexue
 *
 */
public class MethodTimerProcessor {
	
	private MethodTimerProcessor() {
		
	}
	
	/**
	 * 
	 * Calculates the time consumed by a method in milliseconds. The method to be invoked must be annotated with Timed.class
	 * 
	 * @param methodName named supplied to the annotation
	 * @param methodParams arguments of the method to be invoked
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws InstantiationException
	 */
	public static long annotatedTimedMethodInMillis(String methodName, Object... methodParams) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		long star_time = 0l;
		long end_time = 0l;
		final Reflections reflections = new Reflections(new MethodAnnotationsScanner());
		Set<Method> timedMethods = reflections.getMethodsAnnotatedWith(Timed.class);
		for (final Method method : timedMethods) {
			final Timed annotation = method.getAnnotation(Timed.class);
			if(annotation.value().equalsIgnoreCase(methodName)) {
				star_time = System.currentTimeMillis();
				method.invoke(method.getDeclaringClass().newInstance(), methodParams);
				end_time = System.currentTimeMillis();
			}
		}
		return end_time-star_time;
		
	}
	
	/**
	 * 
	 * Calculates the time consumed by a method in milliseconds. 
	 * 
	 * @param packageClassName must be the complete package and class name
	 * @param methodName is case-sensitive
	 * @param methodParams arguments of the method to be invoked
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 * @throws InstantiationException
	 */
	public static long timedMethodInMillis(String packageClassName, String methodName, Object... methodParams) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException  {
		long star_time = 0l;
		long end_time = 0l;
		Class<?> cl = Class.forName(packageClassName);
		Method[] methods = cl.getMethods();
		
		for(Method method : methods) {
			if(method.getName().equals(methodName)) {
				star_time = System.currentTimeMillis();
				method.invoke(method.getDeclaringClass().newInstance(), methodParams);
				end_time = System.currentTimeMillis();
			}
		}
		return end_time-star_time;
		
	}
	
}






















