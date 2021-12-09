package cad.lab8.nomer9_15;

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 40, 20);

        System.out.println(
                "Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",
                employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
                employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f$ %s %n", "Earnings are", employee.earnings(), "per week");

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString", employee);
    }
}