package com.system.measurement.Units;

import java.math.BigDecimal;

import com.system.measurement.Unit;

public class Meter implements Unit {
	
	final String CENT_TO_METER = "0.01";
	final String INCH_TO_METER = "0.0254";
	final String FEET_TO_METER = "0.3048";
	final String YARD_TO_METER = "0.9144";

	@Override
	public BigDecimal fromCm(BigDecimal input) {
		BigDecimal result = new BigDecimal(CENT_TO_METER);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromInch(BigDecimal input) {
		BigDecimal result = new BigDecimal(INCH_TO_METER);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromMeter(BigDecimal input) {
		return input;
	}

	@Override
	public BigDecimal fromFeet(BigDecimal input) {
		BigDecimal result = new BigDecimal(FEET_TO_METER);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromYard(BigDecimal input) {
		BigDecimal result = new BigDecimal(YARD_TO_METER);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal convert(BigDecimal input, Unit toUnit) {
		System.out.println(toUnit.fromMeter(input));
		return toUnit.fromMeter(input);
	}
}
