
public class Property {
	
	String propertyName;
	String city;
	double rentAmount;
	String owner;
	Plot plot1; 
	public Property(){
		//need default property
		propertyName ="";
		city="";
		rentAmount=0.0;
		owner="";
		plot1 = new Plot();
	}
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		
		 plot1 = new Plot();
	}
	Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth){
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		
		plot1 = new Plot(x,y,width,depth);
	}
	public Property(Property otherProperty){
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.rentAmount = otherProperty.rentAmount;
		this.owner = otherProperty.owner;
		
		//what if otherProperty doesn't have extra attributes
		plot1 = new Plot(otherProperty.plot1);
	}
	public String getCity() { 
		return city;
	}
	public String getOwner() {
		return owner;
	}
	public Plot getPlot() {
		return plot1;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	public String toString() {
		return propertyName+","+city+","+owner+","+rentAmount;
	}
	
}
