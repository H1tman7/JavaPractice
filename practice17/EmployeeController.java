package practice17;

public class EmployeeController {
    private Employee employee;
    private EmployeeView employeeView;

    EmployeeController(Employee employee, EmployeeView employeeView){
        this.employee = employee;
        this.employeeView = employeeView;
    }

    public void setEmployeeName(String name){
        employee.setName(name);
    }

    public void setEmployeeSalary(int salary){
        employee.setSalary(salary);
    }

    public String getEmployeeName(){
        return employee.getName();
    }

    public int getEmployeeSalary(){
        return employee.getSalary();
    }

    public void updateView(){
        employeeView.printEmployeeData(employee.getName(), employee.getSalary());
    }
}
