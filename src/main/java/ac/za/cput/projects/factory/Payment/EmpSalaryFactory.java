package ac.za.cput.projects.factory.Payment;


import ac.za.cput.projects.domain.payments.EmpSalary;

public class EmpSalaryFactory {

    public static EmpSalary getEmpSalary(double salary) {
        return new EmpSalary.Builder().salary(salary)
                .build();
    }
}
