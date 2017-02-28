package com.jeesite.test;

public class Test {

	public static void main(String[] args) {
		Apple ap = Apple.IPHONE5;
		Apple ap1 = Apple.IPHONE8;

		System.out.println(ap);
		System.out.println(ap.getName());
		System.out.println(ap.ordinal());
		System.out.println(ap.compareTo(ap1));
		System.out.println("================");
		System.out.println(ap1);
		System.out.println(ap1.getName());
		System.out.println(ap1.ordinal());
	}
}

enum Apple {

	IPHONE4, IPHONE5("IPHONE5"), IPHONE6, IPHONE7, IPHONE8;

	private String name;

	Apple() {
		name = "Apple company ";
	}

	Apple(String name) {
		this.name = "Apple company " + name;
	}

	public String getName() {
		return name;
	}
}
