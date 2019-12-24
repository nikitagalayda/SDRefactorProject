package com.system.measurement.Units;

import java.math.BigDecimal;

import com.system.measurement.Unit;

public class Meter implements Unit {

	final String METER_TO_CENT = "100";
	final String METER_TO_FEET = "3.2808";
	final String METER_TO_YARD = "1.0936";
	final String METER_TO_INCH = "39.37";
	
	@Override
	public BigDecimal toCm(BigDecimal input) {
		BigDecimal result = new BigDecimal(METER_TO_CENT);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal toInch(BigDecimal input) {
		BigDecimal result = new BigDecimal(METER_TO_INCH);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal toMeter(BigDecimal input) {
		return input;
	}
	
	@Override
	public BigDecimal toFeet(BigDecimal input) {
		BigDecimal result = new BigDecimal(METER_TO_FEET);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal toYard(BigDecimal input) {
		BigDecimal result = new BigDecimal(METER_TO_YARD);
		result = result.multiply(input);
		
		return result;
	}
}
