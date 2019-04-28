package ac.za.cput.projects.factory;

import Employees;

public class EmployeesFactory {

    public static Employees getEmployees(String empNum, String position) {
        return new Employees.Builder().empNum(empNum)
                .position(position)
                .build();
    }

}
