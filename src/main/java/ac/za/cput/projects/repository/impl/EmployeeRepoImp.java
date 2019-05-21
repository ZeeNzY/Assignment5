package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("InMemoryE")
public class EmployeeRepoImp implements EmployeeRepository {

    private static EmployeeRepoImp repository = null;
    private Map<String,AgencyEmployee> agencyEmployee;

    private EmployeeRepoImp(){
        this.agencyEmployee = new HashMap<>();
    }

    public static EmployeeRepository getRepository(){
        if (repository == null) repository = new EmployeeRepoImp();
        return repository;
    }


    public AgencyEmployee create(AgencyEmployee agencyEmployee){
        this.agencyEmployee.put(agencyEmployee.getEmp_id(),agencyEmployee);
        return agencyEmployee;
    }

    public AgencyEmployee read(String employeeId){
        return this.agencyEmployee.get(employeeId);
    }

    public void delete(String employeeId) {
        this.agencyEmployee.remove(employeeId);    }

    public AgencyEmployee update(AgencyEmployee agencyEmployee){
        this.agencyEmployee.replace(agencyEmployee.getEmp_id(),agencyEmployee);
        return this.agencyEmployee.get(agencyEmployee.getEmp_id());
    }


    public Set<AgencyEmployee> getAll(){
        Collection<AgencyEmployee> agencyEmployeeCollection = this.agencyEmployee.values();
        Set<AgencyEmployee> set = new HashSet<>();
        set.addAll(agencyEmployeeCollection);
        return set;
    }
}
