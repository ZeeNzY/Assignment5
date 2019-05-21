package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.repository.AgencyRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("InMemoryA")
public class AgencyRepoImp implements AgencyRepository {

    private static AgencyRepoImp repository = null;
    private Map<String,Agency> agency;

    private AgencyRepoImp(){
        this.agency = new HashMap<>();
    }

    public static AgencyRepository getRepository(){
        if (repository == null) repository = new AgencyRepoImp();
        return repository;
    }


    public Agency create(Agency agency){
        this.agency.put(agency.getAgencyId(),agency);
        return agency;
    }

    public Agency read(String agency_id){
        return this.agency.get(agency_id);
    }

    public void delete(String agency_id) {
        this.agency.remove(agency_id);
    }

    public Agency update(Agency agency){
        repository.agency.replace(agency.getAgencyId(),agency);
        return this.agency.get(agency.getAgencyId());
    }


    public Set<Agency> getAll(){
        Collection<Agency> agencyCollection = this.agency.values();
        Set<Agency> set = new HashSet<>();
        set.addAll(agencyCollection);
        return set;
    }

}
