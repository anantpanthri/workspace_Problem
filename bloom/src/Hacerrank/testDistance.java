package Hacerrank;

public class testDistance {

	public static void main(String[] args) {

		Distance d= new DistanceImplementation();
		Distance d2= new DistanceImplementation();
		d.setFeetAndInches(1, 2.0f);
		d2.setFeetAndInches(1, 2.0f);
		System.out.println(d.getDistanceComparison(d2));


	}

}
//class DistanceImplementation extends Distance{
//	protected int feet;
//	protected float inches;
//	@Override
//	public void setFeetAndInches(int feet, float inches) {
//		this.feet=feet;
//       this.inches=inches;
//		
//	}
//	@Override
//	public int getFeet() {
//		return (this.feet*12);
//   }
//	@Override
//	public float getInches() {
//		return (this.inches);
//	} 
//	@Override
//	String getDistanceComparison(Distance dist2) {
//	return(this.getFeet()+this.getInches() >dist2.getFeet()+dist2.getInches()?"First distance is greater.":this.getFeet()+this.getInches() <dist2.getFeet()+dist2.getInches()?"Second distance is greater.":"Both distances are equal.");
//		 
//	}
//	
//
// }
