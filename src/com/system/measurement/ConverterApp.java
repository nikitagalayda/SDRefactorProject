package com.system.measurement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 * @author adeel ahmad
 *
 */
public class ConverterApp {
   
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Converter converter = new Converter();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			do{
				System.out.println("Input measurements to convert: ");
				input = br.readLine();
				System.out.println(converter.convertOutput(input));		
			}while(!input.equalsIgnoreCase("exit"));
		}catch(IOException ioe) {
			System.out.println("IO Error when trying to read input");
			ioe.printStackTrace();
			System.exit(1);
		}
	}
}
