package practice17;

/*
2. Напишите реализацию программного кода, с использованием
паттерна MVC для расчета заработной платы сотрудника предприятия.
Предлагается использовать следующие классы.
o Класс Employee – сотрудник будет выступать в качестве слоя модели
o Класс EmployeeView будет действовать как слой представления.
o Класс EmployeeContoller будет действовать как уровень контроллера.
 */

import practice17.EmployeeController;
import practice17.EmployeeView;

public class MVCTask2 {
    private static Employee retriveEmployeeFromDatabase(){
        Employee Employee = new Employee();
        Employee.setName("Александр");
        Employee.setSalary(100000);
        return Employee;
    }

    public static void main(String[] args){
        Employee employee = retriveEmployeeFromDatabase();
        EmployeeView employeeView = new EmployeeView();
        EmployeeController employeeController = new EmployeeController(employee,employeeView);

        employeeController.updateView();
        employeeController.setEmployeeName("Михаил");
        employeeController.setEmployeeSalary(50000);
        System.out.println("\nВывод данных после обновления информации о сотруднике:\n");
        employeeController.updateView();
    }
}
