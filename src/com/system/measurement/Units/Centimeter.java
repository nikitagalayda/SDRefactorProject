package com.system.measurement.Units;

import java.math.BigDecimal;
import java.util.HashMap;

import com.system.measurement.Unit;

public class Centimeter extends Unit {

	public Centimeter() {
		conversionMap = new HashMap<String, String>();
		conversionMap.put("in", "0.3937");
		conversionMap.put("m", "0.01");
		conversionMap.put("ft", "0.0328");
		conversionMap.put("yd", "0.0109");
	}
}
