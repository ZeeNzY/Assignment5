package ac.za.cput.projects.service.impl;

import ac.za.cput.projects.domain.Persons.Talent;
import ac.za.cput.projects.repository.TalentRepository;
import ac.za.cput.projects.service.TalentService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class TalentServiceImp implements TalentService {

    private TalentRepository repository;

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
