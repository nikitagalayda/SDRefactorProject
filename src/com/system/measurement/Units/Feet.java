package com.system.measurement.Units;

import java.math.BigDecimal;

import com.system.measurement.Unit;

public class Feet implements Unit {

	final String CENT_TO_FEET = "0.0328";
	final String INCH_TO_FEET = "0.0833";
	final String METER_TO_FEET = "3.2808";
	final String YARD_TO_FEET = "3";
	
	@Override
	public BigDecimal fromCm(BigDecimal input) {
		BigDecimal result = new BigDecimal(CENT_TO_FEET);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromInch(BigDecimal input) {
		BigDecimal result = new BigDecimal(INCH_TO_FEET);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromMeter(BigDecimal input) {
		BigDecimal result = new BigDecimal(METER_TO_FEET);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromFeet(BigDecimal input) {
		return input;
	}

	@Override
	public BigDecimal fromYard(BigDecimal input) {
		BigDecimal result = new BigDecimal(YARD_TO_FEET);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal convert(BigDecimal input, Unit toUnit) {
		return toUnit.fromFeet(input);
	}
}
