package Day13;

class employee {
 
	        private String  employeename;
			private String employeeid;
			private double employeesalary;
			private long  employeephonenumber;
			
	public String getEmployeename() {
				return employeename;
			}

			public void setEmployeename(String employeename) {
				this.employeename = employeename;
			}

			public String getEmployeeid() {
				return employeeid;
			}

			public void setEmployeeid(String employeeid) {
				this.employeeid = employeeid;
			}

			public double getEmployeesalary() {
				return employeesalary;
			}

			public void setEmployeesalary(double employeesalary) {
				this.employeesalary = employeesalary;
			}

			public long getEmployeephonenumber() {
				return employeephonenumber;
			}

			public void setEmployeephonenumber(long employeephonenumber) {
				this.employeephonenumber = employeephonenumber;
			}

			@Override
			public String toString() {
				return "EmployeeDetails\nemployeename=" + employeename + ", \nemployeeid=" + employeeid + ", \nemployeesalary="
						+ employeesalary + ", \nemployeephonenumber=" + employeephonenumber + " ";
			}


}
