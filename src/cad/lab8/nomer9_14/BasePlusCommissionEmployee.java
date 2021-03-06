package cad.lab8.nomer9_14;// Fig. 9.6: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class represents an employee that receives
// a base salary in addition to commission.

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName,
                                      String lastName,
                                      String socialSecurityNumber,
                                      double grossSales,
                                      double commissionRate,
                                      double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        setBaseSalary(baseSalary);
    } // end constructor

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // calculate earnings
    public double earnings() {
        return baseSalary + super.earnings();
    }

    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(), "commission rate", getCommissionRate(),
                "base salary", baseSalary);
    }
} // end class BasePlusCommissionEmployee


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
