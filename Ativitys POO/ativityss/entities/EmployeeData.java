package entities;

public class EmployeeData {
    private Integer employeeID;
    private String employeeName;
    private Double employeeWage;
    private int porcentage;

    public EmployeeData(Integer employeeID, String employeeName, Double employeeWage){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeWage = employeeWage;

    }

    public int getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeID(Integer empoloyeeID){
        this.employeeID = employeeID;
    }
    
    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public double getEmployeeWage(){
        return employeeWage;
    }

    public void  porcentageEmployeeWage(double porcentage){
        employeeWage += employeeWage*(porcentage/100);
    }

    @Override
	public String toString() {
		return "  ID : " + employeeID + "  NAME : " + employeeName+ "  ACTUAL WAGE : " + String.format("R$ %.2f ", employeeWage) + "\n\n";
	}
}