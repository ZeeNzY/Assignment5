package ac.za.cput.projects.factory.Persons;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;

public class EmployeesFactory {

    public static AgencyEmployee getEmployees(String emp_id,String name, String surname, String type, String position) {
        return new AgencyEmployee.Builder().emp_id(emp_id)
                .name(name)
                .surname(surname)
                .type(type)
                .position(position)
                .build();
    }

}
