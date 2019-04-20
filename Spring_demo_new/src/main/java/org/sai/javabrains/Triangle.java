package org.sai.javabrains;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean, Shape

//public class Triangle
{
	
	/*private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}

	public String getType() {
		return type;
	}

	//public void setType(String type) {
	//	this.type = type;
	//}

	public void draw()
	{
		System.out.print(getType()+"\nDrawing triangle of height " + getHeight());
	}
	
	// constructor for type
	public Triangle(String type)
	{
		this.type = type;
	}

	
	//new constructor
	//spring gets parameters in xml then it will see it inside this Triangle and try to find same constructor
	public Triangle(String type, int height)
	{
		this.type = type;
		this.height = height;
	}
	
	// constructor for height
		public Triangle(int height)
		{
			this.height = height;
		}
	*/

	
	/*
	
	// new points
	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	
	
	public Point getPointA() {
		return PointA;
	}



	public void setPointA(Point pointA) {
		PointA = pointA;
	}



	public Point getPointB() {
		return PointB;
	}



	public void setPointB(Point pointB) {
		PointB = pointB;
	}



	public Point getPointC() {
		return PointC;
	}



	public void setPointC(Point pointC) {
		PointC = pointC;
	}



	public void draw()
	{
		System.out.print("\nPoint A (x =" +getPointA().getX()+ ",  y=" + getPointA().getY() + ")");
		System.out.print("\nPoint B (x =" +getPointB().getX()+ ",  y=" + getPointB().getY() + ")");
		System.out.print("\nPoint C (x =" +getPointC().getX()+ ",  y=" + getPointC().getY() + ")");
		
	}
	*/
	
	
	/*
	// using collections
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	
	public void draw()
	{
		for(Point point: points)
		{
			System.out.print("\nPoint  (x =" +point.getX()+ ",  y=" + point.getY() + ")");
		}
		
		
	}
	
	*/
	
	
	// helping auto wiring 
	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	
	
	public Point getPointA() {
		return PointA;
	}



	public void setPointA(Point pointA) {
		PointA = pointA;
	}



	public Point getPointB() {
		return PointB;
	}



	public void setPointB(Point pointB) {
		PointB = pointB;
	}



	public Point getPointC() {
		return PointC;
	}



	public void setPointC(Point pointC) {
		PointC = pointC;
	}



	public void draw()
	{
		System.out.print("\nPoint A (x =" +getPointA().getX()+ ",  y=" + getPointA().getY() + ")");
		System.out.print("\nPoint B (x =" +getPointB().getX()+ ",  y=" + getPointB().getY() + ")");
		System.out.print("\nPoint C (x =" +getPointC().getX()+ ",  y=" + getPointC().getY() + ")");
		
	}


	// this is the method spring is going to call, will get call when bean is getting initializing
	public void afterPropertiesSet() throws Exception {
		System.out.print("\n\nBeans is getting initializing for triangle");
		
	}


	// this is method from DisposableBean interface, calls when beans is destroyed
	public void destroy() throws Exception {
		System.out.print("\n\nBeans is getting destroy for triangle");
		
	}
	
	
	public void inIt()
	{
		System.out.print("\n\nTriangle in it method");
	}
	
	public void cleanUp()
	{
		System.out.print("\n\nTriangle destroy method");
	}
}
