import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the employee name: ");
		String name = input.nextLine();
		emp.setName(name);
		
		System.out.print("Please enter the total work hours: ");
		double hours = input.nextDouble();
		emp.setHours(hours);
		
		emp.displayResult();
	}

}
