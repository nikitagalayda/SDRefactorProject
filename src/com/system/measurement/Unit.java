package com.system.measurement;

import java.math.BigDecimal;

public interface Unit {
	BigDecimal fromCm(BigDecimal input);
	BigDecimal fromInch(BigDecimal input);
	BigDecimal fromMeter(BigDecimal input);
	BigDecimal fromFeet(BigDecimal input);
	BigDecimal fromYard(BigDecimal input);
	BigDecimal convert(BigDecimal input, Unit toUnit);
}
