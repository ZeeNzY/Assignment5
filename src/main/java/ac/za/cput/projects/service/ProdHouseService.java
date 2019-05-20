package ac.za.cput.projects.service;

import ac.za.cput.projects.domain.production.ProductionHouse;

import java.util.Set;

public interface ProdHouseService extends IService<ProductionHouse,String> {
    Set<ProductionHouse> getAll();
}
