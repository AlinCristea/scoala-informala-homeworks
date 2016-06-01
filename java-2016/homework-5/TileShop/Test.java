
public class Test {
	
/**
 * The costFifty method returns the  total price  calculated 50% regarding square meters and 50% regarding number of tile pieces 
 * 
 */

	public static double costFifty(){
		STile s=new STile(30, 0.5, 0.35, 100);
		PTile p= new PTile(5, 0.5, 0.4, 100);
		return((s.totalPrice()+p.totalPrice())/2);
	}
	
	public  static void main(String args[]){
		
		STile s =new STile(30, 0.5, 0.35, 100);
		PTile p= new PTile(5, 0.5, 0.4, 100);
		PTTile t=new PTTile(7, 0.4, 0.4, 100);
		
		System.out.println( "Area  unei paci este : " +s.calculateArea());
	    s.calcNrTile();
	    System.out.println( "numaru de placi este  : " +s.calcNrTile());
	    System.out.println( "pret toteal  : " +s.totalPrice());
	    System.out.println( "Area  unei paci este : " +p.calculateArea());
	    System.out.println( "Area  unei paci este : " +t.calculateArea());
	    System.out.println( "pret total triunghi este : " +t.totalPrice());
	    System.out.println( "pret total per bucata  este : " +p.totalPrice());
	    System.out.println();
	    System.out.println( "numarul de placi: " +s.calcNrTile());
	    System.out.println( "numarul de placi: " +p.calcNrTile());
	    System.out.println( "numarul de placi: " +t.calcNrTile());
	    System.out.println("pret calculat 50% la metru patrat si 50% la bucata"+costFifty());
	}

}
