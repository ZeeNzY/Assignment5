package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.repository.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepoImp implements EmployeeRepository {

    private static EmployeeRepoImp repository = null;
    private Set<AgencyEmployee> agencyEmployee;

    private EmployeeRepoImp(){
        this.agencyEmployee = new HashSet<>();
    }

    public static EmployeeRepository getRepository(){
        if (repository == null) repository = new EmployeeRepoImp();
        return repository;
    }


    public AgencyEmployee create(AgencyEmployee agencyEmployee){
        this.agencyEmployee.add(agencyEmployee);
        return agencyEmployee;
    }

    public AgencyEmployee read(String employeeId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String employeeId) {
        // find the course, delete it if it exist
    }

    public AgencyEmployee update(AgencyEmployee agencyEmployee){
        // find the course, update it and delete it if it exists
        return agencyEmployee;
    }


    public Set<AgencyEmployee> getAll(){
        return this.agencyEmployee;
    }
}
