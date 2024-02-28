public class Procedure {
	String name = new String();
	String date = new String();
	String practitioner = new String();
	double cost;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Procedure(){
		
	}
	public Procedure(String newName, String newDate) {
		name = newName;
		date = newDate;
	}
	public Procedure(String newName, String newDate, String newPractitioner, double newCost) {
		name = newName;
		date = newDate;
		practitioner = newPractitioner;
		cost = newCost;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public String getPractitioner() {
		return practitioner;
	}
	public double getCost() {
		return cost;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setDate(String newDate) {
		date = newDate;
	}
	public void setPractitioner(String newPractitioner) {
		practitioner = newPractitioner;
	}
	public void setCost (double newCost) {
		cost = newCost;
	}
	public String toString() {
		//TODO: Make this format our cost properly
		System.out.printf("\t\tProcedure: " + name + "\n\t\tProcedure date: " + date + "\n\t\tPractitioner: " + practitioner + "\n\t\tCost: " + "$%.2f\n\n", cost);
		return name + " " + date + " " + practitioner + " " + "$" + cost;
	}
}
