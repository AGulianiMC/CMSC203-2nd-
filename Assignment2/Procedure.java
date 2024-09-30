
public class Procedure {
String procedureName;
String procedureDate;
String practitionerName;
double charges;
//imports, charges is double or string, does anything need to be initialized
public Procedure() {
	procedureName = "";
	procedureDate = "";
	practitionerName = "";
	charges = 0.0;
}
public Procedure(String name, String date) {
	procedureName = name;
	procedureDate = date;
}
public Procedure(String name, String date, String doctor, double cost) {
	procedureName = name;
	procedureDate = date;
	practitionerName = doctor;
	charges = cost;
}
public String getProName() {return procedureName;}
public String getProDate() {return procedureDate;}
public String getPracName() {return practitionerName;}
public double getCost() {return charges;}

public void setProName(String name) {procedureName=name;}
public void setProDate(String date) { procedureDate=date;}
public void setPracName(String pracName) { practitionerName=pracName;}
public void setCost(double cost) { charges=cost;}
public String toString() {return "Procedure Name: " + procedureName +" Procedure Date: " +procedureDate+ " PractitionerName: " + practitionerName+" Charges: "+charges;   }
//does this need to be formatted/printed a specific way
}
