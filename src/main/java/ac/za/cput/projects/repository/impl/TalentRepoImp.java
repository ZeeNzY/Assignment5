package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Persons.Talent;
import ac.za.cput.projects.repository.TalentRepository;

import java.util.HashSet;
import java.util.Set;

public class TalentRepoImp implements TalentRepository {

    private static TalentRepoImp repository = null;
    private Set<Talent> talent;

    private TalentRepoImp() {
        this.talent = new HashSet<>();
    }

    public static TalentRepository getRepository(){
        if (repository == null) repository = new TalentRepoImp();
        return repository;
    }

    public Talent create(Talent talent){
        this.talent.add(talent);
        return talent;
    }

    public Talent read(String talentId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Talent update(Talent talent) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String talentId) {
        //find the student and delete it if it exists

    }

    public Set<Talent> getAll(){
        return this.talent;
    }

}
