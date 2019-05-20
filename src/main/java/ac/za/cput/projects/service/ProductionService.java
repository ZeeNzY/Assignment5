package ac.za.cput.projects.service;

import ac.za.cput.projects.domain.production.Production;

import java.util.Set;

public interface ProductionService extends IService<Production,String>{
        Set<Production> getAll();

}
