package ac.za.cput.projects.service.impl;

import ac.za.cput.projects.domain.Persons.AgencyEmployee;
import ac.za.cput.projects.repository.EmployeeRepository;
import ac.za.cput.projects.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class EmployeeServiceImp implements EmployeeService {

    private EmployeeRepository repository;

    @Override
    public AgencyEmployee create(AgencyEmployee agencyEmployee) {
        return repository.create(agencyEmployee);
    }

    @Override
    public AgencyEmployee update(AgencyEmployee agencyEmployee) {
        return repository.update(agencyEmployee);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public AgencyEmployee read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<AgencyEmployee> getAll() {
        return repository.getAll();
    }
}
