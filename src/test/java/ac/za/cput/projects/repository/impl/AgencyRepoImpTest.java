package ac.za.cput.projects.repository.impl;

import ac.za.cput.projects.domain.Agency;
import ac.za.cput.projects.repository.AgencyRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgencyRepoImpTest {

    private AgencyRepository repository;
    private Agency agency;

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
        assertEquals(repository.create(agency),repository.create(agency));
    }

    @Test
    public void read() {
        assertEquals(repository.read(agency.getAgencyId()),repository.read(agency.getAgencyId()));
    }

    @Test
    public void delete() {
        repository.delete(agency.getAgencyId());
    }

    @Test
    public void update() {
        assertEquals(repository.update(agency),repository.update(agency));
    }

    @Test
    public void getAll() {
        assertEquals(repository.getAll(),repository.getAll());
    }
}