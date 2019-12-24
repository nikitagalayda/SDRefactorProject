package com.system.measurement;

import java.math.BigDecimal;

import com.system.measurement.Units.Centimeter;
import com.system.measurement.Units.Feet;
import com.system.measurement.Units.Inch;
import com.system.measurement.Units.Meter;
import com.system.measurement.Units.Yard;

public class Converter {
	
	private Unit fromUnit = null;
	BigDecimal convertedUnit = null;
	private InputParser inputParser = null;
	
	static final String CENTIMETER = "cm";
    static final String METER = "m";
    static final String YARD = "yd";
    static final String INCH = "in";
    static final String FEET = "ft";
    
	public String convertOutput(String input) {
		inputParser = new InputParser(input);
	    
	    if(inputParser.getFromUnit().equals(CENTIMETER)) {
			fromUnit = new Centimeter();
		}
	    else if(inputParser.getFromUnit().equals(FEET)) {
			fromUnit = new Feet();
		}
	    else if(inputParser.getFromUnit().equals(INCH)) {
			fromUnit = new Inch();
		}
	    else if(inputParser.getFromUnit().equals(YARD)) {
			fromUnit = new Yard();
		}
	    else if(inputParser.getFromUnit().equals(METER)) {
			fromUnit = new Meter();
		}
	    
	    if(inputParser.getToUnit().equals(CENTIMETER)) {
	    		convertedUnit = fromUnit.toCm(inputParser.getInputValue());
		}
	    else if(inputParser.getToUnit().equals(FEET)) {
			convertedUnit = fromUnit.toFeet(inputParser.getInputValue());
		}
	    else if(inputParser.getToUnit().equals(INCH)) {
			convertedUnit = fromUnit.toInch(inputParser.getInputValue());
		}
	    else if(inputParser.getToUnit().equals(YARD)) {
			convertedUnit = fromUnit.toYard(inputParser.getInputValue());
		}
	    else if(inputParser.getToUnit().equals(METER)) {
			convertedUnit = fromUnit.toMeter(inputParser.getInputValue());
		}
	    return convertedUnit.toString();
	}
	
	public void printOutput() {
		System.out.println(inputParser.getInputValue().toString() + " " + inputParser.getFromUnit() + " equals " + convertedUnit.toString() + " " + inputParser.getToUnit());
	}
	
	
}
