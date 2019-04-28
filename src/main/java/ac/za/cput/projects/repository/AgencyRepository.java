package ac.za.cput.projects.repository;

import ac.za.cput.projects.domain.Agency;

import java.util.Set;

public interface AgencyRepository extends MainRepository<Agency, String>{

    Set<Agency> getAll();

}
