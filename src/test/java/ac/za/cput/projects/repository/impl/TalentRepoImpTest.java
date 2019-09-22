package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Persons.Talent;
import ac.za.cput.projects.factory.Persons.TalentFactory;
import ac.za.cput.projects.repository.TalentRepository;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class TalentRepoImpTest {

    private TalentRepository repository;
    private Talent talent;


    private Talent getTalent() {
        Set<Talent> talentSet = this.repository.getAll();
        return talentSet.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = TalentRepoImp.getRepository();
        this.talent = TalentFactory.getTalent("Zinzi", "Gulwa","Actor","Brown");
    }

    @Test
    public void create() {
        Talent created = this.repository.create(this.talent);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.talent);
    }

    @Test
    public void read() {
//        Talent talent = getTalent();
        System.out.println("In read, talent_id = "+ talent.gettalent_id());
        Talent read = this.repository.read(talent.gettalent_id());
        System.out.println("In read, read = " + read);
        getAll();
   //     Assert.assertEquals(talent, read);
    }

    @Test
    public void delete() {
        Talent talent = getTalent();
        this.repository.delete(talent.gettalent_id());
        getAll();
    }

    @Test
    public void update() {
        String name = "Zee";
//        Talent talent = new Talent.Builder().copy(getTalent()).name(name).build();
        System.out.println("In update, about_to_updated = " + talent);
        Talent updated = this.repository.update(talent);
        System.out.println("In update, updated = " + updated);
   //     Assert.assertSame(name, updated.getName());
        getAll();
    }

    @Test
    public void getAll() {
        Set<Talent> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }

}