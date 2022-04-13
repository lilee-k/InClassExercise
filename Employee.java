
public class Employee {
	private String name;
	private double hours;
	private double totalPay=0;
	
	final int NORMAL_HOURLY_RATE = 15;
	final double OT_HOURLY_RATE = 16.5;
	
	//constructor only set name and hours
	public Employee() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHours(double hours) {
		this.hours = hours;
		setTotalPay();
	}

	//public Employee(String name, double hours) {
	//	this.name = name;
	//	this.hours = hours;
	//	}
	
	public void setTotalPay() {
		if (hours <=40) {
			totalPay = hours * NORMAL_HOURLY_RATE;
		}
		else {
			totalPay = 40*NORMAL_HOURLY_RATE + (hours-40)*OT_HOURLY_RATE;
		}
	}
	
	public double getTotalPay() {
		return totalPay;
	}

	public void displayResult() {
		System.out.println("Total wage: $" + totalPay);
	}
	
}
