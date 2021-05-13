abstract class Shape{
	public abstract void draw();
}
class Rectangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw all shapes");
		
	}
	
}
class Line extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw all shapes");
		
	}
	
}
class circle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw all shapes");
		
	}
	
}


public class Size {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.draw();
		Line l = new Line();
		l.draw();
		circle c = new circle();
		c.draw();

	}

}
