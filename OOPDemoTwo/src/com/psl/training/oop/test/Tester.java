package com.psl.training.oop.test;
import com.psl.training.oop.canvas.GameConsole;
import com.psl.training.oop.shapes.*;
//import com.psl.training.oop.shapes.Square;
//import com.psl.training.oop.shapes.Triangle;
//import com.psl.training.oop.shapes.Shape;

public class Tester {
	public static void main(String[] args) {
		
		GameConsole console=new GameConsole();
		
		//console.drawShape(new Circle());
		//console.drawShape(new Triangle());
		
		Shape s1=new Square();
		Shape s2=new Triangle();
		//Shape s3=new Circle();
		
		console.drawShape(s1);
		System.out.println();
		console.drawShape(s2);
		System.out.println();
		console.drawShape(new Circle());
		System.out.println();
		console.drawShape(new Star());
	}
}
