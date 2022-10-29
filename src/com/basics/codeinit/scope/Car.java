package com.basics.codeinit.scope;

public class Car { // Begin Car scope
	String color; // Instance variable in Car scope
	String type; // Instance variable in Car scope
	int serialNumber; // Instance variable in Car scope
	static int carCount; // Static variable in Car class scope

	Car(String c, String t) { // Begin constructor scope
		color = c; // ‘'c' is a local variable
		type = t; // 't' is a local variable
		carCount++;
		serialNumber = carCount;
	} // End constructor scope

	public String getDescription() { // Begin getDescription() scope
		String desc; // Local variable
		desc = "This is a " + color + " color " + type + " car ";
		return desc;
	} // End getDescription() scope
} // End Car scope
