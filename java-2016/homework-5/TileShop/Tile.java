/**
**This is a abstract class
*<p>
*The application allows different classes inherit the state from it.
*<p>
*@author Alin
*/
public abstract class Tile {
	private double length;

	private double width;

	private double price;


public Tile(double priceForSTile, double sTileLength, double sTileWidth) {

	length = sTileLength;

	width = sTileWidth;

	price = priceForSTile;
   
   
}
/**
*Overrides method from Shape class which calculates the area of a triangle.
*/
public double calculateArea() {

	return this.getLength()
* this.getWidth();


}


/**
*Overrides method from Shape class which calculates the area of a triangle.
*/
public double getLength() {

	return length;

}
/**
*Overrides method from Shape class which calculates the area of a triangle.
*/

public double getWidth() {

	return width;

}
/**
*Overrides method from Shape class which calculates the area of a triangle.
*/


public double getPrice() {

	return price;

}



}




