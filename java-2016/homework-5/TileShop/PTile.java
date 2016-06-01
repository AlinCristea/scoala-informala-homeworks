/**
*This PTile class allows application to calculate area for a tile, number tile and total price for  a area.
*<p>
*<b> The calculate area for a tile  needs the lenght and the width <b> 
*<b> The total price  is for the entire surface calculated regarding the price of  the rectangle tile   <b>.
*@author Alin
*/
public class PTile extends STile {
	

	public PTile(double priceForSTile, double sTileLength, double sTileWidth,double area) {
		super(priceForSTile, sTileLength, sTileWidth, area);
	
		
		
	}
	/**
	*Overrides method from Tile class which calculates the area of a tile.
	*/
	@Override
	public double calculateArea() {

		return this.getLength()
	* this.getWidth();


	}
	/**
	*Overrides method from Tile class which calculates the number tile.
	*/
	@Override
    public double  calcNrTile(){
		double nrTile = area/this.calculateArea();
		return nrTile;
		
	}
	/**
	*This method calculates the total price /area .
	*/
	public double totalPrice(){
		return this.calcNrTile()*this.getPrice();
	}
	

}
