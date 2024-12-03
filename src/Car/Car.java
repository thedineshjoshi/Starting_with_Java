package Car;

import java.time.LocalDateTime;

public class Car {
	
	String Name;
	String Brand;
	LocalDateTime Manufacture_Date;
	int Price;
	
	public static void main(String args[])
	{
		Car Toyota = new Car();
		Toyota.Name = "LandCruiser";
		Toyota.Brand = "Toyota";
		Toyota.Manufacture_Date=LocalDateTime.now();
		Toyota.Price = 1250000;
		System.out.println("Name = "+Toyota.Name +"\n"+"Brand = "+Toyota.Brand+"\n"+"Manufacture Date="+Toyota.Manufacture_Date+"\n"+"Price="+Toyota.Price);
	}
}
