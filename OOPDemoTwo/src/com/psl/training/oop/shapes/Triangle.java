package com.psl.training.oop.shapes;

public class Triangle extends Shape implements Sparkable, Rotateable{
	@Override
	public void draw(){
		System.out.println("Triangle Created");
	}

	@Override
	public void rotate() {
		System.out.println("Triangle is Rotating "+Rotateable.DIRECTION);		
	}

	@Override
	public void spark() {
		System.out.println("Triangle is Sparkling "+Sparkable.DIRECTION);
	}
}