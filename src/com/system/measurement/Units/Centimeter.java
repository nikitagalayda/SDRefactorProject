package com.system.measurement.Units;

import java.math.BigDecimal;
import com.system.measurement.Unit;

public class Centimeter implements Unit {
	
//	final String CENT_TO_INCH = "0.3937";
//	final String CENT_TO_METER = "0.01";
//	final String CENT_TO_FEET = "0.0328";
//	final String CENT_TO_YARD = "0.0109";
	
	final String INCH_TO_CENT = "2.54";
	final String METER_TO_CENT = "100";
	final String FEET_TO_CENT = "30.48";
	final String YARD_TO_CENT = "91.44";
	
	
	public BigDecimal convert(BigDecimal input, Unit toUnit) {
		System.out.println(toUnit.fromCm(input));
		return toUnit.fromCm(input);
	}

	@Override
	public BigDecimal fromCm(BigDecimal input) {
		return input;
	}

	@Override
	public BigDecimal fromInch(BigDecimal input) {
		BigDecimal result = new BigDecimal(INCH_TO_CENT);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal fromMeter(BigDecimal input) {
		BigDecimal result = new BigDecimal(METER_TO_CENT);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal fromFeet(BigDecimal input) {
		BigDecimal result = new BigDecimal(FEET_TO_CENT);
		result = result.multiply(input);
		
		return result;
	}
	
	@Override
	public BigDecimal fromYard(BigDecimal input) {
		BigDecimal result = new BigDecimal(YARD_TO_CENT);
		result = result.multiply(input);
		
		return result;
	}	
}
