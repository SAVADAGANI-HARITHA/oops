package day6;
import java.util.*;
public abstract class Shape {
	private String name;
		protected Shape(String  name)
	{
		this.name=name;
	}
	
	public void  setName()
	{
		Scanner sc=new Scanner (System.in);
		name = sc.nextLine();
	}
	public String getName()
	{
		return name;
	}  
		
	abstract void calculateArea();
	{
		
	}
	

}