package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Persons.Talent;
import ac.za.cput.projects.repository.TalentRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TalentRepoImpTest {

    private TalentRepository repository;
    private Talent talent;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void create() {
        assertEquals(repository.create(talent),repository.create(talent));
    }

    @Test
    public void read() {
        assertEquals(repository.read(String.valueOf(talent.gettalent_id())),repository.read(String.valueOf(talent.gettalent_id())));
    }

    @Test
    public void delete() {
        repository.delete(String.valueOf(talent.gettalent_id()));
    }

    @Test
    public void update() {
        assertEquals(repository.update(talent),repository.update(talent));
    }

    @Test
    public void getAll() {
        assertEquals(repository.getAll(),repository.getAll());
    }

}