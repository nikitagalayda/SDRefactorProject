package com.system.measurement.Units;

import java.math.BigDecimal;
import java.util.HashMap;

import com.system.measurement.Unit;

public class Feet extends Unit {

	public Feet() {
		conversionMap = new HashMap<String, String>();
		conversionMap.put("cm", "30.48");
		conversionMap.put("in", "12");
		conversionMap.put("yd", "0.3333");
		conversionMap.put("m", "0.3048");
	}
}
