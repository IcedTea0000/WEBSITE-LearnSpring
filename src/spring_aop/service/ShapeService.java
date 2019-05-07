package spring_aop.service;

import spring_aop.model.Circle;
import spring_aop.model.Triangle;

public class ShapeService {

	private Circle circle;
	private Triangle triangle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

	
	
}
