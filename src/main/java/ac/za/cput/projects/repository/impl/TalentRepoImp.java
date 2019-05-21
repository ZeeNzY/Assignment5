package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Persons.Talent;
import ac.za.cput.projects.repository.TalentRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("InMemoryT")
public class TalentRepoImp implements TalentRepository {

    private static TalentRepoImp repository = null;
    private Map<String,Talent> talent;

    private TalentRepoImp() {
        this.talent = new HashMap<>();
    }

    public static TalentRepository getRepository(){
        if (repository == null) repository = new TalentRepoImp();
        return repository;
    }

    public Talent create(Talent talent){
        this.talent.put(talent.gettalent_id(),talent);
        return talent;
    }

    public Talent read(String talentId){
        return this.talent.get(talentId);
    }

    public Talent update(Talent talent) {
        this.talent.replace(talent.gettalent_id(),talent);
        return this.talent.get(talent.gettalent_id());
    }

    public void delete(String talentId) {
        this.talent.remove(talentId);
    }

    public Set<Talent> getAll(){
        Collection<Talent> talentCollection = this.talent.values();
        Set<Talent> set = new HashSet<>();
        set.addAll(talentCollection);
        return set;
    }

}
