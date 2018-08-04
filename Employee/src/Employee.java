// Class for calculating the Salary of an Employee

public class Employee {

	// Instance members of the class
	private static int counter = 1;// Static Variable for setting the unique id to the Employee
	private int id = 0;
	private String name = null;
	private double monthlyBasic;
	private static float PFRate = 0.10f;
	private double HRA;
	private final static int CA = 800;
	private final static int medicalAllowance = 1250;
	private double PF;
	private double ESIC;
	private double professionalTax;

	// parameterized Constructor to initialize the instance members of the class
	public Employee(String name, double monthlyBasic) {
		id = id + counter;
		counter++;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
		HRA = 0.50 * monthlyBasic;
		setESIC();
		setPF();
		setProfessionalTax();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", monthlyBasic=" + monthlyBasic + ", HRA=" + HRA + ", PF="
				+ PF + ", ESIC=" + ESIC + ", professionalTax=" + professionalTax + ", getName()=" + getName()
				+ ", getAnnualBasic()=" + getAnnualBasic() + ", getMonthlyGrossSalary()=" + getMonthlyGrossSalary()
				+ ", getHRA()=" + getHRA() + ", getAnnualGrossSalary()=" + getAnnualGrossSalary()
				+ ", getMonthlyDeduction()=" + getMonthlyDeduction() + ", getProfessionalTax()=" + getProfessionalTax()
				+ ", getESIC()=" + getESIC() + ", getMonthlyTakeHome()=" + getMonthlyTakeHome()
				+ ", getAnnualTakeHome()=" + getAnnualTakeHome() + ", getPFRate()=" + getPFRate() + ", getPF()="
				+ getPF() + "]";
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

	public String getName() {
		return name;
	}

	public double getAnnualBasic() {
		return 12 * monthlyBasic;
	}

	public double getMonthlyGrossSalary() {
		return monthlyBasic + getHRA() + medicalAllowance + CA;
	}

	private double getHRA() {
		return .50 * monthlyBasic;
	}

	public double getAnnualGrossSalary() {
		return 12 * getMonthlyGrossSalary();
	}

	public double getMonthlyDeduction() {
		return getPF() + getESIC() + getProfessionalTax();
	}

	private double getProfessionalTax() {
		return getMonthlyGrossSalary() <= 10000 ? 50 : 100;
	}

	private void setProfessionalTax() {
		professionalTax = getMonthlyGrossSalary() <= 10000 ? 50 : 100;
	}

	private double getESIC() {
		return 0.0475 * monthlyBasic <= 5000 ? 0.0475 * monthlyBasic : 0;
	}

	private void setESIC() {
		ESIC = 0.0475 * monthlyBasic <= 5000 ? 0.0475 * monthlyBasic : 0;
	}

	public double getMonthlyTakeHome() {
		return getMonthlyGrossSalary() - getMonthlyDeduction();
	}

	public double getAnnualTakeHome() {
		return 12 * getMonthlyTakeHome();
	}

	public void setPFRate(float PFRate) {
		this.PFRate = PFRate;
	}

	public float getPFRate() {
		return PFRate;
	}

	public double getPF() {
		return PFRate * monthlyBasic > 6500 ? 6500 : PFRate * monthlyBasic;
	}

	public void setPF() {
		PF = PFRate * monthlyBasic > 6500 ? 6500 : PFRate * monthlyBasic;
	}

}
