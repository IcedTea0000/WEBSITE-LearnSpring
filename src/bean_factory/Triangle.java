package bean_factory;

import java.util.List;

public class Triangle {

	private List<Point> points;

	public List getPoints() {
		return points;
	}

	public void setPoints(List points) {
		this.points = points;
	}

	public void draw() {
		for (Point point : points) {
			System.out.println("draw triangle from point1 (x=" + point.getX() + ", y=" + point.getY() + ")");
		}
	}
}
