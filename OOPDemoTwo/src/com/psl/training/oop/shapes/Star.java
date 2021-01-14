package com.psl.training.oop.shapes;

public class Star extends Shape implements Sparkable{

	@Override
	public void draw() {
		System.out.println("Star Created");
	}

	@Override
	public void spark() {
		System.out.println("Star is Sparklin "+DIRECTION);		
	}
	
}
