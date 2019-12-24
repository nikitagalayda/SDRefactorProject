package com.system.measurement;

import java.math.BigDecimal;

public interface Unit {
	BigDecimal toCm(BigDecimal input);
	BigDecimal toInch(BigDecimal input);
	BigDecimal toMeter(BigDecimal input);
	BigDecimal toFeet(BigDecimal input);
	BigDecimal toYard(BigDecimal input);
}
