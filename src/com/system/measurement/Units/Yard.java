package com.system.measurement.Units;

import java.math.BigDecimal;
import com.system.measurement.Unit;

public class Yard implements Unit {

	final String CENT_TO_YARD = "0.0109";
	final String INCH_TO_YARD = "0.0278";
	final String METER_TO_YARD = "1.0936";
	final String FEET_TO_YARD = "0.3333";
	
	@Override
	public BigDecimal fromCm(BigDecimal input) {
		BigDecimal result = new BigDecimal(CENT_TO_YARD);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromInch(BigDecimal input) {
		BigDecimal result = new BigDecimal(INCH_TO_YARD);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromMeter(BigDecimal input) {
		BigDecimal result = new BigDecimal(METER_TO_YARD);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromFeet(BigDecimal input) {
		BigDecimal result = new BigDecimal(FEET_TO_YARD);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal fromYard(BigDecimal input) {
		return input;
	}

	@Override
	public BigDecimal convert(BigDecimal input, Unit toUnit) {
		System.out.println(toUnit.fromYard(input));
		return toUnit.fromYard(input);
	}
}
