package com.system.measurement;

import java.math.BigDecimal;

public class InputParser {
	private String toUnit = null;
	private String fromUnit = null;
	private BigDecimal inputValue = null;
	
//	public InputParser() {
//	}
	
	public InputParser(String input) {
		String[] extracted = input.split("\\s+");
		if(extracted.length == 4) {
			setInputValue(extracted[0]);
			setFromUnit(extracted[1]);
			setToUnit(extracted[3]);
//			inputValue = new BigDecimal(getInputValue());
		}
	}
	
//	public InputParser(String length, String fromUnit, String toUnit) {
//		super();
//		this.toUnit = toUnit;
//		this.fromUnit = fromUnit;
//		this.inputValue = new BigDecimal(length);
//	}

	public String getToUnit() {
		return toUnit;
	}

	public void setToUnit(String toUnit) {
		this.toUnit = toUnit;
	}

	public String getFromUnit() {
		return fromUnit;
	}

	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}

	public BigDecimal getInputValue() {
		return inputValue;
	}

	public void setInputValue(String length) {
		this.inputValue = new BigDecimal(length);
	}
	
	

}
