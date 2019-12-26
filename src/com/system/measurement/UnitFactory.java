package com.system.measurement;

import java.util.HashMap;

import com.system.measurement.Units.Centimeter;
import com.system.measurement.Units.Feet;
import com.system.measurement.Units.Inch;
import com.system.measurement.Units.Meter;
import com.system.measurement.Units.Yard;

public class UnitFactory {
	static final String CENTIMETER = "cm";
    static final String METER = "m";
    static final String YARD = "yd";
    static final String INCH = "in";
    static final String FEET = "ft";
    
    HashMap<String, Unit> unitMap = new HashMap<>();
    Unit unit = null;
    
    public UnitFactory() {
	    unitMap.put(CENTIMETER, new Centimeter());
		unitMap.put(METER, new Meter());
		unitMap.put(INCH, new Inch());
		unitMap.put(FEET, new Feet());
		unitMap.put(YARD, new Yard());
    }
    
    public Unit createUnit(String input) {
    		unit = unitMap.get(input);
    		
    		return unit;
    }
	
	
}
