package com.system.measurement.Units;

import java.math.BigDecimal;
import com.system.measurement.Unit;

public class Centimeter implements Unit {
	
	final String CENT_TO_INCH = "0.3937";
	final String CENT_TO_METER = "0.01";
	final String CENT_TO_FEET = "0.0328";
	final String CENT_TO_YARD = "0.0109";
	
	@Override
	public BigDecimal toCm(BigDecimal input) {
		return input;
	}
	
	@Override
	public BigDecimal toInch(BigDecimal input) {
		BigDecimal result = new BigDecimal(CENT_TO_INCH);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal toMeter(BigDecimal input) {
		BigDecimal result = new BigDecimal(CENT_TO_METER);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal toFeet(BigDecimal input) {
		BigDecimal result = new BigDecimal(CENT_TO_FEET);
		result = result.multiply(input);
		
		return result;
	}

	@Override
	public BigDecimal toYard(BigDecimal input) {
		BigDecimal result = new BigDecimal(CENT_TO_YARD);
		result = result.multiply(input);
		
		return result;
	}	
}
