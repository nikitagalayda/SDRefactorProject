package com.system.measurement.Units;

import java.math.BigDecimal;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;
import com.system.measurement.Unit;

public class Yard implements Unit {

	final String YARD_TO_FEET = "3";
	final String YARD_TO_METER = "0.9144";
	final String YARD_TO_CENT = "91.44";
	final String YARD_TO_INCH = "36";
	@Override
	public BigDecimal toCm(BigDecimal input) {
		BigDecimal result = new BigDecimal(YARD_TO_CENT);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toInch(BigDecimal input) {
		BigDecimal result = new BigDecimal(YARD_TO_INCH);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toMeter(BigDecimal input) {
		BigDecimal result = new BigDecimal(YARD_TO_METER);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toFeet(BigDecimal input) {
		BigDecimal result = new BigDecimal(YARD_TO_FEET);
		result = result.multiply(input);
		
		return result;
	}
	@Override
	public BigDecimal toYard(BigDecimal input) {
		Result input;
	}

}
