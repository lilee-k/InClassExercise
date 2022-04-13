import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class EmployeeTest {	
	
	@Test
	void testSetTotalPay() {
		
		Employee emptest = new Employee();
		double hrs = 35;
		emptest.setHours(hrs);
		assertEquals(525.0,emptest.getTotalPay());
		
		hrs = 48;
		emptest.setHours(hrs);
		assertEquals(732.0,emptest.getTotalPay());
		
	}

}
