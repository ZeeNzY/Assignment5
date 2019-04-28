package ac.za.cput.projects.repository;

import ac.za.cput.projects.domain.production.Production;

import java.util.Set;

public interface ProductionRepository extends MainRepository<Production, String> {

    Set<Production> getAll();

}
