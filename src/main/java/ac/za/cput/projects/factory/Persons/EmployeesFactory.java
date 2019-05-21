package ac.za.cput.projects.factory.Persons;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.util.Misc;

public class EmployeesFactory {

    public static AgencyEmployee getEmployees(String name, String surname,String position) {
        return new AgencyEmployee.Builder().emp_id(Misc.generateId())
                .name(name)
                .surname(surname)
                .position(position)
                .build();
    }

}
