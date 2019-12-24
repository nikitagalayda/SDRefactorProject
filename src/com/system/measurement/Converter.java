package com.system.measurement;

import java.math.BigDecimal;

import com.system.measurement.Units.Centimiter;
import com.system.measurement.Units.Feet;
import com.system.measurement.Units.Inch;
import com.system.measurement.Units.Meter;
import com.system.measurement.Units.Yard;


/**
 * 
 * @author adeel ahmad
 *
 */
public class Converter {
	
	private MyObject object = new MyObject();
	private BigDecimal result = null;
	private BigDecimal length = null;
	private Unit fromUnit = null;
	static final String CENTIMETER = "cm";
    static final String METER = "m";
    static final String YARD = "yd";
    static final String INCH = "in";
    static final String FEET = "ft";
    
	public String convertOutput(String input) {
	    parseInput(input);
	    
	    if(object.getFromUnit().equals(CENTIMETER)) {
			fromUnit = new Centimiter();
		}else if(object.getFromUnit().equals(FEET)) {
			fromUnit = new Feet();
		}else if(object.getFromUnit().equals(INCH)) {
			fromUnit = new Inch();
		}else if(object.getFromUnit().equals(YARD)) {
			fromUnit = new Yard();
		}else if(object.getFromUnit().equals(METER)) {
			fromUnit = new Meter();
		}
	    
	    if(object.getToUnit().equals(CENTIMETER)) {
	    		return fromUnit.toCm(length).toString();
		}else if(object.getToUnit().equals(FEET)) {
			return fromUnit.toFeet(length).toString();
		}else if(object.getToUnit().equals(INCH)) {
			return fromUnit.toInch(length).toString();
		}else if(object.getToUnit().equals(YARD)) {
			return fromUnit.toYard(length).toString();
		}else if(object.getToUnit().equals(METER)) {
			return fromUnit.toMeter(length).toString();
		}
		else {
			return fromUnit.toMeter(length).toString();
		}
	}
	
	private void parseInput(String input) {
		String[] extracted = input.split("\\s+");
		if(extracted.length == 4) {
			object.setLength(extracted[0]);
			object.setFromUnit(extracted[1]);
			object.setToUnit(extracted[3]);
			length = new BigDecimal(object.getLength());
		}
	}
}
