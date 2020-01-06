package com.system.measurement.Units;

import java.math.BigDecimal;
import java.util.HashMap;

import com.system.measurement.Unit;

public class Meter extends Unit {

	public Meter() {
		conversionMap = new HashMap<String, String>();
		conversionMap.put("cm", "100");
		conversionMap.put("in", "39.37");
		conversionMap.put("ft", "3.2808");
		conversionMap.put("yd", "1.0936");
	}
}
