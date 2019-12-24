package com.system.measurement.Units;

import java.math.BigDecimal;

import com.system.measurement.Unit;

public class Inch implements Unit {

	final String INCH_TO_CENT = "2.54";
	final String INCH_TO_METER = "0.0254";
	final String INCH_TO_YARD = "0.0278";
	final String INCH_TO_FEET = "0.0833";
	
	@Override
	public BigDecimal toCm(BigDecimal input) {
		BigDecimal result = new BigDecimal(INCH_TO_CENT);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toInch(BigDecimal input) {
		return input;
	}
	@Override
	public BigDecimal toMeter(BigDecimal input) {
		BigDecimal result = new BigDecimal(INCH_TO_METER);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toFeet(BigDecimal input) {
		BigDecimal result = new BigDecimal(INCH_TO_FEET);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toYard(BigDecimal input) {
		BigDecimal result = new BigDecimal(INCH_TO_YARD);
		result = result.multiply(input);
		
		return result;
	}

}
