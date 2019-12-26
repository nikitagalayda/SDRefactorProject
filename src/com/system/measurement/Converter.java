package com.system.measurement;

public class Converter {
	
	private Unit fromUnit = null;
	private Unit toUnit = null;
	String convertedUnit = null;
	private InputParser inputParser = null;
    
	public String convertOutput(String input) {
		inputParser = new InputParser(input);
		UnitFactory unitFactory = new UnitFactory();

		fromUnit = unitFactory.createUnit(inputParser.getFromUnit());
		toUnit = unitFactory.createUnit(inputParser.getToUnit());
		convertedUnit = fromUnit.convert(inputParser.getInputValue(), toUnit).toString();
		
		return convertedUnit;
	}
	
	public void printOutput() {
		System.out.println(inputParser.getInputValue().toString() + " " + inputParser.getFromUnit() + " equals " + convertedUnit + " " + inputParser.getToUnit());
	}
	
	
}
