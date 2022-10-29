package com.basics.codeinit.scope;

public class PrimaryClass {

	public static void main(String[] args) {
		Car x = new Car("blue", "BMW");
		System.out.println(x.getDescription());
	}
}
