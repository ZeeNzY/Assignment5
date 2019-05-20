package ac.za.cput.projects.service.impl;

import ac.za.cput.projects.domain.production.Production;
import ac.za.cput.projects.repository.ProductionRepository;
import ac.za.cput.projects.service.ProductionService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class ProductionServiceImp implements ProductionService {

    private ProductionRepository repository;

    @Override
    public Production create(Production production) {
        return repository.create(production);
    }

    @Override
    public Production update(Production production) {
        return repository.update(production);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Production read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<Production> getAll() {
        return repository.getAll();
    }
}
