package q3;

public class Circle extends Shape {
	int radius;
	public Circle(int radius) 
	{
		//this.shapeName=Circle;
		this.radius=radius;
		

	}
	public void calculateArea()
	{
		double area=Math.PI*radius;
		System.out.printf("the area of Square is: %.2f",area);
	}

}