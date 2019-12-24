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
public class ConverterImpl implements Converter{
	
	private MyObject object = new MyObject();
	private BigDecimal result = null;
//	private BigDecimal fromUnit = null;
	private BigDecimal length = null;
	
	private Unit fromUnit = null;
	
	@Override
	public String convertOutput(String input) {
	    parseInput(input);
	    
	    if(object.getFromUnit().equals(Converter.CENTIMETER)) {
			fromUnit = new Centimiter();
		}else if(object.getFromUnit().equals(Converter.FEET)) {
			fromUnit = new Feet();
		}else if(object.getFromUnit().equals(Converter.INCH)) {
			fromUnit = new Inch();
		}else if(object.getFromUnit().equals(Converter.YARD)) {
			fromUnit = new Yard();
		}else if(object.getFromUnit().equals(Converter.METER)) {
			fromUnit = new Meter();
		}
	    
	    if(object.getToUnit().equals(Converter.CENTIMETER)) {
	    		return fromUnit.toMeter(length).toString();
		}else if(object.getToUnit().equals(Converter.FEET)) {
			return fromUnit.toFeet(length).toString();
		}else if(object.getToUnit().equals(Converter.INCH)) {
			return fromUnit.toInch(length).toString();
		}else if(object.getToUnit().equals(Converter.YARD)) {
			return fromUnit.toYard(length).toString();
		}else if(object.getToUnit().equals(Converter.METER)) {
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
