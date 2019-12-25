package com.system.measurement;

import java.util.HashMap;

import com.system.measurement.Units.Centimeter;
import com.system.measurement.Units.Feet;
import com.system.measurement.Units.Inch;
import com.system.measurement.Units.Meter;
import com.system.measurement.Units.Yard;

public class Converter {
	
	private Unit fromUnit = null;
	private Unit toUnit = null;
	String convertedUnit = null;
	private InputParser inputParser = null;
	
	static final String CENTIMETER = "cm";
    static final String METER = "m";
    static final String YARD = "yd";
    static final String INCH = "in";
    static final String FEET = "ft";
    
	public String convertOutput(String input) {
		inputParser = new InputParser(input);
		
		HashMap<String, Unit> unitMap = new HashMap<>();
		unitMap.put(CENTIMETER, new Centimeter());
		unitMap.put(METER, new Meter());
		unitMap.put(INCH, new Inch());
		unitMap.put(FEET, new Feet());
		unitMap.put(YARD, new Yard());
		
		fromUnit = unitMap.get(inputParser.getFromUnit());
		toUnit = unitMap.get(inputParser.getToUnit());
		convertedUnit = fromUnit.convert(inputParser.getInputValue(), toUnit).toString();
		
		return convertedUnit;
	}
	
	public void printOutput() {
		System.out.println(inputParser.getInputValue().toString() + " " + inputParser.getFromUnit() + " equals " + convertedUnit + " " + inputParser.getToUnit());
	}
	
	
}
