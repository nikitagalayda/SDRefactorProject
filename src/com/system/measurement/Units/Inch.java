package com.system.measurement.Units;

import java.math.BigDecimal;
import java.util.HashMap;

import com.system.measurement.Unit;

public class Inch extends Unit {

	public Inch() {
		conversionMap = new HashMap<String, String>();
		conversionMap.put("cm", "2.54");
		conversionMap.put("ft", "0.0833");
		conversionMap.put("yd", "0.0278");
		conversionMap.put("m", "0.0254");
	}
}
