package com.system.measurement;

public class Converter {
	
	private Unit fromUnit = null;
	private String toUnit = null;
	String convertedUnit = null;
	private InputParser inputParser = null;
    
	public String convertOutput(String input) {
		inputParser = new InputParser(input);
		UnitFactory unitFactory = new UnitFactory();

		fromUnit = unitFactory.createUnit(inputParser.getFromUnit());
		toUnit = inputParser.getToUnit();
		convertedUnit = fromUnit.convert(inputParser.getInputValue(), toUnit).toString();
		
		return convertedUnit;
	}
	
	public void printOutput() {
		System.out.println(inputParser.getInputValue().toString() + " " + inputParser.getFromUnit() + " equals " + convertedUnit + " " + inputParser.getToUnit());
	}
	
	
}
