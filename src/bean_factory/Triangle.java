package bean_factory;

import java.util.List;

public class Triangle {

	private Point point1;
	private Point point2;
	private Point point3;
	
	
	
	
	public Point getPoint1() {
		return point1;
	}




	public void setPoint1(Point point1) {
		this.point1 = point1;
	}




	public Point getPoint2() {
		return point2;
	}




	public void setPoint2(Point point2) {
		this.point2 = point2;
	}




	public Point getPoint3() {
		return point3;
	}




	public void setPoint3(Point point3) {
		this.point3 = point3;
	}




	public void draw() {
		System.out.println("draw triangle from point1 (x=" + point1.getX() + ", y=" + point1.getY() + ")");
		System.out.println("draw triangle from point2 (x=" + point2.getX() + ", y=" + point2.getY() + ")");
		System.out.println("draw triangle from point3 (x=" + point3.getX() + ", y=" + point3.getY() + ")");
			
	}
}
