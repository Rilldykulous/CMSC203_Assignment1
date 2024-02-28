
public class Patient {
	String first = new String();
	String middle = new String();
	String last = new String();
	String address = new String();
	String city = new String();
	String state = new String();
	int ZIP;
	String phoneNum = new String();
	String contactName = new String();
	String contactNum = new String();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//constructor methods
	public Patient() {
		
	}
	public Patient(String newFirst, String newMiddle, String newLast) {
		first = newFirst;
		middle = newMiddle;
		last = newLast;
	}
	public Patient(String newfirst, String newmiddle, String newlast, String newaddress, String newcity, String newstate, int newZIP, String newphoneNum, String newcontactName, String newcontactNum) {
		first = newfirst;
		middle = newmiddle;
		last = newlast;
		address = newaddress;
		city = newcity;
		state = newstate;
		ZIP = newZIP;
		phoneNum = newphoneNum;
		contactName = newcontactName;
		contactNum = newcontactNum;
	}
	//accessor methods ("getters")
	public String getFirstName() {
		return first;
	}
	public String getMiddleName() {
		return middle;
	}
	public String getLastName() {
		return last;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZIP(){
		return ZIP;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getContactName() {
		return contactName;
	}
	public String getContactNum() {
		return contactNum;
	}
	//mutator methods ("setters")
	public void setFirstName(String firstName) {
		first = firstName;
	}
	public void setLastName(String lastName) {
		last = lastName;
	}
	public void setmiddleName(String middleName) {
		middle = middleName;
	}
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	public void setCity(String newCity) {
		city = newCity;
	}
	public void setState(String newState) {
		state = newState;
	}
	public void setZIP(int newZIP) {
		ZIP = newZIP;
	}
	public void setPhoneNum(String newPhoneNum) {
		phoneNum = newPhoneNum;
	}
	public void setContactName(String newContact) {
		contactName = newContact;
	}
	public void setContactNum(String newContactNum) {
		contactNum = newContactNum;
	}
	public String buildFullName() {
		return first + " " + middle + " " + last;
	}
	public String buildAddress() {
		return address + " " + city + " " + state + " " + ZIP;
	}
	public String buildEmergencyContact() {
		return contactName + " " + contactNum;
	}
	public String toString() {
		System.out.println("Patient info: \n\t Name: " + buildFullName() + "\n\t Address: " + buildAddress() + "\n\t Emergency Contact: " + buildEmergencyContact());
		return buildFullName() + " " + buildAddress() + " " + buildEmergencyContact();
	}
}
