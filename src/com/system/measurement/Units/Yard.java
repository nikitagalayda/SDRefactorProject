package com.system.measurement.Units;

import java.math.BigDecimal;
import java.util.HashMap;

import com.system.measurement.Unit;

public class Yard extends Unit {

	public Yard() {
		conversionMap = new HashMap<String, String>();
		conversionMap.put("cm", "91.44");
		conversionMap.put("in", "36");
		conversionMap.put("ft", "3");
		conversionMap.put("m", "0.9144");
	}
}
