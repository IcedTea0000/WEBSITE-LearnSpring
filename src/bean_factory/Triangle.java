package bean_factory;

public class Triangle {

	private String type;

	public String getType() {
		return type;
	}


	public void draw() {
		System.out.println(getType()+ " draw triangle");
	}
}
