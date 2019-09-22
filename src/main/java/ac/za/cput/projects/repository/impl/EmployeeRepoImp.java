package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("InMemoryE")
public class EmployeeRepoImp implements EmployeeRepository {

    private Set<AgencyEmployee> employees;
    private static EmployeeRepository employeeRepository;

    private EmployeeRepoImp() {
        this.employees = new HashSet<>();
    }

    public static EmployeeRepository getEmployeeRepository() {
        if (employeeRepository == null) employeeRepository = new EmployeeRepoImp();
        return employeeRepository;
    }


    @Override
    public AgencyEmployee create(AgencyEmployee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public AgencyEmployee read(String s) {
        AgencyEmployee employee = this.employees.stream()
                .filter(e -> e.getName().equalsIgnoreCase(s))
                .findAny().orElse(null);
        return employee;
    }

    @Override
    public AgencyEmployee update(AgencyEmployee employee) {
        AgencyEmployee emp = read(employee.getName());
        if (emp != null) {
            AgencyEmployee updated = new AgencyEmployee.Builder().copy(emp)
                    .name(employee.getName())
                    .build();
            delete(emp.getName());
            this.employees.add(updated);
            emp = updated;
        }
        return emp;
    }

    @Override
    public void delete(String s) {
        AgencyEmployee employee = read(s);
        this.employees.remove(employee);
    }


    public Set<AgencyEmployee> getAll(){
        Collection<AgencyEmployee> agencyEmployeeCollection = this.employees;
        Set<AgencyEmployee> set = new HashSet<>();
        set.addAll(agencyEmployeeCollection);
        return set;
    }
}
