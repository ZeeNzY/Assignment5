package ac.za.cput.projects.service.impl;

import ac.za.cput.projects.domain.production.ProductionHouse;
import ac.za.cput.projects.repository.ProdHouseRepository;
import ac.za.cput.projects.service.ProdHouseService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service

public class ProdHouseServiceImp implements ProdHouseService {

    private ProdHouseRepository repository;

    @Override
    public ProductionHouse create(ProductionHouse productionHouse) {
        return repository.create(productionHouse);
    }

    @Override
    public ProductionHouse update(ProductionHouse productionHouse) {
        return repository.update(productionHouse);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public ProductionHouse read(String s) {
        return repository.read(s);
    }

    @Override
    public Set<ProductionHouse> getAll() {
        return repository.getAll();
    }
}
