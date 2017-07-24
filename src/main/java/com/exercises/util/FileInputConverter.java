package com.exercises.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInputConverter {
	
	private FileInputConverter() {
		
	}
	
	public static List<String> convertFileInput(String filePath) throws FileNotFoundException,IOException {
		List<String> inputList = new ArrayList<>();
		String perLine = null;
		try(BufferedReader buff = new BufferedReader(new FileReader(filePath))){
			while((perLine = buff.readLine()) != null) {
				inputList.add(perLine);
			}
		}
		return inputList;
	}
	
	public static String[] convertFileInputArr(String filePath) throws FileNotFoundException,IOException {
		List<String> inputList = new ArrayList<>();
		String perLine = null;
		try(BufferedReader buff = new BufferedReader(new FileReader(filePath))){
			while((perLine = buff.readLine()) != null) {
				inputList.add(perLine);
			}
		}
		return (String[]) inputList.toArray();
	}
}










