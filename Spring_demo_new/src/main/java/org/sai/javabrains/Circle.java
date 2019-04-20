package org.sai.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.*;
//import org.springframework.beans.factory.annotation.Required;



public class Circle implements Shape{

	private Point center;
	
	
	
	public Point getCenter() {
		return center;
	}


	// this is needed point 
	//@Required
    //@Autowired
	//@Qualifier("circleRelated")
	@Resource(name="thirdPoint")
	public void setCenter(Point center) {
		this.center = center;
	}



	public void draw()
	{
		System.out.print("\nDrawing circle center is (" + getCenter().getX() + "," + getCenter().getY()+")");
	}

	
}
