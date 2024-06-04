package oops;

class Rectangle{
	
	float width;
	float height;
	
	public Rectangle(float width,float height) {
		this.width = width;
		this.height = height;
	}
	
	
	public float areaOfRectangle() {
		float ans = width * height;
		
		return ans;
	}
	
	public float PerimeterOfRectangle() {
		float ans = 2*(width * height);
		
		return ans;
	}
}

public class RectangleClass {
	public static void main(String[] args) {
		
		float width = 10;
		float height = 20;
		
		Rectangle r = new Rectangle(width,height);
		
		System.out.println(r.areaOfRectangle());;
	}
}
