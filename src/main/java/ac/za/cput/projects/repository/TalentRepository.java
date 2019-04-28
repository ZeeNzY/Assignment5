package ac.za.cput.projects.repository;

import ac.za.cput.projects.domain.Persons.Talent;

import java.util.Set;

public interface TalentRepository extends MainRepository<Talent, String>{

    Set<Talent> getAll();

}
