package com.system.measurement;


/**
 * 
 * @author adeel ahmad
 *
 */
public interface Converter {
	
	static final String CENTIMETER = "cm";
    static final String METER = "m";
    static final String YARD = "yd";
    static final String INCH = "in";
    static final String FEET = "ft";
    
    static final String FEET_TO_CENT = "30.48";
	static final String FEET_TO_INCH = "12";
	static final String FEET_TO_METER = "0.3048";
	static final String FEET_TO_YARD = "0.3333";
	
	static final String YARD_TO_FEET = "3";
	static final String YARD_TO_METER = "0.9144";
	static final String YARD_TO_CENT = "91.44";
	static final String YARD_TO_INCH = "36";
	
	static final String METER_TO_CENT = "100";
	static final String METER_TO_FEET = "3.2808";
	static final String METER_TO_YARD = "1.0936";
	static final String METER_TO_INCH = "39.37";
	
	static final String INCH_TO_CENT = "2.54";
	static final String INCH_TO_METER = "0.0254";
	static final String INCH_TO_YARD = "0.0278";
	static final String INCH_TO_FEET = "0.0833"; 
	
	static final String CENT_TO_INCH = "0.3937";
	static final String CENT_TO_METER = "0.01";
	static final String CENT_TO_FEET = "0.0328";
	static final String CENT_TO_YARD = "0.0109";
	
	public String convertOutput(String input);
}
