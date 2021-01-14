package com.psl.training.oop.shapes;

public class Circle extends Shape {
	@Override
	public void draw(){
		System.out.println("Circle Created");
	}
	
	public void fillcolor(String color){
		System.out.println(color+" Color Filled in Circle");
	}
}
