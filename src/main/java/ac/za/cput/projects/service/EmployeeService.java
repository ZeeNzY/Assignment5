package ac.za.cput.projects.service;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;

import java.util.Set;

public interface EmployeeService extends IService<AgencyEmployee, String> {
    Set<AgencyEmployee> getAll();
}
