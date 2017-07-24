package com.exercises.ipvalidation;

import java.util.List;

public interface IPValidation {
	public boolean validateIP(String input);
	public List<String> invalidIPs(List<String> inputList);
}
