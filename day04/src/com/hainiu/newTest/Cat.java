package com.hainiu.newTest;

public class Cat extends Pet {
	public Cat(String name, int full, int happy) {
		super(name, full, happy);
	}


	public Cat(String name) {
		super(name);
	}

	@Override
	public String cry() {
		return "喵~";
	}
}
