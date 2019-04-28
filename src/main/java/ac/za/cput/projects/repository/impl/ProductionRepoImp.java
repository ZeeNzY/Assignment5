package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.Production;
import ac.za.cput.projects.repository.ProductionRepository;

import java.util.HashSet;
import java.util.Set;

public class ProductionRepoImp implements ProductionRepository {

    private static ProductionRepoImp repository = null;
    private Set<Production> production;

    private ProductionRepoImp(){
        this.production = new HashSet<>();
    }

    public static ProductionRepository getRepository(){
        if (repository == null) repository = new ProductionRepoImp();
        return repository;
    }


    public Production create(Production production){
        this.production.add(production);
        return production;
    }

    public Production read(String productionId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String productionId) {
        // find the course, delete it if it exist
    }

    public Production update(Production production){
        // find the course, update it and delete it if it exists
        return production;
    }


    public Set<Production> getAll(){
        return this.production;
    }

}
