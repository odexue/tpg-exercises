package com.exercises.ipvalidation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex implements IPValidation {
	
	private static final String VALID_IP_PATTERN = 
			"\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
	
	public boolean validateIP(String input) {
		Pattern pat = Pattern.compile(VALID_IP_PATTERN);
		Matcher mat = pat.matcher(input);
		if(mat.matches()) {
			return true;
		}
		return false;
	}

	@Override
	public List<String> invalidIPs(List<String> inputList) {
		List<String> validIps = new ArrayList<>();
		for(String element : inputList) {
			if(validateIP(element)) {
				validIps.add(element);
			}
		}
		inputList.removeAll(validIps);
		return inputList;
	}

}
