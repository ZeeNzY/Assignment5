package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.Production;
import ac.za.cput.projects.repository.ProductionRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("InMemoryP")
public class ProductionRepoImp implements ProductionRepository {

    private static ProductionRepoImp repository = null;
    private Map<String, Production> production;

    private ProductionRepoImp(){
        this.production = new HashMap<>();
    }

    public static ProductionRepository getRepository(){
        if (repository == null) repository = new ProductionRepoImp();
        return repository;
    }


    public Production create(Production production){
        this.production.put(production.getProduction_id(),production);
        return production;
    }

    public Production read(String productionId){
        return this.production.get(productionId);
    }

    public void delete(String productionId) {
        this.production.remove(productionId);
    }

    public Production update(Production production){
        this.production.replace(production.getProduction_id(),production);
        return this.production.get(production.getProduction_id());
    }


    public Set<Production> getAll(){
        Collection<Production> productionCollection = this.production.values();
        Set<Production> set = new HashSet<>();
        set.addAll(productionCollection);
        return set;
    }

}
