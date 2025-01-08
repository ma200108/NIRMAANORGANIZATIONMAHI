package Day13;

public class EmployeeDetails {

	    public static void main(String[] args) {
	       
	        employee emp1 = new employee();

	        emp1.setEmployeename("John");
	        emp1.setEmployeeid("E12345");
	        emp1.setEmployeesalary(75000.00);
	        emp1.setEmployeephonenumber(1234567890L);

	    
	        System.out.println(emp1.toString());
	    }
	}

