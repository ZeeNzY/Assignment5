package ac.za.cput.projects.service.impl;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.repository.AgencyRepository;
import ac.za.cput.projects.repository.impl.AgencyRepoImp;
import ac.za.cput.projects.service.AgencyService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class AgencyServiceImp implements AgencyService {

    private AgencyRepository repository;
    private static AgencyServiceImp service = null;

    private AgencyServiceImp(){
        this.repository = AgencyRepoImp.getRepository();
    }

    public static AgencyServiceImp getService(){
        if (service == null) service = new AgencyServiceImp();
        return service;
    }

    @Override
    public Agency create(Agency agency) {
        return repository.create(agency);
    }

    @Override
    public Agency update(Agency agency) {
        return repository.update(agency);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Agency read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Agency> getAll() {
        return repository.getAll();
    }

}
