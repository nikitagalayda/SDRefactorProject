# Software Design Refactor Project

## Original Project
https://github.com/aahmadai/unit-conversion

## Changes

SD Project changes

1. Encapsulated the units to their own classes
    1. Extend a “Unit” abstract class
    2. Keep their own conversion factors only relevant to them
    3. "convert" (defined in the Unit abstract class) function converts to other units
2. Removed “Object” class which encapsulated input parsing and tracking the converted values
    1. Split input parsing into its own class - InputParser
    2. Store converted values in Converter class
3. Moved input parsing from Converter to InputParser
4. Removed Converter interface
    1. Changed to class since there is no use for the interface
5. Changed output printing
    1. Now is a function of Converter class
6. Implements Facade pattern
	1. ConverterApp acts as an interface 
	2. Converter does everything behind the scenes
		1. Interacts with other parts of the code (ex: UnitFactory)
7. Implemented Strategy pattern
	1. "fromUnit" (unit which is converted from) is decided dynamically
	2. "toUnit" (unit which is converted to) is passed dynamically
    3. In Converter, use Dynamic Polymorphism to change the units
8. Implemented Factory pattern
	1. UnitFactory creates units dynamically
	2. Dynamically created units are then converted to other dynamically decided units
9. Implemented Template pattern
	1. All Units extend an abstract class "Unit"
	2. "Unit" defines a "convert" function which takes in a String representing a "toUnit"
	3. "Unit" acts as a template for all the Units
10. Remove unnecessary comments
11. Rename functions and classes to better, more descriptive names

9 Commits
