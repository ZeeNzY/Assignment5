package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.ProductionHouse;
import ac.za.cput.projects.repository.ProdHouseRepository;

import java.util.HashSet;
import java.util.Set;

public class ProdHouseRepoImp implements ProdHouseRepository {

    private static ProdHouseRepoImp repository = null;
    private Set<ProductionHouse> productionHouse;

    private ProdHouseRepoImp(){
        this.productionHouse = new HashSet<>();
    }

    public static ProdHouseRepository getRepository(){
        if (repository == null) repository = new ProdHouseRepoImp();
        return repository;
    }


    public ProductionHouse create(ProductionHouse productionHouse){
        this.productionHouse.add(productionHouse);
        return productionHouse;
    }

    public ProductionHouse read(String courseId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String prodHouseId) {
        // find the course, delete it if it exist
    }

    public ProductionHouse update(ProductionHouse productionHouse){
        // find the course, update it and delete it if it exists
        return productionHouse;
    }


    public Set<ProductionHouse> getAll(){
        return this.productionHouse;
    }
}
