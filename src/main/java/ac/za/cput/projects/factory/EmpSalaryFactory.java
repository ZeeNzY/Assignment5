package ac.za.cput.projects.factory;


import ac.za.cput.projects.domain.EmpSalary;

public class EmpSalaryFactory {

    public static EmpSalary getEmpSalary(double salary) {
        return new EmpSalary.Builder().salary(salary)
                .build();
    }
}
