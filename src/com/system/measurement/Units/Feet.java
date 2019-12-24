package com.system.measurement.Units;

import java.math.BigDecimal;

import com.system.measurement.Unit;

public class Feet implements Unit {

	final String FEET_TO_CENT = "30.48";
	final String FEET_TO_INCH = "12";
	final String FEET_TO_METER = "0.3048";
	final String FEET_TO_YARD = "0.3333";
	@Override
	public BigDecimal toCm(BigDecimal input) {
		BigDecimal result = new BigDecimal(FEET_TO_CENT);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toInch(BigDecimal input) {
		BigDecimal result = new BigDecimal(FEET_TO_INCH);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toMeter(BigDecimal input) {
		BigDecimal result = new BigDecimal(FEET_TO_METER);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toFeet(BigDecimal input) {
		return input;
	}
	@Override
	public BigDecimal toYard(BigDecimal input) {
		BigDecimal result = new BigDecimal(FEET_TO_YARD);
		result = result.multiply(input);
		
		return result;
	}

}
