package com.exercises.ipvalidation;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.exercises.util.FileInputConverter;

public class IPValidationRegexTest {
	
	private IPValidationRegex ipValidationRegex;
	
	private final String inputFile = "/files/ipaddresses.txt";
	
	@Before
	public void setup() {
		ipValidationRegex = new IPValidationRegex();
	}
	
	@Test
	public void invalidIPsTest() throws URISyntaxException {
		URL url = IPValidationRegexTest.class.getResource(inputFile);
		Path urlPath = Paths.get(url.toURI());
		List<String> inputList = null;
		try {
			inputList = FileInputConverter.convertFileInput(urlPath.toFile().getAbsolutePath());
			assertTrue(inputList.size() != 0);
			for(String element : inputList) {
				System.out.println(element);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		inputList = ipValidationRegex.invalidIPs(inputList);
		assertTrue(inputList.size() == 5);
	}
	
	@Test
	public void validateIPTest() throws URISyntaxException {
		
		String input = "255.255.000.255";
		assertTrue(ipValidationRegex.validateIP(input));
	}

}
