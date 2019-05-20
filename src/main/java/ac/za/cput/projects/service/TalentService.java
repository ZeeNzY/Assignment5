package ac.za.cput.projects.service;

import ac.za.cput.projects.domain.Persons.Talent;

import java.util.Set;

public interface TalentService extends IService<Talent, String>{
        Set<Talent> getAll();
}
