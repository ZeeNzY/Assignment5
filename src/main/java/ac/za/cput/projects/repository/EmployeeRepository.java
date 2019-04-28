package ac.za.cput.projects.repository;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;

import java.util.Set;

public interface EmployeeRepository extends MainRepository<AgencyEmployee, String> {

    Set<AgencyEmployee> getAll();
}
