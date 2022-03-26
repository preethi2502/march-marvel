package com.test.coml;

public class Restt {

	public Restt() {
		System.out.println("test");
	}

	public Restt(int a) {
		
		System.out.println("a"+a);
	}

	public Restt(String name) {
		this(5);
		System.out.println("name " +name);
	}

	public static void main(String[] args) {

		Restt ref = new Restt("preethi");
		

	}
}
