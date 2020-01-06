package com.system.measurement;

import java.math.BigDecimal;
import java.util.HashMap;

public abstract class Unit {
	protected HashMap<String, String> conversionMap = null;

	public BigDecimal convert(BigDecimal fromValue, String toUnit) {
		BigDecimal result = fromValue;
		BigDecimal conversionRate = new BigDecimal(conversionMap.get(toUnit));
		result = result.multiply(conversionRate);

		return result;
	}
}
