public class Exercise02 {

	public static void main(String[] args) {
		String employeeName = "Peter Medison";
		float salary = 20000;
		float stateTaxes = Math.round(((salary/100) * 28.4f));
		float netSalary, personalTax;
		
		if(salary - stateTaxes - 7000 > 0) {
			personalTax  = Math.round(((salary - stateTaxes - 7000)/100)*10);
			netSalary = Math.round(salary - stateTaxes - personalTax);
		} else {
			personalTax = 0;
			netSalary = Math.round(personalTax - stateTaxes);
		}
		
		System.out.println("The employee " + employeeName + " with a gross salary of " + salary + " MKD. Will get a NET salary: " + netSalary);
		System.out.println("\nState taxes are: " + stateTaxes);
		System.out.println("\nPersonal tax is: " + personalTax);

	}

}
