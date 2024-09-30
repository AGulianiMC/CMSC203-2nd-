
public class Patient {
String firstName;
String middleName;
String lastName;
String address;
String city;
String state;
String zipCode;
String phoneNumber;
String emName;
String emNumber;

public Patient() {
	firstName = "";
	middleName = "";
	lastName = "";
	address = "";
	city = "";
	state = "";
	zipCode = "";
	phoneNumber = "";
	emName = "";
	emNumber = "";
	}

public Patient(String fName, String mName, String lName) {
	
}

public Patient(String fName, String mName, String lName, String adrs, String cit, String stat, String zip, String num, String eName, String eNum) {
	firstName=fName;
	middleName=mName;
	lastName=lName;
	address=adrs;
	city=cit;
	state=stat;
	zipCode=zip;
	phoneNumber=num;
	emName=eName;
	emNumber=eNum;
	//make sure all are correct
}

public String getfName() {return firstName;}
public String getmName() {return middleName;}
public String getlName() {return lastName;}
public String getadrs() {return address;}
public String getCit() {return city;}
public String getStat() {return state;}
public String getZip() {return zipCode;}
public String getNum() {return phoneNumber;}
public String getEmName() {return emName;}
public String getEmNum() {return emNumber;}

public void setfName(String fName) { firstName=fName;}
public void setmName(String mName) { middleName=mName;}
public void setlName(String lName) { lastName=lName;}
public void setAdrs(String adrs) { address=adrs;}
public void setCit(String cit) { city=cit;}
public void setStat(String stat) { state=stat;}
public void setZip(String zip) { zipCode=zip;}
public void setNum(String num) { phoneNumber=num;}
public void setEmName(String eName) { emName=eName;}
public void setEmNum(String eNum) { emNumber=eNum;}

public String buildFullName() {return firstName + " " + middleName + " " + lastName;}
public String buildAddress() {return address + " " + city + " " + state + " " + zipCode;}
public String buildEmergencyContact() {return emName + " " + emNumber;}
public String toString() {return buildFullName() + " " + buildAddress()+ " "+ buildEmergencyContact();   }
//will calling them like this work and should they be returns or prints
//should this be static
//do we need to use "this."
}
