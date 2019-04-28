package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.repository.AgencyRepository;

import java.util.HashSet;
import java.util.Set;

public class AgencyRepoImp implements AgencyRepository {

    private static AgencyRepoImp repository = null;
    private Set<Agency> agency;

    private AgencyRepoImp(){
        this.agency = new HashSet<>();
    }

    public static AgencyRepository getRepository(){
        if (repository == null) repository = new AgencyRepoImp();
        return repository;
    }


    public Agency create(Agency agency){
        this.agency.add(agency);
        return agency;
    }

    public Agency read(String agency_id){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String agency_id) {
        // find the course, delete it if it exist

    }

    public Agency update(Agency agency){
        // find the course, update it and delete it if it exists
        return agency;
    }


    public Set<Agency> getAll(){
        return this.agency;
    }

}
