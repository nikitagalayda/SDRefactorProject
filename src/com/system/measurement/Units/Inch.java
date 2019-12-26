package com.system.measurement.Units;

import java.math.BigDecimal;

import com.system.measurement.Unit;

public class Inch implements Unit {

	final String CENT_TO_INCH = "0.3937";
	final String METER_TO_INCH = "39.37";
	final String FEET_TO_INCH = "12";
	final String YARD_TO_INCH = "36";
	
	@Override
	public BigDecimal fromCm(BigDecimal input) {
		BigDecimal result = new BigDecimal(CENT_TO_INCH);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal fromInch(BigDecimal input) {
		return input;
	}
	
	@Override
	public BigDecimal fromMeter(BigDecimal input) {
		BigDecimal result = new BigDecimal(METER_TO_INCH);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal fromFeet(BigDecimal input) {
		BigDecimal result = new BigDecimal(FEET_TO_INCH);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal fromYard(BigDecimal input) {
		BigDecimal result = new BigDecimal(YARD_TO_INCH);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal convert(BigDecimal input, Unit toUnit) {
		return toUnit.fromInch(input);
	}
}
