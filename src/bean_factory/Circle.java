package bean_factory;

public class Circle implements Shape {

	private Point center;
	
	
	
	public Point getCenter() {
		return center;
	}



	public void setCenter(Point center) {
		this.center = center;
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw circle");
		System.out.println("center point is at x="+center.getX()+" y="+center.getY());
	}

}
