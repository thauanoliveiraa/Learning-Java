package entities;

public class EmployeeDataREMAKE2 {
    private Integer employeeID;
    private String employeeName;
    private Double employeeSalary;
    private double percentage;

    public EmployeeDataREMAKE2(Integer employeeID, String employeeName, Double employeeSalary){
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

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public Double getEmployeeSalary(){
        return employeeSalary;
    }

    public void setEmployeeSalary(){
        this.employeeSalary = employeeSalary;
    }

    public void percentageSalaryCalc(double percentage){
        employeeSalary += employeeSalary*(percentage/100);
    }

    @Override
    public String toString(){
        return "  ID : " + employeeID + "  NAME : " + employeeName+ "  ACTUAL SALARY : " + String.format("R$ %.2f ", employeeSalary) + "\n\n";
    }
}
