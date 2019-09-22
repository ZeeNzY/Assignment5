package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.production.ProductionHouse;
import ac.za.cput.projects.repository.ProdHouseRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("InMemoryPh")
public class ProdHouseRepoImp implements ProdHouseRepository {

    private static ProdHouseRepoImp repository = null;
    private Map<String,ProductionHouse> productionHouse;

    private ProdHouseRepoImp(){
        this.productionHouse = new HashMap<>();
    }

    public static ProdHouseRepository getRepository(){
        if (repository == null) repository = new ProdHouseRepoImp();
        return repository;
    }


    public ProductionHouse create(ProductionHouse productionHouse){
        this.productionHouse.put(productionHouse.getProdhouseId(),productionHouse);
        return productionHouse;
    }

    public ProductionHouse read(String courseId){
        return this.productionHouse.get(productionHouse);
    }

    public void delete(String prodHouseId) {
        // find the course, delete it if it exist
    }

    public ProductionHouse update(ProductionHouse productionHouse){
       // this.productionHouse.replace(productionHouse.getProdhouseId(),productionHouse);
       return this.productionHouse.get(productionHouse.getProdhouseId());
    }


    public Set<ProductionHouse> getAll(){

        Collection<ProductionHouse> productionHouseCollection = this.productionHouse.values();
        Set<ProductionHouse> set = new HashSet<>();
        set.addAll(productionHouseCollection);
        return set;
    }
}
