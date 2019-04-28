package ac.za.cput.projects.repository;

import ac.za.cput.projects.domain.production.ProductionHouse;

import java.util.Set;

public interface ProdHouseRepository extends MainRepository<ProductionHouse, String>{

    Set<ProductionHouse> getAll();

}
