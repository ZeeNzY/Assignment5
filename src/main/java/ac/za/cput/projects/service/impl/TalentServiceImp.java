package ac.za.cput.projects.service.impl;

import ac.za.cput.projects.domain.Persons.Talent;
import ac.za.cput.projects.repository.TalentRepository;
import ac.za.cput.projects.repository.impl.TalentRepoImp;
import ac.za.cput.projects.service.TalentService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class TalentServiceImp implements TalentService {

    private TalentRepository repository;
    private static TalentServiceImp service = null;

    private TalentServiceImp(){
        this.repository = TalentRepoImp.getRepository();
    }

    public static TalentServiceImp getService(){
        if (service == null) service = new TalentServiceImp();
        return service;
    }

    @Override
    public Talent create(Talent talent) {
        return repository.create(talent);
    }

    @Override
    public Talent update(Talent talent) {
        return repository.update(talent);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Talent read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Talent> getAll() {
        return repository.getAll();
    }
}
