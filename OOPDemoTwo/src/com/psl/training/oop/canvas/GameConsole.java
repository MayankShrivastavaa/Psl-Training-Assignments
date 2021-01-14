package com.psl.training.oop.canvas;
import com.psl.training.oop.shapes.*;

public class GameConsole {
	public void drawShape(Shape s){
		s.draw();
		
		if(s instanceof Circle)
			((Circle)s).fillcolor("Red");
		
		if( s instanceof Rotateable)
			((Rotateable)s).rotate();
		
		if( s instanceof Sparkable)
			((Sparkable)s).spark();
	}
}
