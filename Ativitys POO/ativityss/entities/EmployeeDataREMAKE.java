package entities;

public class EmployeeDataREMAKE {
    private Integer employeeID;
    private String employeeName;
    private Double employeeSalary;

    public EmployeeDataREMAKE(Integer employeeID, String employeeName, Double employeeSalary){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public Integer getEmployeeID(){
        return employeeID;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public Double getEmployeeSalary(){
        return employeeSalary;
    }

    public static void chooseSalary(double percentage){
        employeeSalary += employeeSalary * (percentage /100);
    }

    @Override
    public String toString(){
        return "  ID : " + employeeID + "  NAME : " + employeeName+ "  ACTUAL SALARY : " + String.format("R$ %.2f ", employeeSalary) + "\n\n";
    }
}
