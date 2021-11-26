package cad.lab2.nomer3_13;

/*
Создайте класс Employee, который включает три переменные экземпляра - имя (тип String),
фамилию (тип String) и месячную зарплату (double). Предоставьте конструктор,
который инициализирует три переменные экземпляра. Предоставьте метод set
и get для каждой переменной экземпляра. Если месячная зарплата не является положительной,
не задавайте ее значение. Напишите тестовое приложение с именем EmployeeTest,
которое демонстрирует возможности класса Employee. Создайте два объекта Employee
и отобразите годовую зарплату каждого объекта. Затем повысьте зарплату каждого сотрудника на 10%
и снова выведите годовую зарплату каждого сотрудника.
*/
public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alexei", "Kukushkin", 6000);
        Employee employee2 = new Employee("Matvei", "Bezrukov", 10000);

        printEmployee(employee1);
        printEmployee(employee2);

        System.out.println();

        printEmployeesYearSalary(employee1);
        printEmployeesYearSalary(employee2);

        System.out.println();

        raiseSalary(employee1, 0.1);
        printEmployeesYearSalary(employee1);

        raiseSalary(employee2, 0.1);
        printEmployeesYearSalary(employee2);
    }

    public static void printEmployee(Employee employee) {
        String description = "Employee: " + employee.getFirstName() + " "
                + employee.getLastName() + " has salary " + employee.getMonthlySalary();

        System.out.println(description);
    }

    public static void printEmployeesYearSalary(Employee employee) {
        double yearSalary = employee.getMonthlySalary() * 12;
        System.out.println("Employee " + employee.getFirstName() + " has year salary " + yearSalary);
    }

    public static void raiseSalary(Employee employee, double raise) {
        if (raise > 0) {
            double monthlySalary = employee.getMonthlySalary();
            employee.setMonthlySalary(monthlySalary * (1 + raise));
        }
    }
}
