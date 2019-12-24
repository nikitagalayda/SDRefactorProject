package com.system.measurement;


/**
 * 
 * 
 * @author adeel ahmad
 *
 */
public class MyObject {
	private String toUnit = null;
	private String fromUnit = null;
	private String length = null;
	private String convertedLength = null;
	
	public MyObject() {
	}
	
	public MyObject(String length, String fromUnit, String toUnit) {
		super();
		this.toUnit = toUnit;
		this.fromUnit = fromUnit;
		this.length = length;
	}

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

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getConvertedLength() {
		return convertedLength;
	}

	public void setConvertedLength(String convertedLength) {
		this.convertedLength = convertedLength;
	}

	@Override
	public String toString() {
		return length + " " + fromUnit + " equals " + convertedLength + " " + toUnit;
	}

}
