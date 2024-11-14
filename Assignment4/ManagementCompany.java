
public class ManagementCompany {

	
static final int MAX_PROPERTY=5;
static final int MGM_DEPTH=10;
static final int MGM_WIDTH=10;

String managementCompanyName;
String taxID;
double managementFeePercentage;

Property[] properties; //only part?
Plot plot1;
int numberOfProperties = -1;

public ManagementCompany() {
	managementCompanyName="";
	taxID="";
	plot1 = new Plot(0,0,MGM_WIDTH,MGM_DEPTH);//max width and depth?
	properties = new Property[MAX_PROPERTY];
}
public ManagementCompany(String name, String taxID, double mgmFee){
	managementCompanyName = name;
	this.taxID=taxID;
	managementFeePercentage = mgmFee;
	plot1 = new Plot();
	properties = new Property[MAX_PROPERTY];
	
}

public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
	managementCompanyName = name;
	this.taxID=taxID;
	managementFeePercentage = mgmFee;
	plot1 = new Plot(x,y,width,depth);
	properties = new Property[MAX_PROPERTY];
}
public ManagementCompany( ManagementCompany otherCompany) {
	this.managementCompanyName = otherCompany.managementCompanyName;
	this.taxID = otherCompany.taxID;
	this.managementFeePercentage = otherCompany.managementFeePercentage;
	this.plot1 = otherCompany.plot1;
	for(int i = 0; i < otherCompany.getProperties().length;i++) {
		if(otherCompany.getProperties()[i]!=null) {
		this.properties[i] = otherCompany.getProperties()[i];
	}
	}
	//good?
}
public int addProperty(String name, String city, double rent, String owner) {
	Property newProp = new Property(name, city, rent, owner);
	return addProperty(newProp);
}

public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
	Property newProp = new Property(name, city, rent, owner,x,y,width,depth);
	return addProperty(newProp);
}

public int addProperty(Property property) {
	
	if (numberOfProperties>=5) {
		return -1;
	}
	 if(property==null) {
		return -2;
	}
	if(plot1.encompasses(property.getPlot())==true) {
		return -3;
	} //also should this be else if
	
	for(int i = 0; i<properties.length; i++) {
		if(plot1.overlaps(property.getPlot())==true) {
			return -4;
		}
	}
	
		properties[numberOfProperties+1] = property;
		numberOfProperties ++;
		return numberOfProperties;
	
}

public Property getHighestRentProperty() {
	if(numberOfProperties==-1) {
		return null;
	}
	Property maxRentProperty = properties[0];
	for(int i = 0; i<numberOfProperties;i++) {
		if(maxRentProperty != null || properties[i].getRentAmount()>maxRentProperty.getRentAmount()) {
			maxRentProperty = properties[i];
		}
		
	}
	return maxRentProperty;
}
public double getMgmFeePer() {
	return managementFeePercentage;
}
public String getName() {
	return managementCompanyName;
}
public Plot getPlot() {
	return plot1;
}
public Property[] getProperties() {
	return properties; 
}
public int getPropertiesCount() {
	return numberOfProperties+1;
}
public String getTaxID() {
	return taxID;
}
public double getTotalRent() {
	int totalRent = 0;
	for(int i = 0; i<=numberOfProperties;i++) {
		if(properties [i] != null) {
			totalRent += properties[i].getRentAmount();
		}
	}
	return totalRent;
}
public boolean isManagementFeeValid() {
	if(managementFeePercentage>0 && managementFeePercentage<100) {
		return true;
	}
	return false;
}
public boolean isPropertiesFull() {
	if(numberOfProperties < 5) {
		return false;
	}
	return true; 
}
public void removeLastProperty() {
	properties[numberOfProperties]=null;
	numberOfProperties -=1;
}
public String toString() {
    String fullString = "List of the properties for " + managementCompanyName + ", taxID: " + taxID + "\n"
    + "______________________________________________________\n";
    
        for (int i = 0; i < properties.length; i++) {
          if (properties[i] != null) {
           fullString += properties[i].toString() + "\n"
              + "______________________________________________________\n";
           }
        }
        
    fullString += "\n total management Fee: " + getMgmFeePer()/100 * getTotalRent();
    return fullString;
}
}

