
public class PatientDriverApp {

	public static void main(String[] args) {
		Patient patient = new Patient("Gosley/Samantha", "Mathiascheck", "Brodkin", "123 Main Street", "Silver Spring", "MD", 20902, "534-211-7067", "Jade Lillian Palosky", "515-929-3459"); 
		Procedure potato = new Procedure();
		Procedure checkup = new Procedure("checkup", "February 12th, 2023");
		Procedure applesauce = new Procedure("X-ray", "October 31st, 2015", "Dr. Phil Betterson", 1660);
		potato.setPractitioner("Dr. Joe Schmo");
		potato.setDate("February 11th, 2003");
		potato.setName("C-section");
		potato.setCost(20000);
		checkup.setPractitioner("Dr. Fred Smith");
		checkup.setCost(2500);
		displayPatient(patient);
		displayProcedure(potato);
		displayProcedure(checkup);
		displayProcedure(applesauce);
		calculateTotalCharges(potato, checkup, applesauce);
		System.out.print("Student Name: Gosley/Samantha Brodkin \nMC#: M21125173\nDue date: 2/27/2024");
	}
	public static void displayPatient (Patient patient) {
		patient.toString();
	}
	public static void displayProcedure (Procedure procedure) {
		procedure.toString();
	}
	public static double calculateTotalCharges(Procedure proc1, Procedure proc2, Procedure proc3) {
		double x=proc1.getCost()+proc2.getCost()+proc3.getCost();
		System.out.printf("Total charges: $%.2f\n\n", x);
		return x;
	}
}
