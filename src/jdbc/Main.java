package jdbc;

public class Main {

	public static void main(String args[]){
		CircleImpl circleImpl=new CircleImpl();
		Circle circle=circleImpl.get(1);
		System.out.println(circle.getName());
	}
}
